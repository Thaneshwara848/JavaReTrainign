import java.util.Scanner;
import java.io.*;
class Demo6
{
	public static void main(String args[])  throws FileNotFoundException
	{
		m1();
	}
	static void m1()  throws FileNotFoundException
	{	m2();
		System.out.println("Hi M1 method...1");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("Hi M2 method...1");
	}
	static void m3() throws FileNotFoundException
	{
		System.out.println("Hi M3 method...1");

		File f  = new File("ABC.txt");
		FileReader fr = new FileReader(f);		
	}

}