package Part2;

public class FourthWord extends Thread{

    DisplayName mySentence;
    String message;
    
    public FourthWord(DisplayName s, String m)
    {

        mySentence = s;
        message = m;

    }

    public void run()
    {

        for(int i=0; i<20; i++)
        {

            mySentence.martinWord(message);

        }

    }
    
}
