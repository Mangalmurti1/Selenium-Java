import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //String is an object that represent the sequence of characters.
	//We can use string object in two ways
		//1.Using literal
		String s1= "Mahesh Rajkumar Rokade";
		String S2= "Mahesh Rajkumar Rokade";
		//here java created only one object i.e.s1 because both objects having same values.
		
		//2.By memory allocation operator 'new'
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		//but here though the values are same but java created two different objects using new operator 
		//but automation people mostly can use secomd method
		
		
		//We can split the string using split method ...used space as delimiter
		/*String splitted[]= s1.split(" ");//here we created string array to store the splited words into it and then assign split method to iy.
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		System.out.println(splitted[2]);*/
		
		//Again we can use Rajkumar as delimiter
		/*String splitted[]= s1.split("Rajkumar");
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);*/
		
		
		//Here you can see that extra space included after Mahesh and before Rokade
		//we can remove it by using trim(). for this we need to take array index
		String splitted[]= s1.split("Rajkumar");
		System.out.println(splitted[0].trim());
		System.out.println(splitted[1].trim());
		
		//We can print charcter by character from given string using for loop.
		/*for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}*/
		
		
		//we can reverse the string char by char
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		
	}

}
