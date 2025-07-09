package Inheritance;
class Shape{
    double length;
    double breadth;
    void setdim(double l,double b){
        length=l;
        breadth=b;
    }
}
class Rectangle extends Shape{
    void area(){
            double a=length*breadth;
            System.out.print("Area = "+a);
        }
    public static void main(String[]args){
        Rectangle r = new Rectangle();
        r.setdim(5,30);
        r.area();
    }
}