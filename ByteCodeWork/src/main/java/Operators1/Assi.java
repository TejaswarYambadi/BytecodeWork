//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the  resultant value by 5. Display the final result.(Using Assignment Operators)

class Assi{
public static void main(String[] args){
int a =2345;
a+=8;
a/=3;
a%=5;
a*=5;
System.out.println("The resultant value = "+a);
}
}