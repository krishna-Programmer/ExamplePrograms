/* 
This program takes a number as range and from 1 to that range if the numbers are 
represented in binary then how many 1's does all these numbers contains that will be printed as result

for example 
range is 4
then binary form of 1 contains 1 1's
binary form of 2 contains 1 1's
binary form of 3 contains 2 1's
binary form of 4 contains 1 1's
so the output will be 1+1+2+1=5
*/
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
