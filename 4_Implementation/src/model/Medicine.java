package model;
import java.util.Date;

public class Medicine {
	private int medicineId;
	private String medicineName;
	private int batchNo;
	private Date expiryDate;
	private String packaging;
	private float price;
	private int quantity;
	
	
	
	public int getmedicineId()
	{
		return this.medicineId;
	}
	
	public String getmedicineName()
	{
		return this.medicineName;
	}
	public int getbatchNo()
	{
		return this.batchNo;
	}
	public Date getexpiryDate()
	{
		return this.expiryDate;
	}
	public String getpackaging()
	{
		return this.packaging;
	}
	public float getprice()
	{
		return this.price;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	//set
	public void setmedicineId (int newmedicineId)
	{
		this.medicineId = newmedicineId;
	}
	
	public void setmedicineName (String newmedicineName)
	{
		this.medicineName = newmedicineName;
	}
	public void setbatchNo (int newbatchno)
	{
		this.batchNo = newbatchno;
	}
	public void setexpiryDate(Date newexpiryDate)
	{
		this.expiryDate = newexpiryDate;
	}
	
	public void setpackaging (String newpackaging)
	{
		this.packaging = newpackaging;
	}
	public void setprice (float newprice)
	{
		this.price = newprice;
	}
	
	public void setquantity (int newquantity)
	{
		this.quantity = newquantity;
	}
}
