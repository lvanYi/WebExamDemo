package com.qust.exam.controller.teacher;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.TeacherBiz;
import com.qust.exam.entity.Tqt;
import com.qust.exam.entity.Tquestion;
import com.qust.exam.util.Log;

public class RemoveQuestionSvl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public RemoveQuestionSvl() {
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
		String qid = request.getParameter("qid");
		TeacherBiz biz = new TeacherBiz();
		int qqid=Integer.valueOf(qid);
		try {
			
			biz.removetqk(qqid);
			biz.removequestion(qqid);
			List<Tqt> tqt = biz.queryqtid();
			request.setAttribute("tqt", tqt);
			List<Tquestion> question = biz.queryallquestion();
			request.setAttribute("ques", question);
			 request.setAttribute("title", "��ѯ��Ŀ");
	           request.setAttribute("path", "question.jsp");
				Object a1=request.getSession().getAttribute("account");		
			    request.setAttribute("a", a1);
		     request.getRequestDispatcher("teacher.jsp").forward(request, response);
		} catch(SQLException e){
			String msg="ɾ��ʧ�ܣ��������Ծ���ɾ����";
			request.setAttribute("msg", msg);
			Log.logger.error(e.getMessage());
			
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}	
		catch (Exception e) {
			
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
