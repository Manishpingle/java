package java_practice;
//method recursion:-
//a method calling itself is know as method recursion
//process of executing same statement repeatedly is known as method recursion
//method recursion causes stack over flow error
public class p9 
{
public static void train()
 {
	System.out.println("train starts");
	System.out.println("train stops");
	train();
 }
public static void main(String[]args)
 {
	train();
	}
}
