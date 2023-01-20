package java_practice;
//return statement
public class p7 
{
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
    public static int substract(int a,int b,int c)
    {
    	int d=a-b-c;
    	return d;
    }
    public static int multiply(int a,int b)
    {
    	int c=a*b;
    	return c;
    }
    public static int division(int a,int b)
    {
    	int c=a/b;
    	return c;
    }
    public static void main(String[]args)
    {
    	int p=add(10,20);
    	int q=substract(50,10,30);
    	int r=multiply(10,50);
    	int s=division(10,5);
    	System.out.println(p);
    	System.out.println(q);
    	System.out.println(r);
    	System.out.println(s);
    }
}
