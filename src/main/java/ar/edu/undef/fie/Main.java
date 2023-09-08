package ar.edu.undef.fie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var odd = 0;
        var even = 0;
        if(args.length == 0){
            System.out.println("Result = 0" );
        }else{
            for (var arg : args) {
                if(isOdd(Integer.parseInt(arg))){
                    odd++;
                }else{
                    even++;
                }
            }
            System.out.println("Odd = " + odd);
            System.out.println("even = " + even);
            
        }


    }

    private static boolean isOdd(int number){
        return number % 2 == 0;
    }
}