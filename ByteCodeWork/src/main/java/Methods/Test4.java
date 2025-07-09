package Methods;
public class Test4 { 
    static int i = 1; 
public static void main(String[] args) 
    { 
        //static int i = 1;    Dont use static blocks inside main method
        for (Test4.i = 1; Test4.i < 10; Test4.i++) { 
            i = i + 2; 
            System.out.print(i + " "); 
        } 
    } 
} 
