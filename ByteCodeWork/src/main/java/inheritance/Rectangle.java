package inheritance;
class Shape{
    double length;
    double breadth;
    void setdim(double l,double b){
        length=l;
        breadth=b;
        
    }
}
class Rect extends Shape{
    void area(){
    	double a=length*breadth;
            System.out.print("Area = "+a);
        }
}
class Rectangle{
    public static void main(String[]args){
        Rect r = new Rect();
        r.setdim(5,30);
        r.area();
    }
}