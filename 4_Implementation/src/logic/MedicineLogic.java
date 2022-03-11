package logic;

import java.text.ParseException;
import java.util.List;

import model.Medicine;


public interface MedicineLogic {
	
	public Medicine createMedicine() throws ParseException;
	
	public Medicine searchMedicine(String name, List<Medicine> medicineList);
	
	public void display(Medicine medicine);
}

