package aceForsix;

import java.util.*;

public class BeautifulTripplets {
    static boolean contains(int a,int[] arr){
        boolean temp = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                temp = true;
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[] arr = new int[n];
        int beautifulTriplets = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (Integer digit : arr) {
            if (contains(digit + d,arr) && contains(digit + (2 * d),arr)) {
                beautifulTriplets++;
            }
        }
        System.out.println(beautifulTriplets);
    }
}
