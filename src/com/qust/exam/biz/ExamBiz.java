package com.qust.exam.biz;

import java.util.List;

import com.qust.exam.dao.ExamDao;
import com.qust.exam.entity.Tpaperties;
import com.qust.exam.util.Log;

public class ExamBiz {

	// 查询选择题的信息
	public List<Tpaperties> queryBychioce(int pid) throws Exception {
		List<Tpaperties> tp = null;
		ExamDao dao = new ExamDao();
		try {
			tp = dao.queryBychioce(pid);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			throw e;
		} finally {
			dao.closeConnection();
		}

		return tp;
	}

	public List<Tpaperties> queryBycompletion(int pid) throws Exception {
		List<Tpaperties> tp = null;
		ExamDao dao = new ExamDao();
		try {
			tp = dao.queryBycompletion(pid);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			throw e;
		} finally {
			dao.closeConnection();
		}

		return tp;
	}

	public List<Tpaperties> queryByjudge(int pid) throws Exception {
		List<Tpaperties> tp = null;
		ExamDao dao = new ExamDao();
		try {
			tp = dao.queryByjudge(pid);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			throw e;
		} finally {
			dao.closeConnection();
		}

		return tp;
	}

	public List<Tpaperties> queryByanswer(int pid) throws Exception {
		List<Tpaperties> tp = null;
		ExamDao dao = new ExamDao();
		try {
			tp = dao.queryByanswer(pid);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			throw e;
		} finally {
			dao.closeConnection();
		}

		return tp;
	}

	public List<Tpaperties> queryByapplication(int pid) throws Exception {
		List<Tpaperties> tp = null;
		ExamDao dao = new ExamDao();
		try {
			tp = dao.queryByapplication(pid);
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			throw e;
		} finally {
			dao.closeConnection();
		}

		return tp;
	}

}
