public class Loops {
    public static void ForLoop(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
    }

    public static void WhileLoop(int start, int end){
        while(start <= end){
            System.out.println(start);
            start++;
        }
    }

    public static void DoWhileLoop(int x){
        int end = 10;
        do{
            System.out.print(x);
            if (++x <= end)
                System.out.print(" ");
        }
        while(x <= end);
    }
}
