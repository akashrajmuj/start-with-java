
public class Start {  // a simple program to demonstrate function calling using object 
	String str;
	
	public static void main(String[] args) 
		{
		Start obj=new Start(); 	//object of class Start
		System.out.println( obj.hello() ); //call hello method using object 
		}
	public String hello()
	{
		str="Hello World";  
		return(str);
	}
	
}
