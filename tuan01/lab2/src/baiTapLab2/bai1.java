package baiTapLab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        //nhập giá trị
        Scanner  scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.print("Nhập vào số b: ");
        b = scanner.nextInt();

        //thông báo phương trình
        System.out.println("Phương trình bâc 1 nhập và là: " +a+"x + " +b+" = 0.");
        //tìm nghiệm
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x =  (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + x + ".");
        }
    }
    
}
