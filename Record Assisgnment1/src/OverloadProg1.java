public class OverloadProg1 {
    public double calArea(int s){
        return (s*s);
    }

    public double calArea(double r){
        double temp = (Math.PI)*(r*r);
        return temp;
    }

    public double calArea(double b, double h){
        double temp1 = 0.5*b*h;
        return temp1;
    }

    public static void main(String args[]){
        OverloadProg1 obj = new OverloadProg1();
        System.out.println("The area of a square with side 5 units = "+obj.calArea(5));
        System.out.println("The area of a circle with radius 5 units = "+obj.calArea(6.0));
        System.out.println("The area of a triangle  with base 5 units & height 5 units = "+obj.calArea(5,5));
    }
}
