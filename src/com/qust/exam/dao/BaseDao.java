package com.qust.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qust.exam.util.Log;
import com.qust.exam.util.ReadDataBaseFile;



public class BaseDao {
	//protected static final String JNDI_NAME = "";
	protected Connection conn;

	public Connection getConn() {
		openConnection();
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public void openConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				ReadDataBaseFile base = ReadDataBaseFile.newInstance();
				Class.forName(base.getDriver()); // ��������Ƿ����
				conn = DriverManager.getConnection(base.getUrl(),base.getUser(), base.getPwd()); // url,�˺���, ����
			}
		} catch (ClassNotFoundException e) {
			Log.logger.error(e.getMessage());
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			if (conn != null || !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			Log.logger.error(e.getMessage());
		}
	}

	public void autoCommit() throws Exception {
		openConnection();
		conn.setAutoCommit(false);
	}

	public void commit() throws Exception {
		if (conn != null || !conn.isClosed()) {
			conn.commit();
		}
	}

	public void rollback() {
		try {
			if (conn != null || !conn.isClosed()) {
				conn.rollback();
			}
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	/*
	 * ��ҳ�㷨
	 */
	protected ResultSet executeQuery(String strSql, int iStart, int iEnd)
			throws Exception {
		String sql = "select * from (select rownum rw,td.* from (" + strSql
				+ ") td) w where w.rw >=" + iStart + " and w.rw <=" + iEnd;
		PreparedStatement ps = conn.prepareStatement(sql);
		return ps.executeQuery();
	}

	/**
	 * �ܼ�¼��
	 */
	protected int queryCount(String strSql) throws Exception {
		int RecordAllCount = 0;
		String sql = "select count(*) as allcount from (" + strSql + ")";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			RecordAllCount = rs.getInt("allcount");
		}

		return RecordAllCount;

	}

}
