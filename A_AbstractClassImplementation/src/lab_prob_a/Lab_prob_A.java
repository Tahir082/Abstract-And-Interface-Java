/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob_a;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amtah
 */

abstract class Shape{
    double area;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    public abstract double RectangleArea(double length, double breadth);
    public abstract double SquareArea(double a); 
    public abstract double CircleArea(double r);
}
class Area extends Shape{
    @Override
    public double RectangleArea(double length, double breadth){
        this.area=length*breadth;
        return this.area;
    }
    @Override
    public double SquareArea(double a){
        this.area= pow(a,2);
        return this.area;
    }
    
    @Override
    public double CircleArea(double r){
        this.area= 3.1416* pow(r,2);
        return this.area;
    }
}
    
public class Lab_prob_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Shape>shapeList= new ArrayList<>();
        Scanner in= new Scanner(System.in);
        while(true){
            System.out.println("Press 1: Calculate Rectangle Area");
            System.out.println("Press 2: Calculate Square Area");
            System.out.println("Press 3: Calculate Circle Area");
            Shape rectangle=new Area();
            Shape square= new Area();
            Shape circle= new Area();
            int choice= in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("========Calculating Rectangle Area=======");
                    System.out.println("Enter Length:");
                    int length= in.nextInt();
                    System.out.println("Enter breadth");
                    int breadth= in.nextInt();
                    rectangle.RectangleArea(length, breadth);
                    shapeList.add(rectangle);
                    System.out.println("Area of the Rectangle is: "+ rectangle.getArea()+" unit");
                    
                    break;
                case 2:
                    System.out.println("========Calculating Square Area=========");
                    System.out.println("Enter size of one side of the square: ");
                    int side= in.nextInt();
                    square.SquareArea(side);
                    shapeList.add(square);
                    System.out.println("Area of the Square is: "+ square.getArea()+" unit");
                    break;
                case 3:
                    System.out.println("========Calculating Circle Area=========");
                    System.out.println("Enter Radius of the Circle:");
                    int rad= in.nextInt();
                    circle.CircleArea(rad);
                    shapeList.add(circle);
                    System.out.println("Area of the Circle is: "+ circle.getArea()+" unit");
                    break;
                default:
                    System.out.println("Wrong input!!! Try Again....");
                    break;
                    
            }
            
        }
    }
    
}
