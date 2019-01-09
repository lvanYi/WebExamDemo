package com.qust.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.AdminBiz;
import com.qust.exam.entity.Tclass;
import com.qust.exam.exception.ObjectNullException;

public class EditClassSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	/**
	 * Constructor of the object.
	 */
	public EditClassSvl() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String classno = request.getParameter("classno");
		request.getSession().setAttribute("admin", classno);
		AdminBiz biz = new AdminBiz();
		try {
			Tclass c = biz.checkclass(classno);
			request.setAttribute("c", c);
		} catch (ObjectNullException e) {
			e.printStackTrace();
		} catch (Exception e) {
			request.setAttribute("msg", "����δ֪��������ϵ����Ա");
			String path = "error/error.jsp";
			request.getRequestDispatcher(path).forward(request, response);	
		}
		request.setAttribute("title", "�༶��Ϣ�༭");
		request.setAttribute("path", "editclass.jsp");
		Object a1=request.getSession().getAttribute("account");		
	    request.setAttribute("a", a1);
		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);

		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "";	
		Object c=request.getSession().getAttribute("admin");
		String classno=(String) c;
		String classname1=request.getParameter("classname");
		String classname= new String(classname1.getBytes("iso-8859-1"),"GBK");
		String isgraduate= request.getParameter("isgraduate");
		 Tclass cla = new Tclass();
		 
		 cla.setClassno(classno);
		 cla.setClassname(classname);
		 cla.setIsgraduate(isgraduate);
	
		AdminBiz biz=new AdminBiz();
		try {
			    biz.editclass(cla);			 
        
    			request.setAttribute("path", "class.jsp");
    			request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
              
			} catch (Exception e) {
				request.setAttribute("msg", "����δ֪��������ϵ����Ա");
				path = "error/error.jsp";
				request.getRequestDispatcher(path).forward(request, response);
			}

		
	}



	
	public void init() throws ServletException {
		// Put your code here
	}

}
