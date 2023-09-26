package Encapsulation;

public class Student {
	// use of encapsulation is  to secure the date we are not exposing the date out of object  we are sending through only methods  so we can secure the date 
	//int rollNumber;
	//String name;
	//boolean isAttended;// if we give the variables like this we can access this variables outside the
				
     //if we dont wannna expose the data to rest of the world  for that we have to change the access level as private
	private int rollNumber;
	private String name;
	public int getRollNumber() {
		System.out.println("get Rollnumber  " );
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;// if we want to provide any log files or any conditions we want to provide we can create those all
		System.out.println("Set Rollnumber  " );

	}
	public String getName() {
		System.out.println("get name as Sivareddy ");
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("set name is Sivareddy ");
	}

	private boolean isAttended;
	public Student(int rollNumber) {
		this.rollNumber = rollNumber;// we are setting the roll number which is coming from constructer
		// if we want to call the class level variables if it is same names we have to
		// use this keyward

	}
// to write get and set methods give right click and go to source and click getters and setters 
	// to get date those methods are called getters 
	// to set the date those methods are called setters
	public void setStudentAttendance(boolean flag) {
		if (!isAttended)// if it is not attended access
			isAttended = flag;
		System.out.println("Teacher assigned the attandance to student");

	}

	public boolean getStudentAttendance() {
		System.out.println("Teacher access the attandance of student");
		return isAttended;

	}
}
