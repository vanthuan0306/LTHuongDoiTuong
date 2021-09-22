package baiTapLab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDien;
        double tien;
        System.out.print("Nhập số điện bạn sử dụng: " );
        soDien =scanner.nextInt();
        
        if(soDien <= 50){
            tien = soDien * 1000;
            //System.out.println("Số tiền điện tháng này của bạn là: " +tien);

        } else {
            tien = 50*1000 + (soDien - 50)*1200;
        }
        System.out.println("Số tiền điện tháng này của bạn là: " +tien);
    }
    
}
