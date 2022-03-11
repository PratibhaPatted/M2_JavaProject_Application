package model;

public class Supplier extends Medicine {
	private int supplierId;
	private String name;
	
	public int getSupplierId()
	{
		return this.supplierId;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setSupplierId( int newSupplierId)
	{
		this.supplierId = newSupplierId;
	}
	
	public void setName( String newName)
	{
		this.name = newName;
	}

}
