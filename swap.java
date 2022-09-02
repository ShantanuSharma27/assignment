import java.util.*;
public class swap
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 nos to swap :");
a=sc.nextInt();
b=sc.nextInt();
c=a;
a=b;
b=c;
System.out.println("Numbers after swapping:"+a+" "+b);
}
}
