import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        
        letter = Character.toLowerCase(letter);
        
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            System.out.println(letter + " is a vowel");
        else
            System.out.println(letter + " is a consonant");
    }
}
