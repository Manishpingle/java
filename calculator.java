package java_practice;

public class calculator 
{
    public static void add()
    {
    	int a=10;
    	int b=20;
    	int c=30;
    	int d=a+b+c;
    	System.out.println(d);
    }
    public static void substract()
    {
    	int a=30;
    	int b=20;
    	int c=a-b;
    	System.out.println(c);
    }
    public static void multiply()
    {
    	int a=3;
    	int b=4;
    	int c=5;
    	int d=a*b*c;
    	System.out.println(d);
    }
    public static void division()
    {
    	int a=10;
    	int b=5;
    	int c=a/b;
    	System.out.println(c);
    }
    public static void main(String[] args) 
    {
		add();
		substract();
		multiply();
		division();
	}
}
