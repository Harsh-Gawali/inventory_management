package com.r3sys.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.r3sys.modal.IssueMaterial;

@Component
public class IssueMaterialDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	// inserting the data
	@Transactional //for making transaction with database like insert, delete, update
	public int insert(IssueMaterial issueMaterial) {
	// insert
	Integer i = (Integer) this.hibernateTemplate.save(issueMaterial);
	return i;
	}
	
	
	// get the single data(object)
	public IssueMaterial getIssueMaterial(int Rid) {
		IssueMaterial issueMaterial = this.hibernateTemplate.get(IssueMaterial.class, Rid);
	return issueMaterial;
	}
	
	
	// get all students(all rows)
	public List<IssueMaterial> getAllIssueMaterial() {
	List<IssueMaterial> issueMaterial = this.hibernateTemplate.loadAll(IssueMaterial.class);
	return issueMaterial;
	}
	
	
	// deleting the data
	@Transactional //for making transaction with database like insert, delete, update
	public void deleteIssueMaterial(int Rid) {
		IssueMaterial issueMaterial = this.hibernateTemplate.get(IssueMaterial.class, Rid);
	this.hibernateTemplate.delete(issueMaterial);
	}
	
	
	// updating data...
	@Transactional //for making transaction with database like insert, delete, update
	public void updateIssueMaterial(IssueMaterial issueMaterial) {
	this.hibernateTemplate.update(issueMaterial);
	}
	
	public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
	}
	

}
