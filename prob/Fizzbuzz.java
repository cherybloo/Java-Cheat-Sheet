package prob;

public class Fizzbuzz {
    public static void Solve(int x, int y){
        System.out.println("Start from number " + x + " until " + y);
        for (int i = x; i <= y; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.print("Fizz Buzz, ");
            }
            else if (i%5 == 0){
                System.out.print("Buzz, ");
            }
            else if (i%3 == 0){
                System.out.print("Fizz, ");
            }
            else{
                System.out.print(i + ", ");
            }
        }
    }
    public void Hello(){
        System.out.println("Hello from Prob");
    }
}
