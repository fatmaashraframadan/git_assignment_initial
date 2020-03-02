import git_Assignment.ISubscriber;

public class multiplicationSeries  implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int num,result=1;
        num=Integer.parseInt(input);
        for(int i=0; i<=num; i++)
        {
            result*=i;
        }
        System.out.println("the result of multiplication series is:"+result );
    }
}
