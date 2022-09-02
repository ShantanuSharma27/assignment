import java.util.*;
public class largest
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 nos to find the largest among them :");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("the largest no is:"+a);
}
else if(b>a && b>c)
{
System.out.println("the largest no is :"+b);
}
else
{
System.out.println("the largest no is :"+c);
}}}
