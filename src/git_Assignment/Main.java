package git_Assignment;

import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers [] = {
            new SimpleSubscriber(),
            new ReallySimpleSubscriber(),
            new sphereArea(),
            new CircleVol(),
            new LucasSeries(),
            new SphereVolum(),
            new SphereCircumference() ,
            new Fibonacci(),
            new CircleArea(),
            new CircleCircumference(),
            new multiplicationSeries(),

    };
    public static void main(String[] args) {
        System.out.println("Enter Your Radius here :");
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        mathTopic.dispatchEvent(input);
    }
}
