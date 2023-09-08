package ar.edu.undef.fie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[4];
        int[] numbers = {1, 2, 3, 4};
        int[] maxAndMin = maxAndMin(numbers);
        System.out.println("max number = " + maxAndMin[0]);
        System.out.println("min number = " + maxAndMin[1]);
    }

    private static int[] maxAndMin(int[] numbers){
        int [] result = new int[2];

        int max = numbers[0];
        int min = numbers[0];
        for(var number : numbers){
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }

        result[0]=max;
        result[1]=min;

        return result;
    }


}