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

import java.util.Objects;

public class Student {
	static int scount =0;
	int rollno ;
	String name;
	double marks;
	public Student( String name, double marks) {
		Student.scount++;
		this.rollno=Student.scount;
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	
	public static int displayCount() {
		
		return scount;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}
	
//	public boolean equals(Object o) {
//		if (o instanceof Student) {
//			this.getRollno()
//			
//		}
//		return false;
//	}
//	
	
	
	

}
