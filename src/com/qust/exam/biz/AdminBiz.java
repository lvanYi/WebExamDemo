package com.qust.exam.biz;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.qust.exam.dao.AdminDao;
import com.qust.exam.entity.Taccount;
import com.qust.exam.entity.Tclass;
import com.qust.exam.entity.Texam;
import com.qust.exam.entity.Tnotice;
import com.qust.exam.entity.Tpaperinfo;
import com.qust.exam.entity.Tstudent;
import com.qust.exam.entity.Tteacher;
import com.qust.exam.entity.TurnPage;
import com.qust.exam.exception.ObjectNullException;
import com.qust.exam.util.Log;

public class AdminBiz {
	
	public void changeischeck(int examid) throws SQLException{
		AdminDao dao=new AdminDao();
		try{
		dao.changeischeck(examid);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		 dao.closeConnection();
		}
			
		
	}
	
	
	/*
	 * 
	 * ��ѯ������Ծ�
	 * */
	public List<Tpaperinfo> querypaper() throws SQLException{
		List<Tpaperinfo> paperinfo=null;
		AdminDao dao=new AdminDao();
		try{
		
		paperinfo=dao.querypaper();
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		 dao.closeConnection();
		}
		return paperinfo;
	}
	
	/*����ľ�Ȩ��
	 * */
	public void addtm(int examid,String tno) throws SQLException{
		AdminDao dao=new AdminDao();
		try{
     dao.addtm(examid, tno);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
		
	}
	
	
	
	/*��ѯ�������Ծ�ID
	 * */
	public List<Texam> querycorrecct() throws SQLException{
		 List<Texam> exam=null;
		 AdminDao dao=new AdminDao();
		 
			try{
			    exam=dao.querycorrect();
			}catch(SQLException e){
				Log.logger.error(e.getMessage());
				throw e;
			}finally{
			dao.closeConnection();
			}
			return exam;
	}
	
	
	
	/*ɾ�����԰���
	 * */
	public void removeplan(int examid) throws SQLException{
		AdminDao dao=new AdminDao();
		
		try{
		    dao.removeplan(examid);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
		
		
	
	}
	
		
		
		

	
	
	
	/*ID�鿼�԰���
	 * */
	public  Texam queryexam(int examid)throws SQLException{
		AdminDao dao=new AdminDao();
		Texam exam=null;
		try{
		     exam=dao.queryexam(examid);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
		
		
		return exam;
	}
	
	
	
	
	
	/*
	 * ��ѯ���п��԰���
	 * */
	public List<Texam> queryallexam()throws SQLException{
		AdminDao dao=new AdminDao();
		List<Texam> exam=null;
		try{
		     exam=dao.queryallexam();
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
		
		
		return exam;
	}
	
	public void editexamplan(Texam exam) throws SQLException {
		AdminDao dao=new AdminDao();
		try{
		     dao.editexamplan(exam);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}	
		
	}
	
	
	
	
	public void addexamplan(Texam exam) throws SQLException {
		AdminDao dao=new AdminDao();
		try{
		     dao.addexamplan(exam);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}	
		
	}
	
	
	
	public void addnotice(Tnotice notice) throws Exception{
		
		AdminDao dao=new AdminDao();
		try{
		     dao.addnotice(notice);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
			
		
		
		
		
	}
	
	
	
	
	public void removenotice(int nid) throws Exception{
	
		AdminDao dao=new AdminDao();
		try{
		     dao.removenotice(nid);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
			
		
		
	}
	
	
	
	public  void updatenotice(Tnotice notice) throws Exception{
	
		AdminDao dao=new AdminDao();
		try{
		     dao.updatenotice(notice);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}
			
		
		
	}
	
	
	
	
	
	
	
	public Tnotice querynotices(int nid) throws Exception{
		Tnotice notice=null;
		AdminDao dao=new AdminDao();
		try{
		notice=dao.querynotices(nid);
		
	}
	catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
	}finally{
	dao.closeConnection();
	}return notice;
		
		
	
	}
	

	
	
	public List<Tnotice> queryallnotice()throws Exception{
		List<Tnotice> notice=null;
		AdminDao dao=new AdminDao();
		try{
		notice=dao.queryallnotice();
		}
		catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}return notice;
	}
	
	public List<Tnotice> querynotice(Date bDate, Date eDate)throws Exception{
		List<Tnotice> notice=null;
		AdminDao dao=new AdminDao();
		try{
		notice=dao.querynotice(bDate,eDate);
		}
		catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
		dao.closeConnection();
		}return notice;
	}
	
	
	public boolean checkAccount(String sno) throws Exception{
		boolean bRet=false;
		AdminDao dao=new AdminDao();
		bRet=dao.checkAccount(sno);
		dao.closeConnection();
		return bRet;
	}
	
	public List<Tstudent> queryInfo(TurnPage tp) throws Exception {
		List<Tstudent> studentsinfo= null;
		AdminDao dao = new AdminDao();
		try{
			studentsinfo= dao.queryInfo(tp);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	
		return studentsinfo;
	}

	
	
	
	
	public void classadd(Tclass cla)  throws Exception{
		AdminDao dao = new AdminDao();
		try{
		dao.classadd(cla);
		}catch(Exception e ){
			Log.logger.error(e.getMessage());
			throw e;
			
		}finally{
			dao.closeConnection();
		}

		
	}
	
	
	public void teacheradd(Tteacher tea) throws Exception{
		AdminDao dao = new AdminDao();
		try{
		dao.teacheradd(tea);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			
		}finally{
			dao.closeConnection();
		}
	}
	
	public 	void editaccount(Taccount account) throws Exception{
	AdminDao dao = new AdminDao();
	try {
		dao.editaccount(account);
	} catch (Exception e) {
		Log.logger.error(e.getMessage());
		throw e;
	}

	finally {
		dao.closeConnection();
	}
	}
	
	public void editstudent(Tstudent student) throws Exception{
		AdminDao dao = new AdminDao();
		try {
			dao.editstudent(student);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			throw e;
		}

		finally {
			dao.closeConnection();
		}
	}
	
	public void editteacher(Tteacher teacher) throws Exception{
		AdminDao dao=new AdminDao();
		try{
		dao.editteacher(teacher);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
			
		}finally {
			dao.closeConnection();
		}
	}
	public void editclass(Tclass cla) throws Exception{
		AdminDao dao=new AdminDao();
		try{
		dao.editclass(cla);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
			
		}finally {
			dao.closeConnection();
		}
		
	}
	
	
	
	
	public Tstudent  checkstudent(String sno) throws ObjectNullException, Exception{
		Tstudent student=null;
		AdminDao dao=new AdminDao();
		try{
		  student=dao.checkstudent(sno);
		  if(student==null){
			  throw new ObjectNullException("���޴���");
		  }
			}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e ;

	}finally{
		dao.closeConnection();
		
	}
		return student;
	}
	
	
	public Tteacher  checkteacher(String tno) throws ObjectNullException, Exception{
		Tteacher teacher = null;
		AdminDao dao = new AdminDao();
		try{
		teacher =dao.checkteacher(tno);
		if(teacher == null){
			throw new ObjectNullException("���޴���");
		}
		}catch(Exception e ){
			Log.logger.error(e.getMessage());
			throw e ;

		}finally{
			dao.closeConnection();
		}
	
	
		return teacher;
	}
	public Tclass checkclass(String classno) throws ObjectNullException, Exception{
		Tclass cla = null;
		AdminDao dao = new AdminDao();
		try{
		cla =dao.checkclass(classno);
		if(cla == null){
			throw new ObjectNullException("���޴���");
		}
		}catch(Exception e ){
			Log.logger.error(e.getMessage());
			throw e ;

		}finally{
			dao.closeConnection();
		}
		
		return cla;
	}
	
	
	
	
	
	/**
	 * ɾ���˻�
	 * @throws Exception 
	 */
	public void deleteaccount(String uno) throws Exception{
		

			AdminDao dao = new AdminDao();
			try{
				dao.deleteaccount(uno);
			}catch(Exception e){
				Log.logger.error(e.getMessage());
				throw e ;

		}finally{
			dao.closeConnection();
			
		}
		
	}
	/**
	 * ɾ��ѧ����Ϣ
	 * @param sno
	 */
	public void deletestudent(String sno) throws Exception{
	
			AdminDao dao = new AdminDao();
			try{
				dao.deletestudent(sno);
			}catch(Exception e){
				Log.logger.error(e.getMessage());
				throw e ;

		}finally{
			dao.closeConnection();
			
		
		}
		
	}
	public void deleteteacher(String tno) throws Exception{
		AdminDao dao = new AdminDao();
		try{
		dao.deleteteacher(tno);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
			
		}finally{
			dao.closeConnection();
		}
		
	}
	public void deleteclass(String classno) throws Exception{
		AdminDao dao = new AdminDao();
		try{
			dao.deleteclass(classno);
			}catch(Exception e){
				Log.logger.error(e.getMessage());
				throw e;
				
			}finally{
				dao.closeConnection();
			}
		
	}
	
	
	
public List<Tstudent> queryallstudent() throws Exception{
	List<Tstudent> s=null;
	AdminDao dao=new AdminDao();
	try{
	s=dao.queryallstudent();
	}catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
		}
		finally{
    dao.closeConnection();
		}
	return s;
}

public List<Tteacher> queryallteacher() throws Exception{
	List<Tteacher> t=null;
	AdminDao dao=new AdminDao();
	try{
		t=dao.queryallteacher();
	}catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
		}
		finally{
    dao.closeConnection();
		}
	return t;
}

public List<Tclass> queryallclass() throws Exception{
	List<Tclass> c =null;
	AdminDao dao = new AdminDao();
	try{
		c = dao.queryallclass();
	}catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
	}finally{
		dao.closeConnection();
	}
	return c;
}

public void addaccount( Taccount account) throws Exception{
	AdminDao dao = new AdminDao();
	try {
		dao.addaccount(account);
	} catch (Exception e) {
		Log.logger.error(e.getMessage());
		throw e;
	}

	finally {
		dao.closeConnection();
	}
	
	
	
	
}

public void studentadd(Tstudent stu) throws Exception{
	
	AdminDao dao = new AdminDao();
	try {
		dao.studentadd(stu);
	} catch (Exception e) {
		Log.logger.error(e.getMessage());
		throw e;
	}

	finally {
		dao.closeConnection();
	}
	
}








public Taccount checkaccount(String account) throws Exception {
	Taccount a=null;
	AdminDao dao = new AdminDao();
	try{
	a=dao.checkaccount(account);
} catch (Exception e) {
	Log.logger.error(e.getMessage());
	throw e;
}

finally {
	dao.closeConnection();
}

	
	return a;
}



}
