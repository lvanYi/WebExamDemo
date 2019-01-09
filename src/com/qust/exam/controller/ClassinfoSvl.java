package com.qust.exam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.qust.exam.biz.AdminBiz;
import com.qust.exam.entity.Tclass;





public class ClassinfoSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public  ClassinfoSvl() {
		super();
	}


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

request.setAttribute("title", "�༶��Ϣ����");
request.setAttribute("path", "class.jsp");
Object a1=request.getSession().getAttribute("account");		
request.setAttribute("a", a1);
request.getRequestDispatcher("admin/admin.jsp").forward(request, response);

	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				AdminBiz biz = new AdminBiz();
		try {
			List<Tclass> c = biz.queryallclass();
			 if(c != null){
					JSONArray jsonArray = JSONArray.fromObject(c); 
					response.setCharacterEncoding("utf-8"); //GBK����
					response.getWriter().print(jsonArray.toString());
			    }	
			
		} catch (Exception e) {
			String msg = "δ֪������������ϵ����Ա......";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("error/error.jsp").forward(request, response); 
		}
		
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
