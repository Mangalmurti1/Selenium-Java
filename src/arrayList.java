import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> a=new ArrayList <String>();
		a.add("Mahesh");
		a.add("Rohit");
		a.add("Manisha");
		//System.out.println(a.get(2));
		
		for (int i=0;i<a.size();i++)
		{
			
			System.out.println(a.get(i));
		}
		
		System.out.println(a.contains("Rohit"));//it returns the boolean value true or false
		
	}

}
