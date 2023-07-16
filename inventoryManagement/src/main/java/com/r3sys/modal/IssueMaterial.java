package com.r3sys.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class IssueMaterial {

	@Id
	private int iid;
    private int iquantity;  
	private String iname;
	private int rid ;
	private String date ;
	private String imaterialname ;
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getIquantity() {
		return iquantity;
	}
	public void setIquantity(int iquantity) {
		this.iquantity = iquantity;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImaterialname() {
		return imaterialname;
	}
	public void setImaterialname(String imaterialname) {
		this.imaterialname = imaterialname;
	}
	public IssueMaterial(int iid, int iquantity, String iname, int rid, String date, String imaterialname) {
		super();
		this.iid = iid;
		this.iquantity = iquantity;
		this.iname = iname;
		this.rid = rid;
		this.date = date;
		this.imaterialname = imaterialname;
	}
	public IssueMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IssueMaterial [iid=" + iid + ", iquantity=" + iquantity + ", iname=" + iname + ", rid=" + rid
				+ ", date=" + date + ", imaterialname=" + imaterialname + "]";
	}
	
	
}
