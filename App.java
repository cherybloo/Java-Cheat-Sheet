import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Greeting();
    }

    public static void Greeting(){
        System.out.println("Hello There\nWhat is your name?");
        Scanner userInput = new Scanner(System.in);

        Person p = new Person();
        p.setName(userInput.nextLine());
        String name = p.getName();
        System.out.println("Hello " + name);
        userInput.close();
    }
}
