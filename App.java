// java.util.Scanner library -> library to get user input
import java.util.Scanner;

// public class **App** -> change App to whatever your java file's name
public class App {
    public static void main(String[] args){
        // Use case of static methods
        // StaticHelper.Greeting();
        // System.out.println("The sum of 2 and 3 is " + StaticHelper.sum(2,3));
    
        // Use case of non static methods
        // NonStaticHelper nsc = new NonStaticHelper();
        // nsc.sum(2,3);
    
        Encapsulation en = new Encapsulation();
        en.Testing();
    }
}


// Static Method -> You don't need to instance this object. Syntax: StaticHelper.xxx();
class StaticHelper{

    public static int sum(int x, int y){
        return x + y;
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

// Non-Static Method -> You need to instance this object. Syntax: NonStaticHelper xxx = new NonStaticHelper();
class NonStaticHelper{
    public void sum(int x, int y){
        System.out.println("The sum of x: " + x + " and y: " + y + " is " + (x+y));
    }
}