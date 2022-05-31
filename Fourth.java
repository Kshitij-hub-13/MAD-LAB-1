/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Fourth
{
	public static void main(String[] args)
	{
	   int t=Integer.parseInt(args[0]); 
	   for(int i = 1; i<11; i++)
	   {
	       int m=t*i;
	       System.out.println(t+ "x" + i + "="+m);
	   }
	}
}


Output
5x1=5
5x2=10
5x3=15
5x4=20
5x5=25
5x6=30
5x7=35
5x8=40
5x9=45
5x10=50
