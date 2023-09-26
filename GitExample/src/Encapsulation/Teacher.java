package Encapsulation;

public class Teacher {
	public static void main(String args[]) {
		Student s = new Student(101);
		// s.isAttended = true;// if we give like this we dont have controll
		s.setStudentAttendance(true);
		s.getStudentAttendance();
		s.setName("Sivareddy");
		s.getName();
		s.setRollNumber(45);
		s.getRollNumber();
	}
}
