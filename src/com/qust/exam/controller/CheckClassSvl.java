package com.qust.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.AdminBiz;
import com.qust.exam.entity.Tclass;
import com.qust.exam.exception.ObjectNullException;

public class CheckClassSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Constructor of the object.
	 */
	public CheckClassSvl() {
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

		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String classno=request.getParameter("no");
		if(classno !=null && !classno.equals("")){
		AdminBiz biz=new AdminBiz();
		try{
			Tclass c = biz.checkclass(classno);
			request.setAttribute("c", c);
			
		}catch (ObjectNullException e) {
			e.printStackTrace();
		}catch(Exception e){
			request.setAttribute("msg", "����δ֪��������ϵ����Ա");
			String path = "error/error.jsp";
			request.getRequestDispatcher(path).forward(request, response);		
		}
		request.setAttribute("title", "�༶��Ϣ��ѯ");
		request.setAttribute("path", "classinfo.jsp");
		Object a1=request.getSession().getAttribute("account");		
	    request.setAttribute("a", a1);
		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);	
	}
		else{
request.setAttribute("title", "�༶��Ϣ����");
request.setAttribute("path", "class.jsp");
Object a1=request.getSession().getAttribute("account");		
request.setAttribute("a", a1);
request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
}
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
