package com.qust.exam.biz;

import com.qust.exam.dao.TaccountDao;
import com.qust.exam.entity.Taccount;
import com.qust.exam.exception.ObjectNullException;
import com.qust.exam.util.Log;

public class AccountBiz {
  public  Taccount  login(String account,String pwd,String role) throws ObjectNullException,Exception{
	  Taccount a=null;
		if (account != null && !account.equals("") && pwd != null
				&& !pwd.equals("")) {
			
			TaccountDao dao = new TaccountDao();

			try {
				a = dao.login(account, pwd,role);
			} catch (Exception e) {
				Log.logger.error(e.getMessage());
				throw e;
			} finally {
				dao.closeConnection();
			}
		}
		if(a == null){
			throw new ObjectNullException("登陆出错：用户名或密码错误");
		}
		 
	  return a;
  }
  }
