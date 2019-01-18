package com.qust.exam.controller.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.StudentBiz;
import com.qust.exam.entity.Taccount;
import com.qust.exam.entity.Tstudent;
import com.qust.exam.exception.ObjectNullException;

public class PersonInfoSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public PersonInfoSvl() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Taccount user =  (Taccount) request.getSession().getAttribute("account");  
	    String sno=user.getUno();
	    StudentBiz biz=new StudentBiz();
	    
		try {
			Tstudent s = biz.checkstudent(sno);
			request.setAttribute("s", s);
		} catch (ObjectNullException e) {
			e.printStackTrace();
		} catch (Exception e) {
			request.setAttribute("msg", "����δ֪��������ϵ����Ա");
			String path = "error.jsp";
			request.getRequestDispatcher(path).forward(request, response);	
		}
		request.setAttribute("title", "ά��������Ϣ");
		request.setAttribute("path", "personinfo.jsp");
		Object a1=request.getSession().getAttribute("account");		
	    request.setAttribute("a", a1);
		request.getRequestDispatcher("student.jsp").forward(request, response);	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String path = "";	
		Taccount user =  (Taccount) request.getSession().getAttribute("account");  
	    String sno=user.getUno();
		
		String scontact=request.getParameter("scontact");
		String semail=request.getParameter("semail");
		
		String saddress=request.getParameter("saddress");
		
		Tstudent stu=new Tstudent();
 
		stu.setSno(sno);
		stu.setSaddress(saddress);
	    
		stu.setSemail(semail);
		stu.setScontact(scontact);
       
		StudentBiz biz=new StudentBiz();
		try {		    			 
        	biz.editstudent(stu);
			request.setAttribute("path", "success.jsp");
			request.getRequestDispatcher("student.jsp").forward(request, response);
              
		} catch (Exception e) {
			request.setAttribute("msg", "����δ֪��������ϵ����Ա");
			path = "error.jsp";
			request.getRequestDispatcher(path).forward(request, response);
		}
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
