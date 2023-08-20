package JavaCollections;

public class MuttableClass {

	String EmpName;
	
	public String getEmpName() {
		return EmpName;
		
	                       }
	public void setEmpName(String empname) {
		this.EmpName = empname;
		
	                   }
	public MuttableClass(String empname) {
		this.EmpName = empname;
		
	              }
	public static void main(String[] args) {
		MuttableClass e = new MuttableClass("Tom");
		System.out.println(e.getEmpName());
		e.setEmpName("Peter");
		System.out.println(e.getEmpName());

	}

}
