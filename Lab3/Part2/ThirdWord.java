package Part2;

public class ThirdWord extends Thread{
    
    DisplayName mySentence;
    String message;
    
    public ThirdWord(DisplayName s, String m)
    {

        mySentence = s;
        message = m;

    }

    public void run()
    {

        for(int i=0; i<20; i++)
        {

            mySentence.isWord(message);

        }

    }

}
