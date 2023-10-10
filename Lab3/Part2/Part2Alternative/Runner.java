
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedScreen sharedObj = new SharedScreen();
		MessageThread T1 = new MessageThread(1,"My", sharedObj);
		MessageThread T2 = new MessageThread(2, "Name", sharedObj);
		MessageThread T3 = new MessageThread(3,"Is", sharedObj);
		MessageThread T4 = new MessageThread(4, "Martin", sharedObj);
		
		T1.start();
		T2.start();
		T3.start();
		T4.start();
	}

}
