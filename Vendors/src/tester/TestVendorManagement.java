package tester;

import java.sql.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.dao.VenderDaoImple;
import com.pojo.Vendors;

public class TestVendorManagement {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);
				
				)
		{
			VenderDaoImple dao = new VenderDaoImple();
			
			boolean exit = false;
			while( !exit )
			{
				System.out.println("1.Show Table data \n"
						+ "2.Insert Vendor Details \n"
						+ "3.Get Vendor Details \n"
						+ "4.Update Vendor Details \n"
						+ "5.Remove Vendor \n"
						+ "6.Exit");
				
				switch (sc.nextInt()) {
				
				case 1:System.out.println("Displaying Table Data : ");
						dao.showTable();
						break;
						
				case 2: System.out.println("Insert Values to the table");
				System.out.println("Id :" );
				System.out.println("Name :");
				System.out.println("email :" );
				System.out.println("city :" );
				System.out.println("phone :" );
				System.out.println("reg date format(yyyy-mm-dd) :");
				
				HashMap<Integer, Vendors> hm = dao.insertVendorDetails(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextLong(),Date.valueOf(sc.next()));
				
				//hm.keySet().forEach(System.out::println);
				
				System.out.println(hm.values());
				break;
					
				case 3:System.out.println("Getting details of all vendor of specific city");
				System.out.println("Enter city");
				System.out.println(dao.getVendorDetails(sc.next()));
				
				break;
					
				case 4:System.out.println("Update vendors city and phone details using id");
				System.out.println("Enter city  ");
				System.out.println("Enter phone ");
				System.out.println("Enter id");
				dao.updateVendorDetails(sc.next(), sc.nextLong(), sc.nextInt());
				
				break;
					
				case 5:System.out.println("Remove vendor using id");
				System.out.println("Enter id");
				dao.deleteVendor(sc.nextInt());
				
				break;
					
					
				case 6:System.out.println("Exiting the database ");
					dao.cleanUp();
					exit = true;
					break;
			
					
				default:System.out.println("Enter Valid Choice");
					break;
				}
			}
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
