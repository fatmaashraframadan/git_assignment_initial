package git_Assignment;

public class TwoPowerN implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        System.out.println("result ="+Math.pow(2,Integer.parseInt(input)));
    }
}
