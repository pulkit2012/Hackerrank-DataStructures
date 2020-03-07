package Hackerrank;

import java.util.Scanner;

public class DayOfTheProg {
    public static String dateFnder(int[] months , int inputYear){
        int adder = 0;
        int index = 0;
        for (int i = 0; i < months.length; i++) {
            adder = adder + months[i];
            if(adder > 256){
                index = i;
                break;
            }
        }
        adder = adder - months[index];
        String month = "";
        if((index + 1) < 10){
             month = "0" + String.valueOf(index + 1);
        }
        else{
             month = String.valueOf(index+1);
        }
        int days = 256 - adder;
        return days + "." + month + "."  + inputYear;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputYear = in.nextInt();
        in.nextLine();
        if(inputYear >= 1700 && inputYear <= 1917) {
            if(inputYear % 4 == 0){
                int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
                System.out.println(dateFnder(months,inputYear));
            }
            else{
                int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
                System.out.println(dateFnder(months,inputYear));
            }
        }
        else if(inputYear == 1918){
            if(inputYear % 400 == 0 || (inputYear % 4 == 0 && inputYear % 100 != 0)){
                int[] months = {32,15,31,30,31,30,31,31,30,31,30,31};
                System.out.println(dateFnder(months,inputYear));
            }
            else {
                int[] months = {32,14,31,30,31,30,31,31,30,31,30,31};
                System.out.println(dateFnder(months,inputYear));
            }

        }
        else if(inputYear > 1918 && inputYear <= 2700){
            if(inputYear % 400 == 0 || (inputYear % 4 == 0 && inputYear % 100 != 0)){
                int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
                System.out.println(dateFnder(months,inputYear));
            }
            else {
                int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
                System.out.println(dateFnder(months,inputYear));
            }
        }
    }
}
