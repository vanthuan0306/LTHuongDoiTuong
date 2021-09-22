package baitap;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài hình chữ nhật: ");
        double chieuDaiHCN = scanner.nextDouble();
        System.out.print("Chiều rộng hình chữ nhật: ");
        double chieuRongHCN = scanner.nextDouble();
        double chuViHCM = (chieuDaiHCN + chieuRongHCN) *2;
        System.out.println("Chu vi HCN là: "+ chuViHCM);
    }
    
}
