package JavaCollections;
// immutable class should follow some rules
//1. class should be declared as final
//2. member variables should be declared as private 
//3. only getter are allowed 
public final class ImuttableClass {
    private String Emp_Name;
    
    public String getempname() {
		return Emp_Name;
                      }
    public ImuttableClass(String Emp_name) {
    	this.Emp_Name = Emp_name;
    	
               }
	public static void main(String[] args) {
		ImuttableClass emp = new ImuttableClass("Smith");
		System.out.println(emp.getempname());
	}

}
