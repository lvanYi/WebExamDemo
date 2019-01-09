package com.qust.exam.controller.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qust.exam.biz.StudentBiz;
import com.qust.exam.entity.Taccount;

public class EditPwdSvl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public EditPwdSvl() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("title", "�޸�ѧ������");
		request.setAttribute("path", "editpwd.jsp");
		Object a1 = request.getSession().getAttribute("account");
		request.setAttribute("a", a1);
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "";
		Taccount user = (Taccount) request.getSession().getAttribute("account");
		String no = user.getUno();
		StudentBiz biz = new StudentBiz();
		try {
			String newpwd = request.getParameter("newpwd");
			String newpwdAgain = request.getParameter("newpwdAgain");
			if (newpwd.equals(newpwdAgain)) {
				biz.eidtpwd(no, newpwd);
				msg = "�����޸ĳɹ�";
				request.setAttribute("msg", msg);
				request.setAttribute("path", "success2.jsp");
			} else {
				msg = "�������벻һ��";
				request.setAttribute("msg", msg);
				request.setAttribute("path", "success1.jsp");
			}
			request.getRequestDispatcher("student.jsp").forward(request,
					response);
		} catch (Exception e) {
			msg = "δ֪������������ϵ����Ա......";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
