class StudentTest{
	public static void main(String[] args) {
		int[] studentIds = new int[] {1001,1002,1003};
		
			
		Student s1 = new Student(studentIds[0],"Linjo");
		s1.gender = "male";
		
		Student s2 = new Student(studentIds[1],"Linto");
		s2.gender = "male";
		
		Student s3 = new Student(studentIds[2],"joan");
		s3.gender = "female";
		
		System.out.println("Student1 Name: " + s1.name);
		System.out.println("Student2 Name: " + s2.name);
		System.out.println("Student3 Name: " + s3.name);
		System.out.println("Student3 Gender: " + s3.gender);
		
		s3.updateProfile("Johna");
		System.out.println("Student3 New Name: " + s3.name);
	}
}