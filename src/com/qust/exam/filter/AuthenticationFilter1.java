package com.qust.exam.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationFilter1 implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		/**
		 * 1.�����ķ���·������LoginSvl�� ��ô��Ϊ��ǰ���ڵ�¼ҳ��
		 * 2.���û��LoginSvl����ô��Ҫ��ȡSeesion�е�user���ԡ�
		 * 3.���user����Ϊ�գ�����Ϊû�е�¼��Ҫ��������ҳ�棬��ص�¼ҳ��
		 * 4.�����user���󣬼��������ߡ� 
		 */
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response =(HttpServletResponse)res;
		String url = request. getRequestURL().toString();
		System.out.println(123);
		if(url.indexOf("LoginSvl") > 0){
			//���ڵ�¼ҳ
			chain.doFilter(request, response);
		}
		else{
			//�����ڵ�¼ҳ
			Object obj = request.getSession().getAttribute("account");
			
			if(obj == null){
				request.setAttribute("msg", "����δ���Ͽɣ����¼֮����.");
				request.getRequestDispatcher("LoginSvl").forward(request, response);
			}else{
				chain.doFilter(request, response);
			}
		}
		
		
		
		

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
