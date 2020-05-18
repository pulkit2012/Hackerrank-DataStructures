package aceForsix;

import java.util.Scanner;

public class StrongPass {
    static boolean checker(String s,String sub){
        boolean temp = false;
        for (int i = 0; i < s.length(); i++) {
            if(sub.contains(String.valueOf(s.charAt(i)))){
                temp = true;
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String input = in.nextLine().trim();
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int counter = 0;
        if(!checker(input,numbers)){
            counter++;
        }
        if(!checker(input,lower_case)){
            counter++;
        }
        if(!checker(input,upper_case)){
            counter++;
        }
        if(!checker(input,special_characters)) {
            counter++;
        }
        if(input.length() >= 6){
            System.out.println(counter);
        }
        else {
            if(input.length() + counter >= 6){
                System.out.println(counter);
            }
            else {
                System.out.println((6 - (input.length() + counter)) + counter);
            }
        }
    }
}
