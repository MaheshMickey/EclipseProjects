package linkedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 */
public class StudentOperations {
	/**
	 * Private instance variables
	 */
	LinkedList<Student> studentList;
	LinkedList<Student> remList;

	/**
	 * No arg constructor and initialising Linked List
	 */
	public StudentOperations() {
		super();
		this.studentList = new LinkedList<Student>();
	}
	 
	
	/**
	 * Getter method for Student List
	 * @return returns the list
	 */
	public LinkedList<Student> getStudentList() {
		return studentList;
	}

	/**
	 * Setter method for student list to set the list values
	 * @param studentList holds the linked list
	 */

	public void setStudentList(LinkedList<Student> studentList) {
		this.studentList = studentList;
	}

	/**
	 * AddStudent() to add the students to the linked list
	 * @throws FileNotFoundException if input file doesnt exist
	 */

	public void addStudents() throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("input.txt"));
		
		while(scan.hasNext())
		{
			String filename = scan.nextLine();
			String id= scan.nextLine();
			int idd = Integer.parseInt(id);
//			filename=scan.nextLine();
//			id=scan.nextInt();
			Student stu =new Student(filename,idd);
			studentList.add(stu);
			//System.out.println(stu);
		}
		scan.close();
	}
	/**
	 * Removeduplicates() to remove the duplicates from the list
	 */
	
	public void removeDuplicates() {
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.subList(0, i).contains(studentList.get(i)))
			{
				//remList = new LinkedList<Student>();
				studentList.remove(i);
			}
		}
		
	}
	
	/**
	 * Displaying the removed elements from the list
	 * @param st holds the Iterator of type Student
	 * @return returns string 
	 */
	public String displayDuplicatesByRecursion(Iterator<Student> st) {
		String dup=" ";
//		int c=0;
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.subList(0, i).contains(studentList.get(i)))
			{
				//remList = new LinkedList<Student>();
				String m = studentList.get(i).getName();
				if(!dup.contains(m))
				{
					dup = dup+" "+m + ",";
				}
				studentList.remove(i);
//				c++;
			}
		}
		return dup;
		
	}

	



	
}
