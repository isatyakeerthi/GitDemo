package praticestatic;

public class EmpStatic {

	int id;
	int salary;
	static String ceo;
	
	 static
	{
		ceo = "Mallesh";
	}
	
	public void show()
	{
		System.out.println(id +":"+ salary +":" +ceo);
	}

}
