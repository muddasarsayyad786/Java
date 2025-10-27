/*
 * Create a Student class with name and rollno, total marks
Implement default as well as parameterized constructor
Implement getter - setter and toString method

Note : The rollno should be auto generated based on number of student objects created
Display the count of total students using displyStudentCount method

3. Create a Department class with Student array
1. Calculate Average marks for all student
2. Calculate percentage
 */

package Collections;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	List<Student> s = new ArrayList<Student>();
	
	{
	s.add(new Student("Max",98));
	s.add(new Student("Sam",99));
	s.add(new Student("aaa",66));
	}
	
	public float avgMarks() {
		float total =0 ;
		for (Student i : s) {
			total+=i.getMarks();
			
		}
		return total /  s.size();
		
		
	}
	


public static void main (String[] args) {
	Department d = new Department();
	System.out.println(d.avgMarks());
	System.out.println(Student.displayCount());
	
}
}