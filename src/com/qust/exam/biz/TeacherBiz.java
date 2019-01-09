package com.qust.exam.biz;

import java.sql.SQLException;
import java.util.List;

import com.qust.exam.dao.TeacherDao;
import com.qust.exam.entity.Tcourse;
import com.qust.exam.entity.Texam;
import com.qust.exam.entity.Tknowledge;
import com.qust.exam.entity.Tpaperinfo;
import com.qust.exam.entity.Tpaperties;
import com.qust.exam.entity.Tqk;
import com.qust.exam.entity.Tqt;
import com.qust.exam.entity.Tquestion;
import com.qust.exam.entity.Tstuanscom;
import com.qust.exam.util.Log;
public class TeacherBiz {
	
public boolean check(String tno,int examid) throws SQLException{
 boolean bRet=false;
	TeacherDao dao=new TeacherDao();
	try {
		bRet=dao.check(tno,examid);
		
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	return bRet;
}	
	
	
	
public List<Texam> queryexam() throws SQLException{
	List<Texam> exam=null;
	TeacherDao dao=new TeacherDao();
	try {
		exam=dao.queryexam();
		
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	
	return exam;
}
	
	
	
	
	/*�Ƴ�֪ʶ����Ŀ����*/
	public void removekq(int kid,int qid) throws SQLException{
		TeacherDao dao=new TeacherDao();
		try {
			dao.removekq(kid, qid);
			
			} catch (SQLException e) {
				Log.logger.error(e.getMessage());
				throw e;
			}finally{
				dao.closeConnection();
			}
		
		
		
		
	}
	
	
	
public void addscore(String sno,int pid,int score) throws SQLException{
	TeacherDao dao=new TeacherDao();
	try {
		dao.addscore(sno, pid, score);
		
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	
	
	
	
	
}	
	
	
	
public void editscore(String a, int b ,int c) throws SQLException{
		TeacherDao dao=new TeacherDao();
		try {
			dao.editscore(a, b, c);
			
			} catch (SQLException e) {
				Log.logger.error(e.getMessage());
				throw e;
			}finally{
				dao.closeConnection();
			}
		
		
		
	}
	
	
public List<Tstuanscom> querytst(int examid) throws SQLException{
	List<Tstuanscom> tst=null;
	TeacherDao dao=new TeacherDao();
	try {
		tst=dao.querytst(examid);
		
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	
	return tst;
}
	
	public List<Tpaperinfo> querypaper() throws SQLException{
		List<Tpaperinfo> paperinfo=null;
		TeacherDao dao=new TeacherDao();
		try {
		paperinfo=dao.querypaper();
		
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
		return paperinfo;
	}
		
		
	
	
	
	
	/*�Ծ����
	 * */
	public int queryallscore(int pid) throws SQLException{
		int score=0;
		TeacherDao dao=new TeacherDao();
		try {
			score=dao.queryallscore(pid);
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
		return score;
	}
	
	
	/*
	 * �h���Ծ��е���Ŀ
	 * */
	public void removepaper(int qid) throws SQLException{
		TeacherDao dao=new TeacherDao();
		try {
			dao.removepaper(qid);
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	
		
	}
	/*
	 * �鿴ԇ���е��}Ŀ
	 * */
	public List<Tpaperties> queryQ(int pid) throws SQLException{
		List<Tpaperties> paperties=null;
		TeacherDao dao=new TeacherDao();
		try{
			paperties=dao.queryQ(pid);
		}catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
	
		
		return paperties;
	}
	
	
	/*
	 * ԇ��������}Ŀ
	 * */
	public void addpaper(Tpaperties tp) throws SQLException,Exception{
		TeacherDao dao=new TeacherDao();
		
			try {
				dao.addpaper(tp);
			} catch (SQLException e) {
				Log.logger.error(e.getMessage());
				throw e;
			}finally{
				dao.closeConnection();
			}
		
		
		
		
	}
	
	/*
	 * �༭�Ծ���Ϣ
	 * */
	public void updatetest(Tpaperinfo paperinfo) throws SQLException{
		TeacherDao dao=new TeacherDao();
		try{
		dao.updatetest(paperinfo);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
				
		}finally{
			dao.closeConnection();
		}
	}	
		/*ɾ���Ծ�
		 * */
		public  void removepaperinfo(int pid) throws SQLException{
	TeacherDao dao=new TeacherDao();
	try{
	dao.removepaperinfo(pid);
	}catch(SQLException e){
		Log.logger.error(e.getMessage());
		throw e;
			
	}finally{
		dao.closeConnection();
	}
			
		}
		
	
	
	
	
	/*
	 * ID��ѯ�Ծ�
	 * */
	public Tpaperinfo querypaperinfos(int pid) throws SQLException{
		Tpaperinfo paperinfo=null;
		TeacherDao dao=new TeacherDao();
		try{
		paperinfo=dao.querypaperinfos(pid);
		}catch(SQLException e){
			Log.logger.error(e.getMessage());
			throw e;
				
		}finally{
			dao.closeConnection();
		}
		
		return paperinfo;
	}
	/*�����Ծ�
	 * */
	public List<Tpaperinfo> queryallpaper() throws SQLException{
	List	<Tpaperinfo> paper=null;
	TeacherDao dao=new TeacherDao();
	try{
	paper=dao.queryallpaper();
	}catch(SQLException e){
		Log.logger.error(e.getMessage());
		throw e;
			
	}finally{
		dao.closeConnection();
	}
	
	return paper;
		
		
		
	}
	/*
	 * ֪ʶ������
	 * */
	public List<Tqk> querytqk(int kid) throws SQLException{
		List<Tqk> tqk=null;
		TeacherDao dao=new TeacherDao();
		try {
			tqk=dao.querytqk(kid);
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
			
		}finally{
			dao.closeConnection();
		}
		return tqk;
	}
	
	
	
	/**
	 * �Ƴ���ϵ
	 * @throws SQLException 
	 * */
	public void removetqk(int qid) throws SQLException{
		TeacherDao dao=new TeacherDao();
		try {
			dao.removetqk(qid);
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
			throw e;
			
		}finally{
			dao.closeConnection();
		}
		
		
	}
	
	/*
	 * ��ѯ����
	 * */
	public List<Tquestion> querytq(String kid,String qtid) throws Exception{
		List<Tquestion> question=null;
		TeacherDao dao=new TeacherDao();
		try{
		question=dao.queryq(kid, qtid);
	}
	catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
	}
	finally{
		
		dao.closeConnection();
	}

		
		
		
	
		
		return question;
	}
	
	
	
	/**
	 * ��ѯ�Ծ�
	 * @throws Exception 
	 * 
	 * */
	public List<Tpaperinfo> querypaperinfo(String ptitle) throws Exception{
		List<Tpaperinfo> paperinfo=null;
		TeacherDao dao=new TeacherDao();
		try{
		paperinfo=dao.querypaperinfo(ptitle);
	}
	catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
	}
	finally{
		
		dao.closeConnection();
	}

		
		
		
		return paperinfo;
	}
	
	
	
	
	
	/**
	 * ����Ծ�
	 * @throws Exception 
	 * **/
	public void addtest(Tpaperinfo tp) throws Exception{
		TeacherDao dao=new TeacherDao();
		try{
		dao.addtest(tp);
		}
			catch(Exception e){
				Log.logger.error(e.getMessage());
				throw e;
			}
			finally{
				
				dao.closeConnection();
			}
		
		
		
		
	}
	
	/**
	 * ��֪ʶ���������Ŀ
	 * @throws Exception 
	 * 
	 * */
	public void addqu(int kid,int qid) throws Exception{
		TeacherDao dao=new TeacherDao();
		try{
		dao.addqu(kid, qid);
		}
			catch(Exception e){
				Log.logger.error(e.getMessage());
				throw e;
			}
			finally{
				
				dao.closeConnection();
			}
		
		
	}
	
	
	
	/**
	 * ������id ������
	 */
	public List<Tqt> queryqtid()throws Exception {
		List<Tqt>tqt=null;
		TeacherDao dao=new TeacherDao();
		try{
		tqt=dao.queryqtid();
		}
		catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}
		finally{
			
			dao.closeConnection();
		}
		return tqt;	
	}
	public List<Tknowledge>  queryknowledge(String cno ,String kname)throws Exception{
		List<Tknowledge> knowledge =null;
		TeacherDao dao = new TeacherDao();
		try{
			knowledge = dao.queryknowledge(cno , kname);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
		return knowledge;
	}
	public List<Tknowledge>  queryknowledges(String cno )throws Exception{
		List<Tknowledge> knowledge =null;
		TeacherDao dao = new TeacherDao();
		try{
			knowledge = dao.queryknowledges(cno);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
		return knowledge;
	}

	
	
	public Tknowledge  queryknowledge1(int kid)throws Exception{
		Tknowledge knowledge =null;
		TeacherDao dao = new TeacherDao();
		try{
			knowledge = dao.queryknowledge1(kid);
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
		return knowledge;
	}
	
	
	public Tquestion queryques1(int qid) throws Exception{
		Tquestion ques =null;
		TeacherDao dao = new TeacherDao();
		try{
			ques = dao.queryques1(qid);
		}catch(Exception e ){
			Log.logger.error(e.getMessage());
			throw e ;
		}finally{
			dao.closeConnection();
		}
		return ques;
	}
	
	
	public List<Tknowledge>  queryallknowledge()throws Exception{
		List<Tknowledge> knowledge =null;
		TeacherDao dao = new TeacherDao();
		try{
			knowledge = dao.queryallknowledge();
		}catch(Exception e){
			Log.logger.error(e.getMessage());
			throw e;
		}finally{
			dao.closeConnection();
		}
		return knowledge;
	}
	
	public List<Tquestion> queryallquestion()throws Exception{
		List<Tquestion> ques =null;
		TeacherDao dao = new TeacherDao();
		try{
			ques = dao.queryallquestion();
		}catch(Exception e){
			Log.logger.error(e.getMessage());
		}finally{
			dao.closeConnection();
		}
		
		return ques;
	}
	
	
	
public List<Tquestion> queryquestion(int qid , String qcont)throws Exception{
	List<Tquestion> q=null;
	TeacherDao dao=new TeacherDao();
	try {
		q=dao.queryquestion(qid, qcont);
	} catch (SQLException e) {
		Log.logger.error(e.getMessage());
		throw e;
	}finally{
		dao.closeConnection();
	}
	
return q;	
}


public void addknowledge(Tknowledge kno)throws Exception{
	TeacherDao dao = new TeacherDao();
	try{
	dao.addknowledge(kno);
	}catch(Exception e ){
		Log.logger.error(e.getMessage());
		
	}finally{
		dao.closeConnection();
	}
	
}
public void addquestion(Tquestion question)throws Exception {
	TeacherDao dao = new TeacherDao();
	try{
	dao.addquestion(question);
	}catch(Exception e ){
		Log.logger.error(e.getMessage());
		
	}finally{
		dao.closeConnection();
	}
	
}


public List<Tcourse> querycno()throws Exception {
	List<Tcourse> course = null;
	TeacherDao dao=new TeacherDao();
	try{
	course=dao.querycno();
	}
	catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
	}
	finally{
		
		dao.closeConnection();
	}
	return course;	
}

public void editknowledge(Tknowledge knowledge) throws Exception{
	TeacherDao dao = new TeacherDao();
	try{
	dao.editknowledge(knowledge);
	}catch(Exception e){
		Log.logger.error(e.getMessage());
		throw e;
	}finally{
		dao.closeConnection();
	}
}

public void editquestion(Tquestion question) throws Exception{
	TeacherDao dao = new TeacherDao();
	try{
		dao.editquestion(question);
	}catch(Exception e ){
		Log.logger.error(e.getMessage());
		throw e;
	}finally{
		dao.closeConnection();
	}
	
	
}

public void removeknowledge(int kid) throws SQLException{
	TeacherDao dao = new TeacherDao();
	
	try {
		dao.removeknowledge(kid);
	} catch (SQLException e) {
		throw e;
		
	}finally{
		dao.closeConnection();
	}

}

public void removequestion(int qid) throws SQLException{
	TeacherDao dao = new TeacherDao();
	try{
	dao.removequestion(qid);
	}catch(SQLException e ){
		Log.logger.error(e.getMessage());
		throw e;
	}finally{
		dao.closeConnection();
	}
	
}
}
