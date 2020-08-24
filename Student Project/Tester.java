package day5;

import static day5.Functions.percentageStudent;
import static day5.Functions.totalMarks;
import static day5.Validation.parseDate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Tester {
	
	public static void main(String[] args) {
		
		
		String fileName = "student_details.txt";
		
		try ( Scanner sc = new Scanner( System.in );
				FileReader fr = new FileReader( fileName );
				BufferedReader br = new BufferedReader( fr );		
				)
		{
			
			List<Student> l1 = new ArrayList<>();
			
			int exit=0;
			
			while ( exit == 0 )
			{
			
				System.out.println(" 1. Read the data from textfile \n"
						+ "2. Show the list of all students \n"
						+ "3. show Names, marks and percentage of all students \n"
						+ "4. List of Toppers \n"
						+ "5. Students with lowest marks \n"
						+ "10: EXIT ");
				
				System.out.println(" ---------- ENTER YOUR CHOICE ----------");
				
				
			switch ( sc.nextInt() ) {
			
			case 1 : 
				
				System.out.println( "------------------ Reading Process Started -----------------" );
				
				br.readLine();
				
				String s = null;

				while ( ( s = br.readLine() ) != null )
				{

					//System.out.println(s);
					
					String [] l2 = s.split(" ");
					
					l1.add( new Student(Integer.parseInt(l2[0]), 
							l2[1], 
							l2[2], 
							l2[3], 
							l2[4], 
							parseDate(l2[5]), 
							l2[6] , 
							Integer.parseInt( l2[7] ) , 
							Integer.parseInt( l2[8] ) ,
							Integer.parseInt( l2[9] ) , 
							Integer.parseInt( l2[10] ) ,
							Integer.parseInt( l2[11]) ) );
					
					
				}
				
				System.out.println("<------------- Reading process Completed ----------->");
				break;
				
			case 2:
				for ( Student q : l1 )
					System.out.println( q );
				System.out.println("--------------------------------------");
				break;
				
			case 3:
				System.out.println("-------- List if all Students ------------");
				
				// calculating the total marks and percentage of the students and displaying them.
				for ( Student stu : l1 )
				{
					
					int y=totalMarks( stu.getChem() , stu.getMath() , stu.getPhy() , stu.getEn(), stu.getComp() );
					
					float f=percentageStudent(y);
					
					System.out.println("Name of Student :" +stu.getFirstName() +" " +stu.getLastName());
					
					System.out.println("Total Marks Obtained :" +y);
					
					System.out.println("Percentage Obtained :" +f);
				
				
				}
				
				break;
				
			case 4: // List of toppers
				System.out.println("Topper of the school ");
				// Student st;
				 // l1.stream().map(Functions::totalMarks(st.getChem(),st.getMath(),st.getPhy(),st.getEn(),st.getComp()));
				 
				
				
				List<Integer>totalmarks=l1.stream().map(r -> Functions.totalMarks(r.getChem(), r.getMath(), r.getComp(), r.getEn(), r.getPhy())).collect(Collectors.toList());
				
				
				
			case 5: // List of Students that scored lowest marks
				int exi = 0;
				while ( exi == 0 )
				{
				System.out.println("1. Students  with lowest marks in chemistry \n"
						+ "2. Students with lowest marks in physics \n"
						+ "3. Students with lowest marks in Maths \n"
						+ "4. Students with lowest marks in Computer \n"
						+ "5. Students with lowest marks in English \n"
						+ "6. Exit ");
				
				System.out.println("----- ENTER YOUR CHOICE -----");
				
				switch ( sc.nextInt() ) {
				
					case 1:
					l1.sort(new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							
							if ( o1.getChem() == o2.getChem())
							return 0;
							else if ( o1.getChem() < o2.getChem())
							return -1;
							else
								return 1;
							
						}
					});
					
					int j = 0;
					System.out.println("Last 3 students in chemistry subject");
					while ( j < 3 )
					{
						System.out.println( l1.get(j) );
						j++;
					}
					
					break;
				
						case 2:
					// ------------------ top 3 lowest in Physics ------------------------------------
					
					l1.sort(new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							// TODO Auto-generated method stub
							
							if ( o1.getPhy() == o2.getPhy())
							return 0;
							else if ( o1.getPhy() < o2.getPhy())
							return -1;
							else
								return 1;
							
						}
					});
					
					j=0;
					System.out.println("Last 3 students in Physics subject");
					while ( j<3 )
					{
						System.out.println( l1.get(j) );
						j++;
					}
					
							break;
				
							case 3:// ------------------ students with less than 50 marks in Maths -----------------------------------
								
								System.out.println("Students with marks less than and equal to 50 in Maths");
								
								l1.stream().filter( o -> (o.getMath() <= 50)).forEach(System.out::println);
								
								break;
					
							case 4:// ------------------ top 3 lowest in Computer ------------------------------------
								
								System.out.println("Student details ");
									
								l1.stream().sorted(( o1 , o2 ) -> o1.compare(o1, o2)).limit(3).forEach(System.out::println);
								
								break;
					
							case 5:// ------------------ top 3 lowest in English ------------------------------------
								
								l1.stream().sorted( new Comparator<Student>() {
									
									public int compare(Student o1, Student o2) {
										if ( o1.getEn() == o2.getEn())
										return 0;
										else if ( o1.getEn() < o2.getEn())
										return -1;
										else
											return 1;
										
									}
								}).limit(3).forEach(System.out::println);
								
								break;
				
							case 6: exi = 1;
								break;
				}
				
				
				}
				
			case 6:
				System.out.println(" Average marks scored by students in maths ");
				
				System.out.println(l1.stream().mapToInt(Student::getMath).average().getAsDouble());
				break;
				
			case 7:
				System.out.println(" Count number of students who scored less than 50 in chemistry ");
				
				System.out.println(l1.stream().mapToDouble(Student::getChem).filter(o -> o <= 50).count());
				break;
				
			case 8:
			
				System.out.println(" minimum marks obtained in English Subject");
				
				System.out.println(l1.stream().mapToDouble(Student::getEn).min().getAsDouble());
				break;
			
			case 9:
				System.out.println(" Maximum marks obtained in Computer subject");
				
				System.out.println(l1.stream().mapToDouble(Student::getComp).max().getAsDouble());
				break;
				
			case 10: exit = 1;
				break;
			
			case 11: // -------------- add new sports field to students -------------------
				
				System.out.println("Enter the roll number of the student");
				int rollNum=sc.nextInt();
				
				for (Student y : l1)
				{
					
					if ( rollNum == y.getRollNum())
					{
						System.out.println("Student record found !");
						
						System.out.println("Enter the name of the sports");
						String spName=sc.next();
						
						System.out.println("Enter the points ");
						int point=sc.nextInt();
						
						//l1.add(y.addSport(spName, point));
						
						
					}
					
				}
				break;
				
			
			}
			
			}

			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
