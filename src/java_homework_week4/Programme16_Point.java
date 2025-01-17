package java_homework_week4;

/**
 * 16. Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this
 * Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE: Write the below code into the main method.
 * Point first = new Point(6, 5);
 * Point second = new Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * Point point = new Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */
public class Programme16_Point {

    int X;
    int Y;
    public  Programme16_Point(){

    }
    public Programme16_Point(int x, int y){
        this.X = x;
        this.Y = y;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public void setX(int X){
        this.X = X;
    }

    public void setY(int Y){
        this.Y = Y;
    }

    public double distance(){
        double ans = Math.sqrt((X * X) + (Y * Y));
        return ans;
    }

    public double distance(int X, int Y){
        double ans =  Math.sqrt(((X - this.X) * (X - this.X)) + ((Y - this.Y) * (Y - this.Y)));
        return ans;
    }

    public double distance(Programme16_Point point) {
        return Math.sqrt((point.X - this.X) * (point.X - this.X) + (point.Y - this.Y) * (point.Y - this.Y));
    }

    public static void main(String[] args) {
        Programme16_Point first = new Programme16_Point(6, 5);
        Programme16_Point second = new Programme16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme16_Point point = new Programme16_Point();
        System.out.println("distance()= " + point.distance());
    }
}
