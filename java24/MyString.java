public class MyString 
{
    public static void main(String[] args) 
	{

        String a = "Hello World!!";

        System.out.println("\n" + a); // Print

        System.out.println("\nLength = " + a.length()); // Lenght

        String b = a; // Copy

        System.out.println("\n" + b);

        a = "Java is ";
        b = "Best!";

        a += b; // Concatenate

        System.out.println("\n" + a);

        a = "SVIT";
        b = "svit";

        if (a.equals(b)) // return true if same (with case sensitivity)
        {
            System.out.println("\n" + a + " and " + b + " are SAME.");
        } else {
            System.out.println("\n" + a + " and " + b + " are NOT SAME.");
        }

        if (a.equalsIgnoreCase(b)) // return true if same (without case sensitivity)
        {
            System.out.println("\n" + a + " and " + b + " are SAME.");
        } else {
            System.out.println("\n" + a + " and " + b + " are NOT SAME.");
        }

        int i = a.compareTo(b); // compare

        if (i > 0) // if a>b (ascii val)
        {
            System.out.println("\n" + a + " is GREATER than" + b);
        } else if (i < 0) // if a<b (ascii val)
        {
            System.out.println("\n" + a + " is SMALLER than " + b);
        } else {
            System.out.println("\n" + a + " and " + b + " both SAME");
        }

        a = "WELCOME TO I-N-D-I-A !";

        for (i = 0; i < a.length(); i++) // char by char
        {
            System.out.print(a.charAt(i));
        }

        a = "HELLO WORLD OYE!";

        System.out.println("\n\nPosition of 1st 'O' = " + a.indexOf('O')); // if present return the index

        System.out.println("\nPosition of last 'O' = " + a.lastIndexOf('O'));

        System.out.println("\nPosition of middle 'O' = " + a.indexOf('O', 5));

        System.out.println("\nPosition of WOR = " + a.indexOf("WOR"));

        System.out.println("\nPosition of WAR = " + a.indexOf("WAR")); // if not present returns -1

        a = a.toLowerCase();
        System.out.println("\nLower Case = " + a);

        a = a.toUpperCase();
        System.out.println("\nUpper Case = " + a);

        b = a.substring(6, 11);
        System.out.println("\nSub-String = " + b);



        System.out.println("\nStarts with HELL ? " + a.startsWith("HELL"));

        System.out.println("\nStarts with hell ? " + a.startsWith("hell"));

        System.out.println("\nEnds with OYE! ? " + a.endsWith("OYE!"));

        System.out.println("\nEnds with hell ? " + a.endsWith("hell"));

	a="PRIYANKA CHOPRA";
	a=a.replace('A','O');
        System.out.println("\nReplaced char: " +a);

	b="DAY DALLY DAY DAYDAY HELLO";
	b=b.replace("DAY","NIGHT");
        System.out.println("\nReplaced word: " +b);

        a = "        HELLO        DEAR!      ";

        System.out.println("\n" + a);
        System.out.println("\nLength = " + a.length());

        a = a.trim();
        System.out.println("\n" + a);
        System.out.println("\nLength = " + a.length());

    	}
}
