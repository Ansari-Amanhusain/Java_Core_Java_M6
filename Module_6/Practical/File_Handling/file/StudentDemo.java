package com.file;

import java.io.Serializable;

public class StudentDemo implements Serializable
{
	private int sid;
	private String sname,dpart;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDpart() {
		return dpart;
	}
	public void setDpart(String dpart) {
		this.dpart = dpart;
	}
	 
	public String toString()
	{
		return new StringBuffer("Student ID : ").append(sid)
				.append(" , Name of the Student :  ").append(sname).append(" , Department  : ").append(dpart).toString();
	}
}

