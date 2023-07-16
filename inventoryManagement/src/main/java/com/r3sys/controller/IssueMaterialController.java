package com.r3sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.r3sys.Dao.IssueMaterialDao;
import com.r3sys.Dao.RawMaterialDao;
import com.r3sys.modal.IssueMaterial;
import com.r3sys.modal.ProcessedItem;
import com.r3sys.modal.RawMaterial;

@Controller
public class IssueMaterialController {

	
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	IssueMaterialDao issueMaterialDao =(IssueMaterialDao) context.getBean("issueMaterialDao");
	ApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");
	RawMaterialDao rawMaterialDao = (RawMaterialDao) context1.getBean("rawMaterialDao");
	
	@RequestMapping("/issuedashboard")
	public String issuemenu(){
		
		return "issuedashboard";
	}
	
	@RequestMapping("/notsufficient")
	public String notsufficient(){
		
		return "notsufficient";
	}
	@RequestMapping("/viewissuematerial")
	public String viewprocessedItem(Model m)
	{
		List<IssueMaterial> issueMaterial = issueMaterialDao.getAllIssueMaterial();
		m.addAttribute("issueMaterial",issueMaterial);
		return "viewissuematerial";
		
	}
	
	@RequestMapping("/issueRawMaterial")
	public String issuematerial(){
		
		return "issueRawMaterial";
	}

	@RequestMapping("/issueRaw")
	public RedirectView addissuematerial(HttpServletRequest request){
		int new_quantity=Integer.parseInt(request.getParameter("iquantity"));
		System.out.println(new_quantity);
		int rid=Integer.parseInt(request.getParameter("iid"));
		
		String iname=request.getParameter("iname");
		String date=request.getParameter("date");
		
		RawMaterial up=rawMaterialDao.getRawMaterial(rid);
		
		
		if(new_quantity<=up.getRquantity()){
			up.setRquantity(up.getRquantity()-new_quantity);
			rawMaterialDao.updateRawMaterial(up);
			
			IssueMaterial issueMaterial= (IssueMaterial) context.getBean("issueMaterial");
			issueMaterial.setRid(rid);
			issueMaterial.setIid(0);
			issueMaterial.setImaterialname(up.getRname());
			issueMaterial.setIquantity(new_quantity);
			issueMaterial.setIname(iname);
			issueMaterial.setDate(date);
			
			issueMaterialDao.insert(issueMaterial);
			
			
			
			RedirectView redirectView=new RedirectView();
			redirectView.setUrl(request.getContextPath()+"/viewissuematerial");
			return redirectView;
			
		  }
	else{
			RedirectView redirectView=new RedirectView();
			redirectView.setUrl(request.getContextPath()+"/notsufficient");
			return redirectView;
			
		}
		
	
		
	}
	

}
