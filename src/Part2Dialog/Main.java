package Part2Dialog;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! My name is Information Gatherer. I will collect information about you.");
        System.out.println("Please, follow the instructions carefully.");
        System.out.println("Please, enter your name: ");
        String name = input.nextLine();
        System.out.println("Such a pretty name! Now enter you surname, please: ");
        String surname = input.nextLine();
        System.out.println("Enter your age (years only):");
        byte age = input.nextByte();
        System.out.println("Provocative question! What is your salary? Numbers in dollars should suffice:");
        double salary = input.nextDouble();
        System.out.println("Nice. And what is you favorite number? Let's try only whole numbers:");
        int favnum = input.nextInt();
        input.nextLine(); //Consumes the newline character that is left behind
        System.out.println("What is the name of your favorite actor or actress? ");
        String actor = input.nextLine();
        System.out.println("Who is your favorite book writer? ");
        String author = input.nextLine();
        System.out.println("Do you play chess? Yes or No?");
        String chess = input.nextLine();
        if (chess.contains("Yes")){
            System.out.println("Your are the strategist. I admire it.");
        }
        else {
            System.out.println("You should try it sometime. It could be interesting.");
        }
        System.out.println("What is your favorite sport? ");
        String sport = input.nextLine();
        System.out.println("What is the name of the city you live in?");
        String city = input.nextLine();

        System.out.println("Full name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("Your salary equals: " + salary);
        System.out.println("Your favorite number is: " + favnum);
        System.out.println("Your favorite actor or actress is: " + actor);
        System.out.println("Your favorite author is: " + author);
        System.out.println("Playing chess: " + chess);
        System.out.println("Your favorite sport: " + sport);
        System.out.println("City you live in: " + city);
        System.out.println("Wonderful! Now, I know everything about you!");
    }
}
