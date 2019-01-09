package com.qust.exam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.AccountBiz;
import com.qust.exam.biz.AdminBiz;
import com.qust.exam.entity.Taccount;
import com.qust.exam.entity.Tnotice;
import com.qust.exam.exception.ObjectNullException;

public class LoginSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public LoginSvl() {
		super();
	}


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  request.getRequestDispatcher("pages/login.jsp").forward(request, response);
		
		
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	         String account = request.getParameter("account");
	         String pwd = request.getParameter("pwd");
	        String  role =request.getParameter("role");
	      
            AccountBiz ab=new AccountBiz();
            AdminBiz biz=new AdminBiz();
            String path = "";
    
           try {
			Taccount a=ab.login(account, pwd, role);
			request.getSession().setAttribute("account", a);
			if(a.getRole()==1){
		       path="admin/admin.jsp";	
		      
			}else if(a.getRole()==2){
				path="teacher/teacher.jsp";
			}else if (a.getRole()==3){
				path="student/student.jsp";
			}
			Object a1=request.getSession().getAttribute("account");		
		    request.setAttribute("a", a1);
		    
		    List<Tnotice> notice=biz.queryallnotice();
			   request.setAttribute("notice", notice);		   
			   request.setAttribute("title", "������Ϣ");
			   request.setAttribute("path", "notice1.jsp");
			   
		} catch (ObjectNullException e) {
			request.setAttribute("msg", e.getMessage());
			path = "pages/login.jsp";
		} catch (Exception e) {
			request.setAttribute("msg", "�����µ�¼");
			path = "error/loginerror.jsp";
		}
           request.getRequestDispatcher(path).forward(request, response);
	     
	        
		}


	
	public void init() throws ServletException {
		// Put your code here
	}

}
