package com.qust.exam.controller.teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.TeacherBiz;
import com.qust.exam.entity.Tqt;
import com.qust.exam.entity.Tquestion;
import com.qust.exam.util.Log;

public class QuestionInfoSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public QuestionInfoSvl() {
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
		TeacherBiz biz = new TeacherBiz();
		
		try {
			List<Tqt> qt = biz.queryqtid();
			request.setAttribute("tqt",qt);
			request.setAttribute("title", "��ѯ֪ʶ��");
			request.setAttribute("path", "question.jsp");
			request.getSession().setAttribute("tqt", qt);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			
		}
		Object a1=request.getSession().getAttribute("account");		
	    request.setAttribute("a", a1);
		request.getRequestDispatcher("teacher.jsp").forward(request, response);
		

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String qtid = request.getParameter("qtid");
		String qcont = request.getParameter("qcont");		
		TeacherBiz biz = new TeacherBiz();
		try {
			if( qcont!=null && !qcont.equals("")){
			int tid = Integer.valueOf(qtid);
			List<Tquestion> ques = biz.queryquestion(tid, qcont);
			request.setAttribute("ques",ques);
			Object tqt =request.getSession().getAttribute("tqt");
			request.setAttribute("tqt", tqt);
			Object a1=request.getSession().getAttribute("account");		
		    request.setAttribute("a", a1);
		    request.setAttribute("title", "��Ŀ��Ϣ");
			request.setAttribute("path", "questioninfo.jsp");
			request.getRequestDispatcher("teacher.jsp").forward(request, response);
			}else{
				List<Tqt> tqt=biz.queryqtid();
	     request.setAttribute("tqt", tqt);
			    Object quest=request.getSession().getAttribute("quest");
				 request.setAttribute("ques",quest);
			   Object a1=request.getSession().getAttribute("account");		
			   request.setAttribute("a", a1);
			   request.setAttribute("title", "��ѯ��Ŀ");
				request.setAttribute("path", "question.jsp");
			   request.getRequestDispatcher("teacher.jsp").forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("msg", "δ֪������������ϵ����Ա......");
			String path="error/error.jsp";
			request.getRequestDispatcher(path).forward(request, response);
		}
		
	}

	
	public void init() throws ServletException {
		
	}

}
