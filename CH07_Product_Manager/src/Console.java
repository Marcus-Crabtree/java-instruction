import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static String getLine(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();        // read the first string on the line
        sc.nextLine();               // discard the rest of the line
        return s;
    }

   
    
}
