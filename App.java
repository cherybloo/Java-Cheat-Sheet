import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Greeting();
        Animal a = new Animal();
        System.out.println(a.Doggy());
    }

    public static void Greeting(){
        System.out.println("What is your name?");
        Scanner userInput = new Scanner(System.in);

        String name = userInput.nextLine();
        System.out.println("Hello " + name);
        userInput.close();
    }
}
