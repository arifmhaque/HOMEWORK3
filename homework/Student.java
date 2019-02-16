package homework;

public abstract class Student {
	public String collegeName;
	public String studentName;
	private int SSN;
	private int id;
	
	Student(){
		System.out.println("No info");
	}
	
	Student(String collegeName, String studentName){
		this.collegeName = collegeName;
		this.studentName = studentName;
	}
	
	Student(int SSN, int id){
		this.SSN = SSN;
		this.id = id;
	}
	
	
	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void majorSubject();

	public void display() {
		System.out.println("COllegeName =" + collegeName);
		System.out.println("StudentName =" + studentName);
		System.out.println();
		}
	public void display1() {
		System.out.println("SSN = " +getSSN());
		System.out.println("ID = " +getId());
	}
	

}
