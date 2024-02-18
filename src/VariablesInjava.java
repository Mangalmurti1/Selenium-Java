import java.util.ArrayList;

public class VariablesInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Variables
 int a=10;
 double b=12.12;
 char c='d';
 String d="Mahesh";
 boolean g=true;
 
 //Lets print it 
 /*System.out.println(a+" is the value of integer type variable 'a'");
 System.out.println(b+" is the value of double type variable 'b'");
 System.out.println(c+" is the value of character type variable 'c'");
 System.out.println(d+" is the value of string type variable 'd'");
 System.out.println(g+" is the value of boolean type variable 'g'");*/
	
 //Arrays
 //First Way
 /*int arr[]= new int[4];
 arr[0]=1;
 arr[1]=2;
 arr[2]=3;
 arr[3]=4;
 System.out.println(arr[0]+" is the value of first value of array");
 System.out.println(arr[1]+" is the value of second value of array");
 System.out.println(arr[2]+" is the value of third value of array");
 System.out.println(arr[3]+" is the value of fourth value of array");*/
 
 int arr2[]= {8,7,6,5,4,3,2,1,300};
 for(int i=0;i<arr2.length;i++)
	{
		if (arr2[i]% 2 == 0)
		{
			
		System.out.println(arr2[i]);
		}
		
	}
 
 //for loop-we are printing above array values.
 
	
/*for(int i=0;i<arr.length;i++)
 {
	
	 {
	 System.out.println(arr[i]);
     
 }
 
 for(int v=0;v<arr2.length;v++)
 { 
	 System.out.println(arr2[v]);
	}

}
	}


 String zero[] = {"Shiv","Ganesh","VitthaRukmini"};
	
	for(int i=0;i<3;i++)
	{
		System.out.println(zero[i]);
		
	}*/


}
}



