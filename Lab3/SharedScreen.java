public class SharedScreen {

    boolean turn = false;

    public SharedScreen()
    {



    }

    public synchronized void HelloMessage(String message)
    {

        while(turn == true)
        {

            try
            {

                wait();

            }

            catch(InterruptedException e)
            {

                e.printStackTrace();

            }
           

        }

        System.out.println(message);
        turn = true;
        notifyAll();

    }

    public synchronized void GoodbyeMessage(String message)
    {

        while(turn == false)
        {

            try
            {

                wait();

            }

            catch(InterruptedException e)
            {

                e.printStackTrace();

            }
           

        }

        System.out.println(message);
        turn = false;
        notifyAll();

    }

}