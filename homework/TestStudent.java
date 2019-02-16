package homework;

public class TestStudent {

	public static void main(String[] args) {
		
		
	   /* Student st = new Student();
		Student st1 = new Student("BMCC", "ARIF");
		Student st2 = new Student(733,101);
		st2.setSSN(733);
		st2.setId(101);*/
		
		//st1.display();
		//st2.display1();
		College cl = new College();
        cl.collegeName ="Baruch";
		cl.studentName = "Tushar";
		cl.setSSN(733);
		cl.setId(101);
		cl.display();
		cl.display1();
		cl.departmentName();
		cl.cafeteria();
		cl.library();
		cl.majorSubject();
		Department dp = new College();
		dp.departmentName();
		Student st3 = new College();
		st3.collegeName = "bau";
		st3.studentName = "motin";
		st3.setSSN(734);
		st3.setId(102);
		st3.display();
		st3.majorSubject();
		st3.display1();
		
	}

}
