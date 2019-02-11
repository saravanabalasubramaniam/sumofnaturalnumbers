import java.io.*;
import java.util.*;
class Sumofnatural
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int sum=0;
	if(a>=0)	
	{
		for(int i=0;i<=a;i++)
		{
			sum=sum+i;
		}
	System.out.println(sum);
	}
		
   }
}	
