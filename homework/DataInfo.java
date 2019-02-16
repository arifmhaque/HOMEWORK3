package homework;

public class DataInfo {
	String stuValue;
	InnerDataA inner = new InnerDataA();
	InnerDataB inner1 = new InnerDataB();
	public void database() {
		
		System.out.println("come from outer");
	}
	
	
	private class InnerDataA{
		String innerValueA;
		
	private void databaseA() {
		System.out.println("come from innerA");
		
	}
	}
	private class InnerDataB{
		String innerValueB;
		
	private void databaseB() {
		System.out.println("come from innerB");
	}
	}
		
	
	public static void main(String[] args) {
		DataInfo outer = new DataInfo();
		outer.database();
		outer.inner.databaseA();
		outer.inner1.databaseB();
		
		
	}
	

}
