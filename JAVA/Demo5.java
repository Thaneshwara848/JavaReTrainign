import java.util.*;
class Demo5{
	public static void main(String args[]){
		m1();
	}
	static void m1(){
		m2();
		System.out.println("Hi m1 method...!");
	}
	static void m2(){
		m3();
		System.out.println("Hi m2 method...!");
	}
	static void m3(){
		try{
			System.out.println("Hi m3 method...!");
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter A value :");	int a = sc.nextInt();
			System.out.println("ENter B value :");	int b = sc.nextInt();
			int c  = a  / b ;
			System.out.println("Result :"+c );
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Boss Please ENter number only.....!");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Boss we cant devide anything by ZERO .....!");
		}
		catch(Exception e){}
		finally{ System.out.println("Thank you....!");}
	}
}