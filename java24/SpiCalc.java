import java.util.*;

public class SpiCalc
{
public static void main(String[]args)
{

int n,ttl;
double sumCr=0, sumTcr=0;
Scanner sc= new Scanner(System.in);

System.out.print("\nEnter the No of subjects: ");
n=sc.nextInt();
System.out.print("\nEnter the Total Marks per Subject: ");
ttl=sc.nextInt();
 
double marks[]= new double[n];
int credit[]= new int[n];
int gotCr[]= new int[n];
String sub[]= new String[n];

for(int i=0;i<marks.length;i++)
{
System.out.print("\nEnter subject name: ");
sub[i]=sc.next();
System.out.print("\nEnter Marks for "+(sub[i])+": ");
marks[i]=sc.nextInt();
System.out.print("\nEnter Credit for "+(sub[i])+": ");
credit[i]=sc.nextInt();
}

System.out.println("\nSr No.\tSubject\tCredit\tMarks\tGrade");
for(int i=0;i<marks.length;i++)
{

double per=(marks[i] / ttl *100);

if(per>=85)
{
System.out.print("\n"+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tAA\n");
gotCr[i]=(10*credit[i]);
}
else if(per>=75 && per<85)
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tAB\n");
gotCr[i]=(9*credit[i]);
}
else if( per>=65 && per<75)
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tBB\n");
gotCr[i]=(8*credit[i]);
}
else if( per>=55 && per<65)
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tBC\n");
gotCr[i]=(7*credit[i]);
}
else if( per>=45 && per<55)
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tCC\n");
gotCr[i]=(6*credit[i]);
}
else if( per>=40 && per<45)
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tCD\n");
gotCr[i]=(5*credit[i]);
}
else if( per>=35 && per<40)
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tDD\n");
gotCr[i]=(4*credit[i]);
}
else
{
System.out.print(""+(i+1)+"\t"+sub[i]+"\t"+credit[i]+"\t"+marks[i]+"\tFAIL\n");
gotCr[i]=(0*credit[i]);
}

sumCr+=gotCr[i];
sumTcr+=10*credit[i];
}

double spi=sumCr/sumTcr*10;

System.out.println("\nSPI = "+String.format("%.2f",spi));

}
}


