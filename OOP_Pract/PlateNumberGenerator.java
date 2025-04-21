public class PlateNumberGenerator {
	
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        System.out.println("Generating vehicle plate number...");
        String plate = "";
        
        for (int i = 0; i < 3; i++) 
        {
            plate += (char)('A' + (int)(Math.random() * 26));
        }
        
        for (int i = 0; i < 4; i++) 
        {
            plate += (int)(Math.random() * 10);
        }
        System.out.println("Plate Number: " + plate);
    }
}
