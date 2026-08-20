import java.util.Scanner;

abstract class Shape{
    abstract double Area();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double Area(){
        return radius * radius * Math.PI;
    }
}

class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double Area(){
        return width * height;
    }
}

class Triangle extends Shape{
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double Area(){
        return  (base * height * 0.5);
    }
}


public class ShapeArea{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double maxArea = 0;
        System.out.print("Enter number How many area you want to calculate: ");
        int num =  s.nextInt();
        for(int i = 0; i < num; i++){
            System.out.println();
            System.out.println("Circle --> 1");
            System.out.println("Rectangle --> 2");
            System.out.println("Triangle --> 3");
            System.out.print("Enter any number to calculate area: ");
            int a = s.nextInt();

            if (a == 1){
                System.out.print("Enter Radius");
                double r = s.nextDouble();
                Shape c = new Circle(r);
                System.out.println("Area of circle is "+ c.Area());
                if (maxArea < c.Area()){
                    maxArea = c.Area();
                }
            }
            else if(a == 2){
                System.out.print("Enter Width and Height respectively");
                double w = s.nextDouble();
                double h = s.nextDouble();
                Shape rec = new Rectangle(w,h);
                System.out.println("Area of Rectangle" + rec.Area());
                if (maxArea < rec.Area()){
                    maxArea = rec.Area();
                }
            }
            else if(a == 3){
                System.out.print("Enter Base and Height respectively");
                double b = s.nextDouble();
                double h = s.nextDouble();
                Shape tri = new Triangle(b,h);
                System.out.println("Area of Triangle" + tri.Area());
                if (maxArea < tri.Area()){
                    maxArea = tri.Area();
                }
            }
            else{
                System.out.println("Enter correct input");
                i--;
            }
        }
        System.out.println("Maximum Area is " + maxArea);

       s.close();
    }    
}