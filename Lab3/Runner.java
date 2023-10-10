public class Runner {

    public static void main(String[] args) {

        SharedScreen shareObj = new SharedScreen();
        FirstMessage T1 = new FirstMessage(shareObj, "Hello");
        SecondMessage T2 = new SecondMessage(shareObj, "Goodbye");

        T1.start();
        T2.start();

    }
    
}
