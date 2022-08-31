import java.util.*;
public class areaofcircle
{
public static void main(String[] args)
{
double r,area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of the circle :");
r=sc.nextDouble();
area=3.14*r*r;
System.out.println("area of the circle is :"+area);
}
}