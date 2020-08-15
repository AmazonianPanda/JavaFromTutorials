class cunstructors1{
	int id;
	String Name;
	int salary;
	
	cunstructors1(int userId, String userName){
		id = userId;
		Name = userName;
		
	}


	cunstructors1(int userId, String userName, int userSalary){
		this(userId, userName);
		salary = userSalary;
	}
	
	public static void main(String[] args){
		cunstructors1 instructor = new cunstructors1(1000, "Linjo", 100000);
		System.out.println("Name : " + instructor.Name);
		System.out.println("Salary/2.3 : " + instructor.salary/2.5);
	}
	




}