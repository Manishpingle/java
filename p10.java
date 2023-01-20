package java_2;

public class p10
{
	static String a="celerio";
	static String b="ciaz";
	static String c="thar";
	static
	{
		System.out.println("This is a static block initializer");
	}
	public static void car()
	{
		System.out.println(a+"hatchback");
		System.out.println(b+"sedan");
		System.out.println(c+"offroading");
	}
	
	public static void main(String[]args)
	{
		String a="i20";
		car();
		System.out.println("a"+a);
	}
static
{
	System.out.println("this is 2nd static block initializer");
}
}
