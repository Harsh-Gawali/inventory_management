package com.r3sys.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="rawmaterial")
@Component
public class RawMaterial {
	    @Id
		private int rid;
	    private int rquantity;
	    private int rcostPerUnit;
		private String rname;
		private String unit;
		public int getRid() {
			return rid;
		}
		public void setRid(int rid) {
			this.rid = rid;
		}
		public int getRquantity() {
			return rquantity;
		}
		public void setRquantity(int rquantity) {
			this.rquantity = rquantity;
		}
		public int getRcostPerUnit() {
			return rcostPerUnit;
		}
		public void setRcostPerUnit(int rcostPerUnit) {
			this.rcostPerUnit = rcostPerUnit;
		}
		public String getRname() {
			return rname;
		}
		public void setRname(String rname) {
			this.rname = rname;
		}
		public String getUnit() {
			return unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public RawMaterial(int rid, int rquantity, int rcostPerUnit, String rname, String unit) {
			super();
			this.rid = rid;
			this.rquantity = rquantity;
			this.rcostPerUnit = rcostPerUnit;
			this.rname = rname;
			this.unit = unit;
		}
		public RawMaterial() {
			super();
			// TODO Auto-generated constructor stub
		}
				
		
		

	}



