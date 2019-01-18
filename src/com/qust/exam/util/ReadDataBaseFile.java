package com.qust.exam.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * ��ȡ���ݿ������ļ�.
 * 
 * @author Administrator
 * 
 */
public class ReadDataBaseFile {
	private  String driver;
	private  String url;
	private  String user;
	private  String pwd;
	public static ReadDataBaseFile dateBase;

	private ReadDataBaseFile() {
		try {
			String path = ReadDataBaseFile.class.getResource("/").toURI()
					.getPath()
					+ "db.properties";
			Properties ps = new Properties();
			ps.load(new FileInputStream(path));
			driver = ps.getProperty("dbdriver");
			url = ps.getProperty("url");
			user = ps.getProperty("user");
			pwd = ps.getProperty("password");
		} catch (URISyntaxException e) {
			Log.logger.error(e.getMessage());
		} catch (FileNotFoundException e) {
			Log.logger.error(e.getMessage());
		} catch (IOException e) {
			Log.logger.error(e.getMessage());
		} catch (Exception e) {
			Log.logger.error(e.getMessage());
		}
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPwd() {
		return pwd;
	}

	public static ReadDataBaseFile getDateBase() {
		return dateBase;
	}
	/**
	 * �ڶ������������,���ɵĶ���Ψһ.
	 * @return
	 */
	public static ReadDataBaseFile newInstance() {
		if (dateBase == null) {
			synchronized (ReadDataBaseFile.class) {
				if (dateBase == null) {
					dateBase = new ReadDataBaseFile();
				}
			}
		}
		return dateBase;
	}

}
