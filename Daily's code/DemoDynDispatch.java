package com.demo.dyn;

public class DemoDynDispatch {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	/*	Employee emp;  // refers variable to the abstract class 
		// emp = new Employee(); //cannot create an object for an abstract 

		// get the salary for the regular employee
		// RegualrEmp re = new RegularEmp(1,"Java",13000);
		
		emp = new RegularEmp(1,"java", 14000);
		int reg_emp_sal = emp.getEmpSal();
		System.out.println("Regular emp sal "+reg_emp_sal);
		
		//get the salary for the caontract employee
		emp = new ContractEmp(11,"Spring");
		int contr_emp_sal = emp.getEmpSal();
		System.out.println("Contract Emp sal "+contr_emp_sal);
	}

}

abstract class Employee{
	int emp_id;
	String emp_name;
	
	// constructor 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	void showEmpData() {	// concrete method
		System.out.println("emp data "+emp_id+" "+emp_name);
	}
	
	abstract int getEmpSal(); 	// abstract method
	
}
// child class
	class RegularEmp extends Employee{
		// spesific properties
		int bsal;

		public RegularEmp(int bsal) {
			super();
			this.bsal = bsal;
		}
		public RegularEmp(int emp_id, String emp_name,int bsal) {
			super(emp_id, emp_name);
			this.bsal = bsal;
			// TODO Auto-generated constructor stub
		}


		@Override
		int getEmpSal() {
			// TODO Auto-generated method stub
			return bsal * 2;
		}
		
	}

class ContractEmp extends Employee{
	
	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ContractEmp(int emp_id, String emp_name) {
		super(emp_id, emp_name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getEmpSal() {
		// TODO Auto-generated method stub
		return 25000;
	} 
	
	*/
		
		
		
		Vechile v;	// refers variable to abstract class
		
		// Car object
		v = new normCar(4,30,"Black");
		v.showVehDtl(); 	// full details 
		// int car_tot_avg = v.getVehDtl();
		System.out.println("This is Volkswagen VIRTUS ");
		
		System.out.println("-------------------------");
		
		// Bike Object
		v = new normBike(2,60,"Black");
		v.showVehDtl(); 	// full details 
		System.out.println("This is Yamaha MT15");
				
	
		}
	}

	// Abstract Class
	abstract class Vechile
	{
		int whl;
		int avg;
		String name;
		
		public Vechile() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Vechile(int whl, int avg, String name) 
		{
			super();
			this.whl = whl;
			this.avg = avg;
			this.name = name;
		}
		
		void showVehDtl()	// concrete method
		{
			System.out.println("Vehicle Info: " + whl + " wheels, Avg: " + avg + ", Color: " + name);

		}
		
		abstract int getVehDtl();		//abstract method
		
	}
	
	// Bike Class (child class)
	class normBike extends Vechile{
		// specific properties 
		int bAvg;

		public normBike(int bAvg) {
			super();
			this.bAvg = bAvg;
		}

		public normBike(int whl, int avg, String name) {
			super(whl, avg, name);
			//this.bAvg = bAvg;
		}

		@Override
		int getVehDtl() {
			// TODO Auto-generated method stub
			return avg;		// dynamic value
		}	
		
	}
	
	class normCar extends Vechile{

		public normCar() {
			super();
			// TODO Auto-generated constructor stub
		}

		public normCar(int whl, int avg, String name) {
			super(whl, avg, name);
			// TODO Auto-generated constructor stub
		}

		@Override
		int getVehDtl() {
			// TODO Auto-generated method stub
			return avg;
		}
		
		
	}
