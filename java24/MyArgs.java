import java.util.*;

public class MyArgs
{
public static void main(String[]args)
{

System.out.println("\nArgs: "+args.length);

for(int i=0;i<args.length;i++)
{
System.out.print("\n"+args[i]+" = "+args[i].length());
}

}
}

/*
=> OUTPUT:-

C:\java24>javac MyArgs.java

C:\java24>java MyArgs svit parul changa

Args: 3

svit = 4
parul = 5
changa = 6
C:\java24>java MyArgs.java

Args: 0

C:\java24>javac MyArgs.java

C:\java24>java MyArgs "svit" "parul changa"

Args: 2

svit = 4
parul changa = 12
*/