package com.qust.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.AdminBiz;
import com.qust.exam.entity.Tteacher;
import com.qust.exam.exception.ObjectNullException;

public class CheckTeacherSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public CheckTeacherSvl() {
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

		String tno=request.getParameter("no");
		if(tno !=null && !tno.equals("")){
		AdminBiz biz=new AdminBiz();
		try {
			Tteacher t = biz.checkteacher(tno);
			request.setAttribute("t", t);              
		} catch (ObjectNullException e) {
			e.printStackTrace();
		}catch(Exception e){
			request.setAttribute("msg", "����δ֪��������ϵ����Ա");
			String path = "error/error.jsp";
			request.getRequestDispatcher(path).forward(request, response);		
		}
		request.setAttribute("title", "��ʦ��Ϣ��ѯ");
		request.setAttribute("path", "teacherinfo.jsp");
		Object a1=request.getSession().getAttribute("account");		
	    request.setAttribute("a", a1);
		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
	}
		else{
request.setAttribute("title", "��ʦ��Ϣ����");
request.setAttribute("path", "teacher.jsp");
Object a1=request.getSession().getAttribute("account");		
request.setAttribute("a", a1);
request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
		}
		
		
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
