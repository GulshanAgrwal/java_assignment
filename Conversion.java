/***
 * description : conversion of all bases into another base and addition, substraction, multiplicatio, and division.
 * Name : Gulshan Agrawal
 * Date : 26-09-2024
 */

public class Conversion {
    // function to check validity of entered base
    public static int isValidBase(int base){
        if(base == 2 || base == 8 || base == 10 || base == 16) return 1;
        else return 0;
    }
    // function to check validity of entered String
    public static boolean isvalidString(int base, String input){
        for(int i = 0; i < input.length() - 1; i ++) {
            char ch = input.charAt(i);
            if(base == 2 && (ch != '0' && ch != '1') ){
                return false;
            }
            else if(base == 8 && !(ch >='0' && ch <= '7') ){
                return false;
            }
            else if(base == 10 && !(ch >= '0' && ch <= '9')){
                return false;
            }
            else if(base == 16 && !((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))){
                return false;
            }
        }
        return true;
    }

    // function for power
    public static int power(int a, int b){
        int p = 1;
        if(b>=1) {
            for (int i = 1; i <= b; i++) {
                p = p * a;
            }
        }
        return p;
    }
    /* function for conversion of ---
    Decimal to Binary
    Decimal to Octal
    Decimal to hexadecimal.
     */
    public static void decimalToOther(int base, int input){
        String Other = "";
        int number = input;
        input = Math.abs(input); // Making the value positive
        while(input != 0){
            int x = input % base;
            if(x > 9) Other = (char)(x + 55) + Other; // For A - F
            else Other = x + Other; // For 0 - 9
            input /= base;
        }
        if(number < 0){
            System.out.println("-"+Other);
        }
       else  System.out.println(Other);
    }
    /* function for conversion of ---
    Binary to decimal
    Octal to decimal
    Hexadecimal to decimal.
     */
    public static int otherToDecimal(int base, String input){
        int decimal = 0;
        int power = input.length() - 1;
        int index = 0;
        // Traversing the entered string
        for(int i=0;i<input.length();i++) {
            // For 0 - 9
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
                index = (int)input.charAt(i) - 48; //Converting character 0 - 9 to integer 0 - 9
        }
            // For A - F
            else if(input.charAt(i) >= 65 && input.charAt(i) <= 70){
                index = (int)input.charAt(i) - 55; // Converting character A - F to integer 10 - 15
            }
            decimal += index * power(base, power);
            power --;
        }
        return decimal;
    }
    /* function for conversion of ---
    Binary to Octal
    Binary to Hexadecimal
    Octal to Binary
    Octal to Hexadecimal
    Hexadecimal to Octal
    Hexadecimal to Binary
     */
    public static void otherToOther(int base1, int base2, String input){
        // Conversion of first base to decimal
        int decimal = otherToDecimal(base1, input);
        // Then conversion of decimal to desired base i.e. second base
        decimalToOther(base2, decimal);
    }
}
