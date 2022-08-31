import java.util.*;
class triangle
{
public static void main(String[] args)
{
double a,b,c,s,area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the three sides of the triangle :");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
if((a+b)>=c)
{
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area of triangle is"+area);
}
else
{
System.out.println("invalid triangle");
}
}//i am making a change for humanity.
