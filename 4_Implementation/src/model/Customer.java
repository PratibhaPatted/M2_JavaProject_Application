package model;

public class Customer  {
	private String customerName;
	private int customerNo;
	
	
	
	
	public String getCustomerName() //getMethod
	{
		return this.customerName;
	}
	
	public int getCustomerNo()
	{
		return this.customerNo;
	}
	
	 public void setCustomerName( String newCustomername) //setMethod
	 	{
		 this.customerName = newCustomername;
	   }
	 
	 public void setCusyomerName( int newCustomerno) 
	 	{
		 this.customerNo = newCustomerno;
	   }
}
