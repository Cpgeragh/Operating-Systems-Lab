package Part2;

public class DisplayName {

       private int turn = 1;
    
        public DisplayName()
        {
    
    
    
        }
    
        public synchronized void myWord(String message)
        {
    
            while(turn != 1)
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
            turn = 2;
            notifyAll();
    
        }
    
        public synchronized void myName(String message)
        {
    
            while(turn != 2)
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
            turn = 3;
            notifyAll();
    
        }

        public synchronized void isWord(String message)
        {
    
            while(turn != 3)
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
            turn = 4;
            notifyAll();
    
        }

        public synchronized void martinWord(String message)
        {
    
            while(turn != 4)
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
            turn = 1;
            notifyAll();
    
        }
    
    }
