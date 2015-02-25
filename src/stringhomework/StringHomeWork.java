
package stringhomework;

import java.util.Scanner;

public class StringHomeWork {

    
    public static void main(String[] args) {
        String name;
        
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("What is your favourite city? ");
        name = Keyboard.nextLine();
        System.out.println("My Favourite city is: " + name);
        
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        char letter = name.charAt(0);
        int stringSize = name.length();
        
        System.out.println("The name in uppercase: " + upper);
        System.out.println("The name in lowercase: " + lower);
        System.out.println("The first character of city: " + letter);
        System.out.println("The number of characters: "+ stringSize);
    }
    
}
