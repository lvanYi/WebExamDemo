package com.qust.exam.entity;

import java.util.Date;

public class Tnotice {
private int nid; //����ID
private String acc_id;//��� �û�ID
private String ncont;//֪ͨ����
private Date time;//����ʱ��
public int getNid() {
	return nid;
}
public void setNid(int nid) {
	this.nid = nid;
}
public String getAcc_id() {
	return acc_id;
}
public void setAcc_id(String acc_id) {
	this.acc_id = acc_id;
}
public String getNcont() {
	return ncont;
}
public void setNcont(String ncont) {
	this.ncont = ncont;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}

}
