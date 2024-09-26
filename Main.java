/***
 * description : conversion of all bases into another base and addition, substraction, multiplicatio, and division.
 * Name : Gulshan Agrawal
 * Date : 26-09-2024
 */

import java.net.ConnectException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int base1;
        int base2;
        int number;
        String string;
        String string1;
        String string2;
        while (choice != 4) {
            System.out.println(Constants.CHOOSE);
            System.out.println(Constants.OPTION1);
            System.out.println(Constants.OPTION2);
            System.out.println(Constants.OPTION3);
            System.out.println(Constants.OPTION4);
            System.out.println(Constants.OPTION5);
            System.out.println(Constants.OPTION6);
            System.out.println(Constants.OPTION7);
            System.out.println(Constants.OPTION9);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print(Constants.ENTERNUMBER1);
                        number = sc.nextInt();
                        System.out.print(Constants.ENTERBASE1);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1)
                        Conversion.decimalToOther(base1, number);
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println(Constants.VALIDINPUT);
                    }
                    break;
                case 2:
                    try {
                        System.out.print(Constants.ENTERBASE1);
                        string = sc.next();
                        System.out.print(Constants.CURRENTBASE);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1){
                            if(Conversion.isvalidString(base1, string) == true){
                                Conversion.otherToDecimal(base1, string);
                            }
                            else{
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println(Constants.VALIDINPUT);
                    }
                    break;
                case 3:
                    try {
                        System.out.print(Constants.ENTERNUMBER1);
                        string = sc.next();
                        System.out.print(Constants.CURRENTBASE);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1){
                            if(Conversion.isvalidString(base1, string) == false){
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }

                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                        System.out.print(Constants.ENTERBASE1);
                        base2 = sc.nextInt();
                        if(Conversion.isValidBase(base2) == 1)
                        Conversion.otherToOther(base1, base2, string);
                        else{
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println(Constants.VALIDINPUT);
                    }
                    break;
                case 4:
                    try{
                        System.out.println(Constants.FIRSTNUMBER);
                        string1 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1){
                            if(Conversion.isvalidString(base1, string1) == false){
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                        System.out.println(Constants.SECONDNUMBER);
                        string2 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base2 = sc.nextInt();
                        if(Conversion.isValidBase(base2) == 1){
                            if(Conversion.isvalidString(base2, string2) == true){
                                Operations.addition(string1, base1, string2, base2);
                            }
                            else{
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    }
                    catch (Exception e) {
                        System.out.println(Constants.VALIDBASE);
                    }
                case 5:
                    try{
                        System.out.println(Constants.FIRSTNUMBER);
                        string1 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1){
                            if(Conversion.isvalidString(base1, string1) == false){
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                        System.out.println(Constants.SECONDNUMBER);
                        string2 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base2 = sc.nextInt();
                        if(Conversion.isValidBase(base2) == 1){
                            if(Conversion.isvalidString(base2, string2) == true){
                                Operations.substraction(string1, base1, string2, base2);
                            }
                            else{
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    }
                    catch (Exception e) {
                        System.out.println(Constants.VALIDINPUT);
                    }
                case 6:
                    try{
                        System.out.println(Constants.INT);
                        System.out.println(Constants.FIRSTNUMBER);
                        string1 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1){
                            if(Conversion.isvalidString(base1, string1) == false){
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                        System.out.println(Constants.SECONDNUMBER);
                        string2 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base2 = sc.nextInt();
                        if(Conversion.isValidBase(base2) == 1){
                            if(Conversion.isvalidString(base2, string2) == true){
                                Operations.multiplication(string1, base1, string2, base2);
                            }
                            else{
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    }
                    catch (Exception e) {
                        System.out.println(Constants.VALIDINPUT);
                    }
                case 7:
                    try{
                        System.out.println(Constants.DIV);
                        System.out.println(Constants.FIRSTNUMBER);
                        string1 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base1 = sc.nextInt();
                        if(Conversion.isValidBase(base1) == 1){
                            if(Conversion.isvalidString(base1, string1) == false){
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                        System.out.println(Constants.SECONDNUMBER);
                        string2 = sc.next();
                        System.out.println(Constants.CURRENTBASE);
                        base2 = sc.nextInt();
                        if(Conversion.isValidBase(base2) == 1){
                            if(Conversion.isvalidString(base2, string2) == true){
                                Operations.division(string1, base1, string2, base2);
                            }
                            else{
                                System.out.println(Constants.VALIDINPUT);
                                break;
                            }
                        }
                        else {
                            System.out.println(Constants.VALIDBASE);
                            break;
                        }
                    }
                    catch (Exception e) {
                        System.out.println(Constants.VALIDINPUT);
                    }
                case 9:
                    System.out.print(Constants.THANKS);
                    break;
                default:
                    System.out.println(Constants.VALIDINPUT);
            }
        }
    }
}
