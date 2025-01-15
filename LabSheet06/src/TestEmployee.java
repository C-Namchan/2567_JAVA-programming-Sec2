
public class TestEmployee {

	public static void main(String[] args) {
		//create 2 objects to employee
	  // Class   attribute  new class()
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//set employee details
		emp1.setEmployeeDetails("Omega",45,20.0);
		emp2.setEmployeeDetails("Alpha",38,25.0);

		//Display Employee Details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		System.out.println();
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
	}

}
