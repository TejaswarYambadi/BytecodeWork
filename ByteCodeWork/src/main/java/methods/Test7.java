package methods;

public class Test7 { 
    public int x = 10; 
    public static void main(String[] args) 
    { 
        System.out.println(Test7.class); 
    } 
    static
    { 
        System.out.print(Test7.class + " "); 
    } 
}

//Non Static variables are not accessed in static methods