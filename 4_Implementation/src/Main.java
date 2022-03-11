import java.util.*;

import logic.MedicineLogic;
import logic.SupplierLogic;
import logicImpl.MedicineLogicImpl;
import logicImpl.SupplierLogicImpl;
import model.Medicine;
import model.Supplier;
import java.lang.Boolean;
import java.text.ParseException;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		List<Medicine> medicineList = new ArrayList<Medicine>(); 
		MedicineLogicImpl medicineLogic = new MedicineLogicImpl();
		
		List<Supplier> supplierList = new ArrayList<Supplier>(); 
		SupplierLogicImpl supplierLogic = new SupplierLogicImpl();
		
		System.out.println("Welcome to Medical Store System");

		boolean loop = true;
		while(loop) {


			System.out.println("Menu");
			System.out.println("Enter the choice");

			System.out.println("1. Medicine");
			System.out.println("2. Supplier");
			System.out.println("3. Billing");
			System.out.println("0. Exit");

			Scanner sc= new Scanner(System.in);  
			int num = sc.nextInt();


			switch(num){  	    
			case 1: System.out.println("Medicine"); 
			
			boolean medicineloop = true;
			while(medicineloop) {

				System.out.println("Enter the choice");			
				System.out.println("1. Create Medicine");
				System.out.println("2. Update Medicine");
				System.out.println("3. Search Medicine");
				System.out.println("0. Exit");

			//	Scanner medicinesc = new Scanner(System.in);  
				int m = sc.nextInt();	
				switch(m){  	    
				case 1: System.out.println("Create Medicine"); 
				
				Medicine medicine = medicineLogic.createMedicine();
				medicineList.add(medicine);
						
				break;  
				case 2: System.out.println("Update Medicine");  
				
				
				break;  
				case 3: System.out.println("search Medicine"); 
				System.out.println("Enter medicine name");
				sc.nextLine();
				String name = sc.nextLine();
				Medicine searchmedicine = medicineLogic.searchMedicine(name,medicineList);
				if(searchmedicine == null)
				{
					System.out.println("Medicine not found");
					
				}
				else {
					medicineLogic.display(searchmedicine);
				}
				
				
				break;  
				case 0:

					medicineloop = false;
					break;

				default:System.out.println("Not in choice");  

				}
			}
			
		
			break;  
			case 2: System.out.println("Supplier"); 
			
			boolean supplierloop = true;
			while(supplierloop) {
				System.out.println("Enter the choice");
				System.out.println("1. Create Supplier");	
				System.out.println("2. Update Supplier");
				System.out.println("3. Search Supplier");
				System.out.println("0. Exit");	
				
		//		Scanner sc = new Scanner(System.in);  
				int m = sc.nextInt();
				switch(m){  	    
				case 1: System.out.println("Create Supplier");  
				
				Supplier supplier = supplierLogic.createSupplier();
				supplierList.add(supplier);
				
				break;  
				case 2: System.out.println("Update Supplier");  
				break;  
				case 3: System.out.println("search Supplier"); 
				
				System.out.println("Enter Supplier name");
				sc.nextLine();
				String name = sc.nextLine();
				Supplier searchsupplier = supplierLogic.searchSupplier(name,supplierList);
				if(searchsupplier == null)
				{
					System.out.println("Supplier not found");
					
				}
				else {
					supplierLogic.display(searchsupplier);
				}
				break;  
				case 0:

					supplierloop = false;
					break;

				default:System.out.println("Not in choice");  

				}
			}
			
			break;  
			
			case 3: System.out.println("Billing"); 
			billMenu();
			break;  
			case 0:

				loop = false;
				break;

			default:System.out.println("Not in choice");  
			}  
		}
	}

	public static void billMenu()
	{
		boolean loop = true;
		while(loop) {
			System.out.println("Enter the choice");

			System.out.println("1. Sales Bill");
			System.out.println("2. Purchase Bill");
			System.out.println("0. Exit");

			Scanner sc = new Scanner(System.in);  
			int m = sc.nextInt();
			switch(m){  	    
			case 1: System.out.println("Sales Bill");  
			break;  
			case 2: System.out.println("Purchase Bill");  
			break;   
			case 0:

				loop = false;
				break;

			default:System.out.println("Not in choice");  

			}
		}

	}

}
