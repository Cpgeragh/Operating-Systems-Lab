package Part2;

public class FirstWord extends Thread{

    DisplayName mySentence;
    String message;
    
    public FirstWord(DisplayName s, String m)
    {

        mySentence = s;
        message = m;

    }

    public void run()
    {

        for(int i=0; i<20; i++)
        {

            mySentence.myWord(message);

        }

    }
    
}
