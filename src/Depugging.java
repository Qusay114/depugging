public class Depugging {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //variables and types
        int num = 24 ;
        float num2 = 24.5F;
        double num3 = 24.217463846;
        char letterA = 'A' ;
        String word = "hello";
        //conditional
        int number1 = 50 ;
        int number2 = 100 ;
        if(number2 > number1){
            System.out.println("number2 bigger than number1");
        } else {
            System.out.println("number1 bigger than number2");
        }
        //arrays
        int[] numbers = {1,2,3,4};
        char[] letters = {'a' , 'b' , 'c' , 'd'};
        //loops
        for(char letter: letters){
            System.out.println(letter);
        }
        //functions
        System.out.println("number1 + number2 = " + summation(number1 , number2));

    }

  public static int summation(int num1 , int num2){
        return num1 + num2 ;
  }
}
