package com.qust.exam.controller.teacher;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.TeacherBiz;
import com.qust.exam.entity.Tcourse;
import com.qust.exam.entity.Tknowledge;
import com.qust.exam.util.Log;

public class RemoveknowledgeSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public RemoveknowledgeSvl() {
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
		String kid1 = request.getParameter("kid");
		TeacherBiz biz = new TeacherBiz();
		int kid=Integer.valueOf(kid1);
	
			try {
				biz.removeknowledge(kid);
				List<Tcourse> cour = biz.querycno();		
				request.setAttribute("cour", cour);
				List<Tknowledge> knowledge = biz.queryallknowledge();
				request.setAttribute("kno1", knowledge);
			    request.setAttribute("path", "knowledge.jsp");
			    request.setAttribute("title", "֪ʶ����Ϣ");
				Object a1=request.getSession().getAttribute("account");		
				request.setAttribute("a", a1);
				request.getRequestDispatcher("teacher.jsp").forward(request, response);
			
			} catch (SQLException e) {
				 
						String msg="ɾ��ʧ�ܣ�����ɾ�������Ŀ��";
						request.setAttribute("msg", msg);
						Log.logger.error(e.getMessage());
						request.getRequestDispatcher("error.jsp").forward(request, response);
			} catch (Exception e) {

				String msg="ɾ��ʧ�ܣ�����ϵ����Ա��";
				request.setAttribute("msg", msg);
				Log.logger.error(e.getMessage());
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
