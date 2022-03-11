package model;

public class SalesBill   {
	private int quantity;
	private float totalPrice;
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public float getTotalPrice()
	{
		return this.totalPrice;
	}
	
	public void setQuantity( int newQuantity)
	{
		this.quantity = newQuantity;
	}
	
	public void setTotalPrice(float newTotalPrice)
	{
		this.totalPrice = newTotalPrice;
	}


}
