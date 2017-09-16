import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		//@SuppressWarnings("deprecation")
		Student st=new Student(502,"akhila",new Date(1997,7,2),75.75);
		Student stud=new Student(591,"joshna",new Date(1995,4,16),70.26);
		StudentGroup sg=new StudentGroup(2);
		sg.setStudent(st, 0);
		sg.setStudent(stud, 1);
		//System.out.println(sg.getStudent(0).getFullName());
		//System.out.println(sg.getStudent(1).getFullName());
		Student[] dup=sg.getStudents();
		System.out.println(dup[0].getFullName());
		System.out.println(dup[1].getFullName());
		System.out.println(sg.getCurrentAgeByDate(1));
			}

}
