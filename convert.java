//Write a C program to enter length in centimeter and convert it into meter. 
import java.util.*;
public class convert
{
public static void main(String[] args)
{
double c,m;
Scanner sc = new Scanner(System.in);
System.out.println("enter length in cm :");
c=sc.nextDouble();
m=c/100;
System.out.println("the length is "+m+" meter");
}}



