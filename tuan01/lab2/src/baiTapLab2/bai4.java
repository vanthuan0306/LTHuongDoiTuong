package baiTapLab2;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("1. Giải phương trình bậc 1.");
        System.out.println("2. Giải phương trình bậc 2.");
        System.out.println("3. Tính tiền điện sử dụng.");
        System.out.println("4. Thoát ứng dụng.");
        
        System.out.print("Chọn chức năng [1- 4]: ");
			int chon = scanner.nextInt();
            
			switch (chon) {
                case 1: 
                    System.out.println("Giải phương trình bậc 1.");
                    baiTapLab2.bai1.main(args);;
                    break;
                case 2:
                    System.out.println("Giải phương trình bậc 2.");
                    baiTapLab2.bai2.main(args);
                    break;
                case 3:
                    System.out.println("\tính tiền điện.");
                    baiTapLab2.bai3.main(args);
                    break;
                default:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                 
                    break;
        }
    
    }
}


