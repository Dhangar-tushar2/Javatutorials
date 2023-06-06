import java.util.Scanner;
class one4
{
public static void main(String [] one4)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
double	e=a*b;
double	f=c+d;
double	g=f-e;
System.out.println("Multiplicaton	="+e);
System.out.println("Sum		="+f);
System.out.println("Substraction	="+g);
}
}