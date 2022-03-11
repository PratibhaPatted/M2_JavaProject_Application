package logic;

import java.text.ParseException;
import java.util.List;

import model.Supplier;

public interface SupplierLogic {
	public Supplier createSupplier() throws ParseException;
	
	public Supplier searchSupplier(String name, List<Supplier> supplierList);
	
	public void display(Supplier supplier);

}
