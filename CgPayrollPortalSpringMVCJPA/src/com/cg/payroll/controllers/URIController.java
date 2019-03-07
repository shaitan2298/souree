package com.cg.payroll.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.payroll.bean.Associate;

@Controller
public class URIController {
	
	private Associate associate;
	@RequestMapping(value= {"/","index"})
	public String getIndexPage()
	{
		return "indexPage";
	}
	
	@RequestMapping("/registration")
	public String getRegistrationPage()
	{
		return "registrationPage";
	}
	@RequestMapping("/findAssociateDetails")
	public String getFindAssociateDetails()
	{
		return "findAssociateDetails";
	}
	@RequestMapping("/calculateNetSalary")
	public String getCalculateNetSalary()
	{
		return "calculateNetSalary";
	}
	/*
	 * @RequestMapping("/allAssociateDetails") public String
	 * getFindAllAssociateDetails() { return "allAssociateDetails"; }
	 */
	
	@ModelAttribute
	public Associate getAsssociate()
	{
		associate = new Associate();
		return associate;
	}
	

}
