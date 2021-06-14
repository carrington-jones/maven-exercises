import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class StringChanges{

    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        if(StringUtils.isNumeric(userInput)){
            System.out.printf("%s is a number!", userInput);
        } else{
            System.out.printf("%s is not a number%n", userInput);
        }
        System.out.println("The reverse case of you sentence is :");
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println("The reverse of your sentence is: ");
        System.out.println(StringUtils.reverse(userInput));
    }

}
