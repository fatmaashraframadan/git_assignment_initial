
public class CircleVol implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double cylinderVol =0;
        double coneVol =0;
        double radius =Double.parseDouble(input);
        double pi= 3.142;
        cylinderVol = pi * radius * radius * radius;
        coneVol =(pi * radius * radius) *(radius / 3);


        System.out.println("A circle has no volume since it is planar and has no height \n" );
        System.out.println("if we consider the circle to be a part of a cylinder whose height equals"
                + " the radius then \n  the volume of a cylinder whose circle radius is " + radius + " = " + cylinderVol +"\n" );
        System.out.println("if we consider the circle to be a part of a cone whose height "
                + "equals the radius then \n  the volume of a cone whose circle radius is " + radius + " = " + coneVol );

    }
}
