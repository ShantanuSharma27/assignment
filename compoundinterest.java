import java.util.*;
public class compoundinterest
{
public static void main(String[] args)
{
double p,r,t,a,ci;
Scanner sc = new Scanner(System.in);
p=sc.nextDouble();
r=sc.nextDouble();
t=sc.nextDouble();
a=p*(1+Math.pow(r,t));
ci=a-p;
System.out.println("the compound ?interest is"+ci);
}
}