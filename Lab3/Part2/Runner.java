package Part2;

public class Runner {

    public static void main(String[] args) {

        DisplayName shareObj = new DisplayName();
        FirstWord T1 = new FirstWord(shareObj, "My");
        SecondWord T2 = new SecondWord(shareObj, "Name");
        ThirdWord T3 = new ThirdWord(shareObj, "Is");
        FourthWord T4 = new FourthWord(shareObj, "Martin");

        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
    
}

