package com.qust.exam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginoutSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginoutSvl() {
		super();
	}

	public void destroy() {
		super.destroy(); 
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���User
		request.getSession().invalidate();   //����session���������.
		request.getRequestDispatcher("LoginSvl").forward(request, response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() throws ServletException {
		
	}

}
