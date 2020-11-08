import java.util.*;
import java.lang.*;
import java.math.*;
public class diffie
{
	public static BigInteger power(BigInteger a,int b,BigInteger p)
	{
		if(b==1)
			return a;
		else
			return (a.pow(b)).mod(p);
	}
	public static void keygen()
	{
	Scanner sc=new Scanner(System.in);
 int b,i,a;
 BigInteger x,y,ka,kb,g,p;
 System.out.print("Enter p:");
 p=sc.nextBigInteger();
 System.out.print("Enter g:");
 g=sc.nextBigInteger();
 System.out.print("Enter a:");
 a=sc.nextInt();
 x=power(g,a,p);
 System.out.print("Enter b:");
 b=sc.nextInt();
 y=power(g,b,p);
 ka=power(y,a,p);
 System.out.println("Alice:");
 System.out.println("Private Key : "+a);
 System.out.println("Computed public key : "+x);
 System.out.println("Shared Secret : "+ka);
 kb=power(x,b,p);
 System.out.println("Bob:");
 System.out.println("Private Key : "+b);
System.out.println("Computed public key : "+y);
 System.out.println("Shared Secret : "+kb);
	}
	public static void main(String[] args)
	{
	keygen();
	}
}