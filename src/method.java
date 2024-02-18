/* defining method outside the class and does not returned anything and calling method by creating object of class.
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         method m=new method();
         m.getdata();
		  
	}

	public void getdata()
	{
		System.out.println("Hi Mahesh");
		
	}
}*/

/*Here used String return type
public class method
{
   public static void main(String args[])
   {
	   method m=new method();
	   String s=m.getdata();
	   System.out.println(s);
   }
   public String getdata()
   {
	   return "Hi Mahesh i am returing string by using string return type";
   }
}*/
//Here we have used static type method. It will not required to call with class object because now getdata () is part of main().
public class method
{
  public static void main(String args[])
  {
	  String s=getdata();
	  System.out.println(s);
	  
  }
  public static String getdata()
  {
	 return "Hi mahesh i am returning string";
  }
}