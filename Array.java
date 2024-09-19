public class Array {
    public static int[] SimpleArray(int size){
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++) { numbers[i] = i+1; }
        return numbers;
    }

    public static int[][] TwoDimensions(int rows, int columns){
        int[][] numbers = new int[rows][columns];
        int point = 1;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = point++;
            }
        }
        return numbers;
    }
    
    public static void main(String[] args){
        int[][] myArray = TwoDimensions(2, 5);
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[i].length; j++){
                System.out.print(myArray[i][j]);
                if(j + 1 < myArray[i].length) { System.out.print(", ");}
            }
            System.out.println();
        } 
    }
}
