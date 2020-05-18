package aceForsix;

import java.util.Scanner;

public class TheTimeInWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        in.nextLine();
        int min = in.nextInt();
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arr2 = {"twenty", "half"};
        if (min == 0) {
            System.out.println(arr[hour - 1] + " o' clock");
        } else if (min > 0 && min <= 30) {
            if(min == 30){
                System.out.println(arr2[1] + " past " + arr[hour - 1]);
            }
            else {
                if(min < 19) {
                    if (min == 15) {
                        System.out.println(arr[min - 1] + " past " + arr[hour - 1]);
                    }else if(min == 1){
                        System.out.println(arr[min - 1] + " minute past " + arr[hour - 1]);
                    }
                    else {
                        System.out.println(arr[min - 1] + " minutes past " + arr[hour - 1]);
                    }
                }
                else if (min == 20){
                    System.out.println(arr2[0] + " minutes past " + arr[hour - 1]);
                }
                else {
                    String s = String.valueOf(min);
                    int sec = Integer.parseInt(String.valueOf(s.charAt(1)));
                    System.out.println(arr2[0] + " " + arr[sec - 1] + " minutes past " + arr[hour - 1]);
                }
            }

        } else if(min > 30 && min < 60) {
            if((60 - min) == 15){
                System.out.println("quarter to " + arr[hour]);
            }
            else {
                int val = 0;
                val = 60 - min;
                if(val < 15){
                    System.out.println(arr[val - 1] + " minutes to " + arr[hour]);
                }
                else {
                    String s = String.valueOf(val);
                    System.out.println(arr2[0] + " " + arr[Integer.parseInt(String.valueOf(s.charAt(1))) - 1] + " minutes to " + arr[hour]);
                }
            }
        }
    }
}
