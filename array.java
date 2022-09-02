import java.util.Arrays;

class Employee
{
	String name;
	int age;
}

public class array
{
public static void main(String[] args){
//int[] A=new int[5];----one d array
//A[0] = 878;
//A[4] = 876;

//int[][]A = new int[4][4];----two d array.

/*int[][]A = new int[5][];
A[0] = new int[5];
A[1] = new int[2];
A[2] = new int[1];
A[3] = new int[3];
A[4] = new int[0];

A[1][0] = 878;
A[1][1] = 878;
*/

Employee[] e = new Employee[5];
e[0] = new Employee();//every employee will have its own name and age.
e[1] = new Employee();
e[2] = new Employee();
e[3] = new Employee();
e[4] = new Employee();

e[0].name = "abc";
e[0].age = 12;

e[1].name = "def";
e[1].age = 13;

e[2].name = "ghi";
e[2].age = 14;

e[3].name = "jkl";
e[3].age = 15;

e[4].name = "mno";
e[4].age = 16;


System.out.println(e.length);

for(int i=0;i<e.length;i++)
	System.out.println("name:"+e[i].name+" "+e[i].age);

System.out.println("Using for each loop:");
for(Employee E:e)
	System.out.println("name:"+E.name+" "+E.age);
	
}
}