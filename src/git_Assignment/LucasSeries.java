package git_Assignment;

import git_Assignment.ISubscriber;

public class LucasSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);
        int a = 2,b = 1,c;

        for(int i=2;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        int result = n==0?2:(n==1?1:b);
        System.out.println("Lucas number of input(" + input + ") is: " + result);
    }
}
