package logicImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import logic.MedicineLogic;
import model.Medicine;

public class MedicineLogicImpl implements MedicineLogic {
	@Override
	public Medicine createMedicine() throws ParseException
	{
		
		System.out.println("Enter medicine name");
		Scanner sc = new Scanner(System.in);
		
		Medicine obj = new Medicine();
		obj.setmedicineName(sc.nextLine());
		
		System.out.println("Enter batchno");
		obj.setbatchNo(sc.nextInt());
		
		System.out.println("Enter expiry Date in format MM-dd-yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		obj.setexpiryDate(sdf.parse(sc.next()));
		sc.nextLine();
		
		System.out.println("Enter packaging ");
		obj.setpackaging(sc.nextLine());
		
		System.out.println("Enter price");
		obj.setprice(sc.nextFloat());
		
		obj.setquantity(0);
		
	
		return obj;
		
		
	}
	@Override
	public void display(Medicine medicine)
	{
		System.out.println("Medicine name: " +medicine.getmedicineName());
		System.out.println("Batchno: " +medicine.getbatchNo());
		System.out.println("Packaging: " +medicine.getpackaging());
		System.out.println("ExpiryDate: " +medicine.getexpiryDate());
		System.out.println("Price: " +medicine.getprice());
		System.out.println("Quantity: " +medicine.getQuantity());
	}
	
	@Override
	public Medicine searchMedicine(String name, List<Medicine> medicineList)
	{
		for(Medicine medicine: medicineList)
		{
			if(medicine.getmedicineName().contains(name.toLowerCase()))
			{
				return medicine;
			}
		}
		return null;
	}

}
