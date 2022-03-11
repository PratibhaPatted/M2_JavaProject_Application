package model;

public class PurchaseBill   {
	private int quantity;
	private float totalPrice;
	
	
	public int getQuantity() //getMethod
	{
		return this.quantity;
	}
	
	public float gettotalPrice()
	{
		return this.totalPrice;
	}
	
	public void setquantity (int newQuantity)
	{
		this.quantity = newQuantity;
	}
	
	public void settotalPrice (float newTotalPrice)
	{
		this.totalPrice = newTotalPrice;
	}

}
