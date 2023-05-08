package linkedlist;

import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 */
public class StudentDriver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		StudentOperations stuOperationsOne = new StudentOperations();
        StudentOperations stuOperationsTwo = new StudentOperations();
        stuOperationsOne.addStudents();
        stuOperationsTwo.addStudents();
        System.out.println("List one: ");
        displayData(stuOperationsOne.getStudentList());
        stuOperationsOne.removeDuplicates();
        System.out.println("List one without duplicates: ");
        displayData(stuOperationsOne.getStudentList());       
        System.out.println("List two: ");
        displayData(stuOperationsTwo.getStudentList());
        System.out.println("List two duplicate names: ");
        System.out.println(stuOperationsTwo.
        		displayDuplicatesByRecursion(
                        stuOperationsTwo.getStudentList().iterator()));
    }
    
    public static void displayData(LinkedList<Student> studentList){
        System.out.print("{");
        for(Student eachStudent: studentList){
            System.out.println(eachStudent.getId()+", "+eachStudent.getName());
        }
        System.out.println("}");
    }


}

