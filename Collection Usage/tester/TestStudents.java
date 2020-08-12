package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import com.app.iacsd.Course;
import com.app.iacsd.Student;

import cust_comp.StudentDobComparator;
import cust_comp.StudentMarksComparator;
import cust_exc.StudentHandlingException;

import static utils.ValidationRules.*;
import static utils.CollectionUtils.*;

public class TestStudents {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			
			ArrayList<Student> students = populateData();
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("1: Register Student 2:Display student dtls 3:Display all students 4:update marks 5:Remove Student"
							+ "6:Sorting on student roll number 7:Sorting as per DOB 8:Sorting on Marks 9:Soorting as per name "
							+ "10:Sorting on Course 11:Display using iterator 12:Remove student of Specific Course 13:Exit");
					System.out.println("Choose option");
					switch (sc.nextInt()) {
					case 1: // reg new student
						System.out.println("Enter your details rollno name marks course dob(day-mon-yr)");
						students.add(new Student(sc.next(), sc.next(), sc.nextInt(), validateCourse(sc.next()),parseDate(sc.next())));

						break;
						
					case 2: 
						System.out.println("Enter roll no");
						Student s = new Student(sc.next());
						int index = students.indexOf(s);
						if (index == -1)
							throw new StudentHandlingException("Student rec not found : ID invalid!!!");
						System.out.println("Details " + students.get(index));
						break;
						
					case 3: // display all student details
						for (Student s1 : students)
							System.out.println(s1);
						break;
						
					case 4: // update marks
						System.out.println("Enter roll no n new marks");
						s = new Student(sc.next());
						index = students.indexOf(s);
						if (index == -1)
							throw new StudentHandlingException("Student rec not found : ID invalid!!!");
						students.get(index).setMarks(sc.nextInt());
						System.out.println("Marks updated!!!");
						break;
						
					case 5:// cancel admission
						System.out.println("Enter roll no");
						s = new Student(sc.next());
						if (!students.remove(s))
							throw new StudentHandlingException("Invalid roll no : can't remove rec");
						System.out.println("Student rec removed....");
						break;
						
					case 6: // sort students as per roll no
						Collections.sort(students);
						break;
						
					case 7: 
						Collections.sort(students, new StudentDobComparator());
						break;
						
					case 8:
						Collections.sort(students, new StudentMarksComparator());
						break;
						
					case 9: 
						Collections.sort(students, new Comparator<Student>() {
							@Override
							public int compare(Student o1, Student o2) {
								System.out.println("in compare : name");
								return o1.getName().compareTo(o2.getName());
							}
						});
						
						break;
						
					case 10: 
						// (custom ordering via ano inner class)
						Collections.sort(students, new Comparator<Student>() {

							@Override
							public int compare(Student o1, Student o2) {
								
								return o1.getChosenCourse().compareTo(o2.getChosenCourse());
							}

						});
						break;
						
					case 11:// input
						System.out.println("Student names via Iterator");
						Iterator<Student> itr=students.iterator();
						while(itr.hasNext())
							System.out.println(itr.next().getName());
						break;
						
					case 12 : // input
						System.out.println("Enter course name");
						Course c=validateCourse(sc.next());
						itr=students.iterator();
						while(itr.hasNext())
							if(itr.next().getChosenCourse().equals(c))
								itr.remove();
						break;
						
					case 13:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// System.out.println(e.getMessage());
				}
				// clearing scanner's buffer
				sc.nextLine();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
