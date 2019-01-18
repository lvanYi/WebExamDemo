package com.qust.exam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.AdminBiz;
import com.qust.exam.util.Log;

public class RemoveStudentSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public RemoveStudentSvl() {
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
		String sno = request.getParameter("sno");
		AdminBiz biz=new AdminBiz();
		try {
			biz.deletestudent(sno);		
		    biz.deleteaccount(sno);
		
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
		}
		
		
	      request.setAttribute("msg", "ɾ���ɹ�");
	      request.setAttribute("path", "removesuc.jsp");
		  Object a1=request.getSession().getAttribute("account");		
		  request.setAttribute("a", a1);
	     request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
