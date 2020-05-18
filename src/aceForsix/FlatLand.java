package aceForsix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FlatLand {
    static boolean finder(int a,int[] arr){
        boolean temp = false;
        for (int i = 0; i < arr.length; i++) {
            if(a == arr[i]){
                temp = true;
                break;
            }
        }
        return temp;
    }
    static int distanceGetter(int a,int[] arr){
        Arrays.sort(arr);
        int dist = Math.abs(a - arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(Math.abs(a - arr[i]) > dist){
                break;
            }
            else {
                dist = Math.abs(a - arr[i]);
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        int[] cities = new int[n];
        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }
        int[] space = new int[m];
        for (int i = 0; i < m; i++) {
            space[i] = in.nextInt();
        }
        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            if (finder(cities[i], space)) {
                dist.add(0);
            } else {
                dist.add(distanceGetter(cities[i], space));
            }
        }
        Collections.sort(dist);
        System.out.println(dist.get(dist.size() - 1));
    }
}
