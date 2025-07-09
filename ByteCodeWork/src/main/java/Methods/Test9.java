package Methods;

class Test9 { 
    int x = 10; 
public
    static void main(String[] args) 
    { 
        System.out.println(Test9.x); 
    } 
    static
    { 
        int x = 20; 
        System.out.print(x + " "); 
    } 
}

//20 and then non static variables are not acceseed so throws error