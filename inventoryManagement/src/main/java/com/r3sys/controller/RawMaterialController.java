package com.r3sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.r3sys.Dao.RawMaterialDao;
import com.r3sys.modal.ProcessedItem;
import com.r3sys.modal.RawMaterial;

@Controller
public class RawMaterialController {
	
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	RawMaterialDao rawMaterialDao= (RawMaterialDao) context.getBean("rawMaterialDao");
	
	@RequestMapping("/undashboard")
	public String undashboard()
	{
	return "undashboard";
	}
	@RequestMapping("/dashboard")
	public String dashboard()
	{
	return "dashboard";
	}
	@RequestMapping("/rdashboard")
	public String rdashboard()
	{
	return "rdashboard";
	}
	@RequestMapping("/rawmaterial")
	public String rawmaterial()
	
	{
	return "rawmaterial";
	}
	
	@RequestMapping("/addraw")
	public RedirectView insertRawMaterial(@ModelAttribute RawMaterial rawMaterial,HttpServletRequest request,Model m){
		rawMaterialDao.insert(rawMaterial);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewrawmaterial");
		return redirectView;
	}
	@RequestMapping("/viewrawmaterial")
	public String viewrawmaterial(Model m)
	{
		List<RawMaterial> rawMaterial = rawMaterialDao.getAllRawMaterial();
		m.addAttribute("rawMaterial",rawMaterial);
		return "viewrawmaterial";
		
		
	}
	@RequestMapping(path="/delete/{id}",method= RequestMethod.GET)
	public RedirectView deleteRawMaterial(@PathVariable("id") int id,HttpServletRequest request)
	{
		rawMaterialDao.deleteRawMaterial(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewrawmaterial");
		
		return redirectView;
	}
	
	@RequestMapping(value="/updateRawQuantity",method= RequestMethod.GET)
	public String updateRawQuantity(@RequestParam int id, Model m)
	{
		m.addAttribute("id",id);
		return "updateRawQuantity";
	}
	@RequestMapping("/incrementRawMaterial")
	public RedirectView incrementRawMaterial(HttpServletRequest request)
	{
		System.out.println(request.getParameter("quantity"));
		System.out.println(request.getParameter("id"));
		int new_quantity =Integer.parseInt(request.getParameter("quantity"));
		int id =Integer.parseInt(request.getParameter("id"));
		
		RawMaterial updatedRawMaterial = rawMaterialDao.getRawMaterial(id);
		updatedRawMaterial.setRquantity(updatedRawMaterial.getRquantity()+new_quantity);
		rawMaterialDao.updateRawMaterial(updatedRawMaterial);
		
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewrawmaterial");
		return redirectView;
		
	}
	
	@RequestMapping("/unraw")
	public String unraw(Model m)
	{
		List<RawMaterial> rawMaterial=rawMaterialDao.getAllRawMaterial();
		m.addAttribute("rawMaterial",rawMaterial);
	    return "unraw";
	}
	
}
