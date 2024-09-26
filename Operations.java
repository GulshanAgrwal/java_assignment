/***
 * description : conversion of all bases into another base and addition, substraction, multiplicatio, and division.
 * Name : Gulshan Agrawal
 * Date : 26-09-2024
 */

public class Operations {
    // Function to perform binary, octal, decimal, hexadecimal addition
    public static void addition(String first, int base1, String second, int base2){
        String sum = "";
        if(base1 == base2) {
            int firstInt = Conversion.otherToDecimal(base1, first);
            int secondInt = Conversion.otherToDecimal(base2, second);
            int add = firstInt + secondInt;
            Conversion.decimalToOther(base1, add);
        }
        else{
            System.out.println(Constants.DIFFERENT);
            System.out.println(Constants.TRYAGAIN);
        }
    }
    // Function to perform binary, octal, decimal, hexadecimal substraction
    public static void substraction(String first, int base1, String second, int base2){
        String sum = "";
        if(base1 == base2) {
            int firstInt = Conversion.otherToDecimal(base1, first);
            int secondInt = Conversion.otherToDecimal(base2, second);
            int substract = firstInt - secondInt;
            Conversion.decimalToOther(base1, substract);
        }
        else{
            System.out.println(Constants.DIFFERENT);
            System.out.println(Constants.TRYAGAIN);
        }
    }
    // Function to perform binary, octal, decimal, hexadecimal multiplication
    public static void multiplication(String first, int base1, String second, int base2){
        String sum = "";
        if(base1 == base2) {
            int firstInt = Conversion.otherToDecimal(base1, first);
            int secondInt = Conversion.otherToDecimal(base2, second);
            int multiply = firstInt * secondInt;
            Conversion.decimalToOther(base1, multiply);
        }
        else{
            System.out.println(Constants.DIFFERENT);
            System.out.println(Constants.TRYAGAIN);
        }
    }
    // Function to perform binary, octal, decimal, hexadecimal division
    public static void division(String first, int base1, String second, int base2){
        String sum = "";
        if(base1 == base2) {
            int firstInt = Conversion.otherToDecimal(base1, first);
            int secondInt = Conversion.otherToDecimal(base2, second);
            int divide = firstInt / secondInt;
            Conversion.decimalToOther(base1, divide);
        }
        else{
            System.out.println(Constants.DIFFERENT);
            System.out.println(Constants.TRYAGAIN);
        }
    }

}
