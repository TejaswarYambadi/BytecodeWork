/*Consider the following code snippet:
   int i = 10;
   int n = i++%5;
  i) What are the values of i and n after the code is executed?
  ii)What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
*/

class Snip
{
	public static void main(String[] args)
	{
		int i =10;
		int n = i++%5;
		System.out.println(n);
		/*Postfix Increment Operator*/
		System.out.println(i); /* The result of i=11*/
		System.out.println(n); /* The result of n=0*/
		/*Prefix Incerement Operator */
		int a=10;
		int b = --i%5;
		System.out.println(a); /* The result of a=10*/
		System.out.println(b); /* The result of b=0*/

		
	}
}