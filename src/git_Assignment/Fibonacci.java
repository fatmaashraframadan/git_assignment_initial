package git_Assignment;

public class Fibonacci implements ISubscriber{
    @Override
    public void notifySubscriber(String input) {
        int num = Integer.parseInt(input);

        int result = 0;
        int f1 = 0;
        int f2 = 1;

        for (int i = 2; i < num; i++)
        {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }

        System.out.println("The Finonacci of " + input + " is " + result);
    }
}
