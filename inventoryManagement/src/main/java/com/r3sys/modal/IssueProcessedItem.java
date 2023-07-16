package com.r3sys.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class IssueProcessedItem {
	
	@Id
	private int ipid;
    private int ipquantity;  
	private String ipname;
	private int pid ;
	private String ipdate ;
	private String ipmaterialname ;	
	private String pname;
	
	public int getIpid() {
		return ipid;
	}
	public void setIpid(int ipid) {
		this.ipid = ipid;
	}
	public int getIpquantity() {
		return ipquantity;
	}
	public void setIpquantity(int ipquantity) {
		this.ipquantity = ipquantity;
	}
	public String getIpname() {
		return ipname;
	}
	public void setIpname(String ipname) {
		this.ipname = ipname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getIpdate() {
		return ipdate;
	}
	public void setIpdate(String ipdate) {
		this.ipdate = ipdate;
	}
	public String getIpmaterialname() {
		return ipmaterialname;
	}
	public void setIpmaterialname(String ipmaterialname) {
		this.ipmaterialname = ipmaterialname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public IssueProcessedItem(int ipid, int ipquantity, String ipname, int pid, String ipdate, String ipmaterialname,
			String pname) {
		super();
		this.ipid = ipid;
		this.ipquantity = ipquantity;
		this.ipname = ipname;
		this.pid = pid;
		this.ipdate = ipdate;
	this.ipmaterialname = ipmaterialname;
		this.pname = pname;
	}
	public IssueProcessedItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IssueProcessedItem [ipid=" + ipid + ", ipquantity=" + ipquantity + ", ipname=" + ipname + ", pid=" + pid
				+ ", ipdate=" + ipdate + ", ipmaterialname=" + ipmaterialname + ", pname=" + pname + "]";
	}
	
	

}
