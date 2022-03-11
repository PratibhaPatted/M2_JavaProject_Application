package logicImpl;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import logic.SupplierLogic;
import model.Medicine;
import model.Supplier;

public class SupplierLogicImpl implements SupplierLogic {
	@Override
	public Supplier createSupplier() throws ParseException
	{
		
	//	System.out.println("Enter supplierid");
		Scanner supplierscanner = new Scanner(System.in);
		
		Supplier obj1 = new Supplier();
		obj1.setSupplierId(0);
		
		
		System.out.println("Enter name");
		obj1.setName(supplierscanner.nextLine());
			
		return obj1;
		
		
	}
	@Override
	public void display(Supplier supplier)
	{
		System.out.println("Supplier id: " +supplier.getSupplierId());
		System.out.println("Name: " +supplier.getName());
	}
	
	@Override
	public Supplier searchSupplier(String name, List<Supplier> supplierList)
	{
		for(Supplier supplier: supplierList)
		{
			if(supplier.getName().contains(name.toLowerCase()))
			{
				return supplier;
			}
		}
		return null;
	}

}
