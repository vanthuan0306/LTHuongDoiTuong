package baitap;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh hình lập phương: ");
        double canh = scanner.nextDouble();
        System.out.println("Thể tích khối lập phuowg là: " + Math.pow(canh, 3));
    }
    
}
