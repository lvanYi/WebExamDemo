package com.qust.exam.controller.teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.TeacherBiz;
import com.qust.exam.entity.Tcourse;
import com.qust.exam.entity.Tknowledge;
import com.qust.exam.util.Log;

public class KnowledgeSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Constructor of the object.
	 */
	public KnowledgeSvl() {
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
	
		TeacherBiz biz=new TeacherBiz();
		List<Tcourse> cour = null;
		
		
		 try {
			 cour = biz.querycno();
				
			List<Tknowledge> knowledge = biz.queryallknowledge();
			request.setAttribute("kno1", knowledge);
			request.setAttribute("cour", cour);
			
			request.setAttribute("title", "��ѯ֪ʶ��");
			request.setAttribute("path", "knowledge.jsp");
			request.getSession().setAttribute("cour", knowledge);
		 } catch (Exception e) {
			Log.logger.error(e.getMessage());
		}
		 Object a1=request.getSession().getAttribute("account");		
		    request.setAttribute("a", a1);
		request.getRequestDispatcher("teacher.jsp").forward(request, response);
		}
	
	

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		String cno=request.getParameter("cno");
//		String kname=request.getParameter("kname");
//		List<Tknowledge> kno1=null;
//			
//		
//			
//		   TeacherBiz biz=new TeacherBiz();
//		   try {
//		
//			kno1=biz.queryknowledge(cno,kname);
//			request.setAttribute("kno1", kno1);
//			
//		
//			Object cour=request.getSession().getAttribute("cour");
//			request.setAttribute("cour",cour);
//			request.setAttribute("path", "knowledge.jsp");
//			request.getRequestDispatcher("teacher.jsp").forward(request, response);
//		} catch (Exception e) {
//			request.setAttribute("msg", "δ֪������������ϵ����Ա......");
//			String path="error/error.jsp";
//			request.getRequestDispatcher(path).forward(request, response);
//			
//		}
//		 
			}	
	public void init() throws ServletException {
		// Put your code here
	}

}
