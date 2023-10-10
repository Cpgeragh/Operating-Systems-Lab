
public class MessageThread extends Thread {

	private int type;
	private String message;
	private SharedScreen myScreen;
	
	public MessageThread(int t, String m, SharedScreen my)
	{
		type = t;
		message = m;
		myScreen = my;
		
	}
	
	public void run()
	{
		for(int i=0; i<20; i++)
		{
			if(type == 1)
				myScreen.FirstMessage(message);
			else if(type == 2)
				myScreen.SecondMessage(message);
			else if(type == 3)
				myScreen.ThirdMessage(message);
			else if(type == 4)
				myScreen.FourthMessage(message);
		}
	}
	
}
