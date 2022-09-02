//. Write a C program to convert a given integer (in seconds) to hours, minutes and   seconds. 
import java.util.*;
public class htm
{
public static void main(String[] args)
{
int ss,h,m,s;
Scanner sc = new Scanner(System.in);
ss=sc.nextInt();
h=ss/3600;
s=ss%3600;
m=s/60;
s=s%60;
System.out.println("......."+h+" "+s+" "+m);
}
}