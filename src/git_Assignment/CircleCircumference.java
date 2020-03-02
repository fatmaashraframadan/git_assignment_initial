/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_Assignment;

/**
 *
 * @author ghost
 */
public class CircleCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double bi = 3.14 ;
        int d = Integer.parseInt(input);
        double c = bi * d ;
        System.out.println("The Result of CircleCircumference is   " + c);
    }
}
