package com.cg.payroll.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Salary 
{
	private int basicSalary, hra, conveyenceAllowance;
	private int otherAllowance, personalAllowance, monthlyTax, epf;
	private int companyPf, grossSalary, netSalary;

	public Salary()
	{

	}
	

	public Salary(int basicSalary, int epf, int companyPf) {
		super();
		this.basicSalary = basicSalary;
		this.epf = epf;
		this.companyPf = companyPf;
		/*
		 * this.hra=(basicSalary* 30)/100;
		 * this.conveyenceAllowance=(basicSalary*30)/100; this.otherAllowance =
		 * basicSalary/4; this.personalAllowance = basicSalary/5; this.grossSalary =
		 * (basicSalary + conveyenceAllowance + otherAllowance + personalAllowance +
		 * companyPf + epf)*12; this.netSalary = grossSalary -companyPf - epf;
		 */
		
	}


	public Salary(int basicSalary, int hra, int conveyenceAllowance, int otherAllowance, int personalAllowance,
			int monthlyTax, int epf, int companyPf, int grossSalary, int netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.hra = (int)(basicSalary*0.3);
		this.conveyenceAllowance = (int)(basicSalary * 0.3);
		this.otherAllowance = (int)(basicSalary * 0.25);
		this.personalAllowance = (int)(basicSalary*0.2);
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}


	public int getBasicSalary() 
	{
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) 
	{
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) 
	{
		this.hra = hra;
	}

	public int getConveyenceAllowance() 
	{
		return conveyenceAllowance;
	}

	public void setConveyenceAllowance(int conveyenceAllowance) 
	{
		this.conveyenceAllowance = conveyenceAllowance;
	}

	public int getOtherAllowance() 
	{
		return otherAllowance;
	}

	public void setOtherAllowance(int otherAllowance) 
	{
		this.otherAllowance = otherAllowance;
	}

	public int getPersonalAllowance()
	{
		return personalAllowance;
	}

	public void setPersonalAllowance(int personalAllowance) 
	{
		this.personalAllowance = personalAllowance;
	}

	public int getMonthlyTax() 
	{
		return monthlyTax;
	}

	public void setMonthlyTax(int monthlyTax) 
	{
		this.monthlyTax = monthlyTax;
	}

	public int getEpf() 
	{
		return epf;
	}

	public void setEpf(int epf) 
	{
		this.epf = epf;
	}

	public int getCompanyPf() 
	{
		return companyPf;
	}

	public void setCompanyPf(int companyPf) 
	{
		this.companyPf = companyPf;
	}

	public int getGrossSalary() 
	{
		return grossSalary;
	}

	public void setGrossSalary(int grossSalary) 
	{
		this.grossSalary = grossSalary;
	}

	public int getNetSalary()
	{
		return netSalary;
	}

	public int setNetSalary(int netSalary) 
	{
		return this.netSalary = netSalary;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + basicSalary;
		result = prime * result + companyPf;
		result = prime * result + conveyenceAllowance;
		result = prime * result + epf;
		result = prime * result + grossSalary;
		result = prime * result + hra;
		result = prime * result + monthlyTax;
		result = prime * result + netSalary;
		result = prime * result + otherAllowance;
		result = prime * result + personalAllowance;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		if (basicSalary != other.basicSalary)
			return false;
		if (companyPf != other.companyPf)
			return false;
		if (conveyenceAllowance != other.conveyenceAllowance)
			return false;
		if (epf != other.epf)
			return false;
		if (grossSalary != other.grossSalary)
			return false;
		if (hra != other.hra)
			return false;
		if (monthlyTax != other.monthlyTax)
			return false;
		if (netSalary != other.netSalary)
			return false;
		if (otherAllowance != other.otherAllowance)
			return false;
		if (personalAllowance != other.personalAllowance)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Salary [basicSalary=" + basicSalary + ", hra=" + hra + ", conveyenceAllowance=" + conveyenceAllowance
				+ ", otherAllowance=" + otherAllowance + ", personalAllowance=" + personalAllowance + ", monthlyTax="
				+ monthlyTax + ", epf=" + epf + ", companyPf=" + companyPf + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}


}
