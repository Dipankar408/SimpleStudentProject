package com.dbConfig;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	private double marks;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Roll-no:"+sid+", Name:"+sname+", Marks:"+marks;
	}
}
