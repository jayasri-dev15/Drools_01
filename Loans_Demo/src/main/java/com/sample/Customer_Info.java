package com.sample; //customer details

public class Customer_Info 

{
public String name;
public boolean IsworkingPerson;
public employment_status Status;
public String Address;
public String Nationality;
public Preferred_Loans loan_Types;
public int income;


Customer_Info(String name, boolean isworkingPerson, employment_status status, String address, String nationality,
		Preferred_Loans loan_Types, int income) 

{
	super();
	this.name = name;
	IsworkingPerson = isworkingPerson;
	Status = status;
	Address = address;
	Nationality = nationality;
	this.loan_Types = loan_Types;
	this.income = income;
}


public employment_status getStatus() {
	return Status;
}


public void setSTATUS(employment_status status) {
	Status = status;
}


public int getIncome() {
	return income;
}


public String getName() 
{
	return name;
}

public boolean isIsworkingPerson()
{
	return IsworkingPerson;
}

public void setIsworkingPerson(boolean isworkingPerson) 

{
	IsworkingPerson = isworkingPerson;
}

public String getAddress() 
{
	return Address;
}

public String getNationality() 
{
	return Nationality;
}


public Preferred_Loans getLoan_Types() {
	return loan_Types;
}


public void setLoan_Types(Preferred_Loans loan_Types) {
	this.loan_Types = loan_Types;
}


}
