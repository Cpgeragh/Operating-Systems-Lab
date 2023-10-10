

public class SharedScreen {

	private int turn = 1; 
	/// 1 = MY
	/// 2 = NAME
	/// 3 = IS
	/// 4 = MARTIN
	
	public SharedScreen()
	{
		
	}
	
	public synchronized void FirstMessage(String message)
	{
		while(turn!=1)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(message);
		turn = 2;
		notifyAll();
	}
	
	public synchronized void SecondMessage(String message)
	{
		while(turn !=2)
		{
			try 
			{
				wait();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(message);
		turn = 3;
		notifyAll();
	}
	
	public synchronized void ThirdMessage(String message)
	{
		while(turn !=3)
		{
			try 
			{
				wait();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(message);
		turn = 4;
		notifyAll();
	}
	
	public synchronized void FourthMessage(String message)
	{
		while(turn !=4)
		{
			try 
			{
				wait();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(message);
		turn = 1;
		notifyAll();
	}
}
