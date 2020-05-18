package aceForsix;

import java.util.*;

public class AbsolutePermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int i = 1; i <= n; i++) {
                for (int i1 = 1; i1 <= n; i1++) {
                    if(Math.abs(i - i1) == k) {
                        if (!set.contains(i1)) {
                            set.add(i1);
                            break;
                        }
                    }
                }
            }
            if(set.size() < n){
                System.out.print(-1);
            }
            else {
                for(int c : set){
                    System.out.print(c + " ");
                }
            }
            System.out.println();
            test--;
        }
    }
}
class NewWay{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        tests :
        for (int i = 0; i < test; i++) {
           int n = in.nextInt();
           int k = in.nextInt();
           HashSet<Integer> set = new HashSet<>();
           int[] arr = new int[n];
            for (int i1 = 0; i1 < n / 2; i1++) {
                int left = i1 + 1;
                int right = n - i1;
                if(left - k > 0 && !set.contains(left - k)){
                    arr[i1] = left - k;
                    set.add(left - k);
                }
                else if(i1 + 1 + k <= n && !set.contains(left + k)){
                    arr[i1] = left + k;
                    set.add(left + k);
                }
                else {
                    System.out.println(-1);
                    continue tests;
                }
                if(right + k <= n && !set.contains(right + k)){
                    arr[n - 1 - i1] = right + k;
                    set.add(right + k);
                }
                else if(right - k > 0 && !set.contains(right - k)){
                    arr[n - 1 - i1] = right - k;
                    set.add(right - k);
                }
                else {
                    System.out.println(-1);
                    continue tests;
                }
            }
            if(n % 2 == 1){
                int middle = (n / 2 ) + 1;
                if(!set.contains(middle + k) || !set.contains(middle - k)){
                    if(!set.contains((n / 2) + 1 + k) && middle + k <= n){
                        arr[(n / 2)] = middle + k;
                        set.add(middle + k);
                    }
                    else if(!set.contains((n / 2) + 1 - k) && middle - k > 0){
                        arr[(n / 2)] = middle - k;
                        set.add(middle - k);
                    }
                    else {
                        System.out.println(-1);
                        continue tests;
                    }
                }
                else {
                    System.out.println(-1);
                    continue tests;
                }
            }
            for(int c : arr){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
