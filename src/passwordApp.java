import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;

public class passwordApp {
    public static void main(String[] args) {
        //This app is meant for a user to create a password
        //And enter the password
        //if the password is wrong, he is prompted to reenter his password else, tell him he is right
        Scanner scan = new Scanner(System.in);
        System.out.println("Please what's your name? ");
        String name = scan.next();
        System.out.println("Please create your password here: ");
        String password = scan.next();
        System.out.println("Hi "+name + ",your password has been created.");
        System.out.println("Please confirm your password here: ");
        String password1= scan.next();
        //Use the while loop so the program doesn't end till the correct password is entered
        while (!password1.equals(password)) {
            System.out.println("You entered a wrong password, please confirm your password here again: ");
            password1= scan.next();
        }
        System.out.println("You entered the correct password, welcome "+ name + " to the food App");
        System.out.println("Are you hungry today? ");
        String answer1= scan.next();

        if(answer1.equals("yes") || answer1.equals("Yes") || answer1.equals("YES")){
            System.out.println("What would you like to eat, rice, beans or spaghetti? ");
            String foodOption = scan.next();
            Integer noOfSpoons;
            while (!foodOption.equals("rice") && !foodOption.equals("beans") && !foodOption.equals("spaghetti")){
                System.out.println("Sorry, we don't have "+ foodOption);
                System.out.println("What would you like to eat, rice, beans or spaghetti? ");
                foodOption = scan.next();
            }
            if (foodOption.equals("rice") || foodOption.equals("beans") || foodOption.equals("spaghetti")) {

                System.out.println("How many spoons of " + foodOption + " would you like?");
                noOfSpoons = scan.nextInt();

                System.out.println("You ordered for " + noOfSpoons + "spoon(s) of " + foodOption);
                System.out.println("Would you like a drink to go with it? ");

                String answer2 =scan.next();
                if (answer2.equals("yes") || answer2.equals("Yes") || answer2.equals("YES") ){
                    System.out.println("Would you rather have a glass of juice or wine? ");
                    String answer3 = scan.next();
                    while(!answer3.equals("juice") && !answer3.equals("wine")){
                        System.out.println("Sorry, we don't have this option ");
                        System.out.println("Would you rather have a glass of juice or wine? ");
                        answer3 = scan.next();
                    }
                    //Add extra layer of password validation
                    System.out.println("Please confirm your password here: ");
                    String password2= scan.next();
                    System.out.println("Let's get you " + noOfSpoons +  "spoon(s) of " + foodOption + " and a glass of " + answer3);

                }else{
                    //Add extra layer of password validation
                    System.out.println("Please confirm your password here: ");
                    String password3= scan.next();
                    System.out.println("We'll bring you " + noOfSpoons + " spoon(s) of " + foodOption + " and a glass of Water, do enjoy your meal :)");
                }


            }

        }else{
            System.out.println("Be sure to come Around when you're hungry :)");
        }



        //Use the below if else if you want to end the loop if a correct password is entered or not
        //if(password1.equals(password)){
        //    System.out.println("You entered the correct password, welcome "+ name);
        //}else{
        //    System.out.println("You entered an correct password!!!");
        //}
    }
}