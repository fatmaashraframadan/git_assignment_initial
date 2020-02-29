import java.math.*;
public class CircleVol implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double radius =Double.parseDouble(input);
        double pi= 3.142;
        double fot = 4.0/3.0;
        double circleVol =fot * (pi * Math.pow(radius,3)) ;


        System.out.println("The volume of the ball whose radius is " + radius + " = " + circleVol + " \n" );

    }
}
