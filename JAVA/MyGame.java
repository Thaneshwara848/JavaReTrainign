class Car extends Thread
{
	public void run(){
		for(int i=0;i<=25;i++)
		{
			try
			{
		if(Thread.currentThread().getName().equals("Bmw")){
				System.out.println("	 "+Thread.currentThread().getName()+" :"+ i );
		}
		if(Thread.currentThread().getName().equals("Benz")){
			System.out.println(Thread.currentThread().getName()+" :"+ i );

		}
				
		Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class MyGame{
	public static void main(String args[])
	{
		Car c = new Car();
		Thread t1= new Thread(c);
		Thread t2= new Thread(c);
		t1.start();t2.start();
		t1.setName("Bmw");
		t2.setName("Benz");
		try
		{
			for(int k=0;k<=25;k++){
				System.out.println("			K : "+ k);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}		
	}
}