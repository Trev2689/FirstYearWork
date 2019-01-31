public class EmployeeUse
{
	public static void main(String args[])
	{
		Employee trevor = new Employee("Trevor", 1, 23);
		
		trevor.setName("Trevor");
		//trevor.setId(123);
		trevor.setAge(24);
		trevor.toString();
		trevor.getName();
		trevor.getAge();
	}
}