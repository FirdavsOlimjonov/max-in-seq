package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int maxNum = Integer.MIN_VALUE;

        do {
            num = scanner.nextInt();
            maxNum = num!=0?Math.max(maxNum, num):maxNum;
        }while (num!=0);

        return maxNum;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}
