/*wap to enter char and check weather it is vowel of consonant*/


import java.util.*;

public class VowelConsonant
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
char ch;


System.out.print("\nEnter a char: ");
ch=s.next().charAt(0);

if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("\nVowel!");
}
else 
{
System.out.println("\nConsonant!");
}

}
}