/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this2variables;

/**
 *
 * @author tiago.lucas
 */
public class Circle {
    private double radius;
    private double radius2;
    /**
     * @param args the command line arguments
     */
    Circle(){
        this(10);
    }
    Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
