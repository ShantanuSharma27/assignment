import java.util.*;
public class simpleinterest
{
public static void main(String[] args)
{
float p,t,r,si;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the principal time and rate respectively:");
p=sc.nextFloat();
t=sc.nextFloat();
r=sc.nextFloat();
si=(p*t*r)/100;
System.out.println("the simple interest is :"+si);
}
}

