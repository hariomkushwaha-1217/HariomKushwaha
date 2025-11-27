package screeningtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>nums=new ArrayList<>();
        System.out.println("Enter numbers (end with -1):");
        while (true) {
            int n=sc.nextInt();
            if (n==-1) 
            		break;
            nums.add(n);
        }
        Map<Integer,Integer> res=new HashMap<>();
        for (int i=1;i<=9;i++) {
            int c=0;
            for (int num:nums) { 
            		if (num%i==0) 
            			c++;
            }
            res.put(i,c);
        }
        System.out.println(res);
    }
}

