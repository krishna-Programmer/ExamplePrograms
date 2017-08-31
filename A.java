import java.util.*;
class A
{
public static void main(String args[])
{
System.out.println("enter the range");
int range=new Scanner(System.in).nextInt();
int i=0;
while(range>0)i+=countOnes(range--);


System.out.println(i);
}
static int countOnes(int i)
{
if(i==0)return 0;
return (i%2==1?0:1)+countOnes(i/2);
}
}