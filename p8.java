package java_practice;
//method overloading:-
//a class have more than one method with same name but different formal arguments either differ in length or differ in datatype
public class p8 
{
     public static void rest()
     {
    	 System.out.println("manish");
     }
     public static void rest(int a,int b)
     {
    	 int c=a+b;
    	 System.out.println(c);
     }
     public static void rest(String a,String b,String c)
     {
    	 System.out.print(a);
    	 System.out.print(b);
    	 System.out.println(c);
     }
     public static void main(String[] args) {
		rest();
		rest(20,50);
		rest("pqr","xyz","abc");
	}
     
}
