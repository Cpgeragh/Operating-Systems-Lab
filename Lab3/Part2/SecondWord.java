package Part2;

public class SecondWord extends Thread{

    DisplayName mySentence;
    String message;
    
    public SecondWord(DisplayName s, String m)
    {

        mySentence = s;
        message = m;

    }

    public void run()
    {

        for(int i=0; i<20; i++)
        {

            mySentence.myName(message);

        }

    }
    
}
