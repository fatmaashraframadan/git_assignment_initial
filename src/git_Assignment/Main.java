package git_Assignment;

import java.util.Scanner;

import static java.lang.System.exit;

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
            new TwoPowerN(),
            new CircleCircumference(),
            new multiplicationSeries(),

    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Topic mathTopic = new Topic();
        while(true) {
            System.out.println("\nChoose The operation you want to do : \n1- SphereCircumference.\n2-Fibonacci.\n3-2PowerN.\n4-CircleCircumference.\n5-CircleVolum.\n6-SphereVoluum.\n7-SphereArea.\n8-CircleArea.\n9-LucasSeries.\n10-MultiplicationSeries.\n11-PERFORM ALL OPERATIONS.\n0-Exit.\n");

            int Choice = sc.nextInt();
            System.out.println("Enter Your Radius here :");
            String s = sc.next();
            switch (Choice) {
                case 0:
                    exit(0);
                case 1:
                    new SphereCircumference().notifySubscriber(s);
                    break;
                case 2:
                    new Fibonacci().notifySubscriber(s);
                    break;
                case 3:
                    new TwoPowerN().notifySubscriber(s);
                    break;
                case 4:
                    new CircleCircumference().notifySubscriber(s);
                    break;
                case 5:
                    new CircleVol().notifySubscriber(s);
                    break;
                case 6:
                    new SphereVolum().notifySubscriber(s);
                    break;
                case 7:
                    new sphereArea().notifySubscriber(s);
                    break;
                case 8:
                    new CircleArea().notifySubscriber(s);
                    break;
                case 9:
                    new LucasSeries().notifySubscriber(s);
                    break;
                case 10:
                    new multiplicationSeries().notifySubscriber(s);
                    break;
                case 11:
                    for (ISubscriber sub : subscribers) {
                        mathTopic.addSubscriber(sub);
                    }
                    mathTopic.dispatchEvent(s);
                    break;
            }
        }
    }
}
