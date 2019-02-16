package homework;

public class College extends Student implements Department {
	/*College(String collegeName, String studentName){
		this.collegeName =collegeName;
		this.studentName = studentName;
	}*/
	
	public void display() {
		System.out.println("COllegeName =" + collegeName);
		System.out.println("StudentName =" + studentName);
		System.out.println();
		}

	@Override
	public void departmentName() {
		System.out.println("Department Name is Economics");
		
	}

	@Override
	public void majorSubject() {
		System.out.println("Major Subject is MicroEconomics");
		
		
	}

	@Override
	public void cafeteria() {
		System.out.println("we have nice cafeteria");
	}

	@Override
	public void library() {
		System.out.println("we have lots of book in the library");
		
	}

   
   
		


	

	

}
