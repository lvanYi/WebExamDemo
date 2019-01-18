package com.qust.exam.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qust.exam.entity.Taccount;


public class TaccountDao extends BaseDao{
public Taccount login(String account,String pwd,String role) throws SQLException{
	Taccount a=null;
	openConnection();
	String sql="select * from Taccount where uno='"+account+"' and password='"+pwd+"' and role='"+role+"'";
	PreparedStatement ps = conn.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		a = new Taccount();
		a.setUno(rs.getString("uno"));
		a.setPassword(rs.getString("password"));
		a.setRole(rs.getInt("role"));
		break;
	}
	return a;
}
}
