/*
      *
     ***
    *****
   *******
  *********
*/

public class P12
{
public static void main(String[]args)
{

for(int i=0;i<5;i++)
{
for(int j=0;j<=10;j++)
{
if(j>=6-i && j<=6+i)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.print("\n");
}

}
}
