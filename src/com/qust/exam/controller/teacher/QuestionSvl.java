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

public class QuestionSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public QuestionSvl() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TeacherBiz biz=new TeacherBiz();
		List<Tqt> tqt=null;
   try {
	   tqt=biz.queryqtid();
	   List<Tquestion> quest = biz.queryallquestion();
	request.setAttribute("ques", quest);
	request.setAttribute("tqt",tqt);
	request.setAttribute("title", "��ѯ��Ŀ");
	request.setAttribute("path", "question.jsp");
	request.getSession().setAttribute("quest", quest);
	} catch (Exception e) {
	Log.logger.error(e.getMessage());
}	
   Object a1=request.getSession().getAttribute("account");		
   request.setAttribute("a", a1);
   request.getRequestDispatcher("teacher.jsp").forward(request, response);
   
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		String qtid=request.getParameter("qtid");
//		String qcont=request.getParameter("qcont");
//
//		List<Tquestion> ques=null;
//			
//			if (qtid != null) {
//				int qid = Integer.valueOf(qtid);
//			
//		   TeacherBiz biz=new TeacherBiz();
//		   try {
//		
//			ques=biz.queryquestion(qid, qcont);
//			request.setAttribute("ques", ques);
//			
//		
//			Object tqt=request.getSession().getAttribute("tqt");
//			request.setAttribute("tqt",tqt);
//			request.setAttribute("path", "question.jsp");
//			request.getRequestDispatcher("teacher.jsp").forward(request, response);
//		} catch (Exception e) {
//			request.setAttribute("msg", "δ֪������������ϵ����Ա......");
//			String path="error/error.jsp";
//			request.getRequestDispatcher(path).forward(request, response);
//			
//		}
//		 
//			}	
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
