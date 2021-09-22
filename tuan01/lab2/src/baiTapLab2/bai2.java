package baiTapLab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập hệ số bậc 1, b = ");
        int b = scanner.nextInt();
        System.out.print("Nhập hằng số tự do, c = ");
        int c = scanner.nextInt();
        bai2.giaiPTBac2(a ,b ,c);
    }

        public static void giaiPTBac2(int a, int b, int c) {
            
            //tính delta
            float delta = (float) (Math.pow(b, 2) -4*a*c);
            System.out.println("Giá trị delta là: "+delta);
            //tính căn delta
            float candelta = (float) Math.sqrt(delta);
            System.out.println("Giá trị căn delta: " +candelta);
            float x1;
            float x2;
            // tính nghiệm
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
                
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                x1 = (float) ((-b + candelta) / (2*a));
                x2 = (float) ((-b - candelta) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            }
        }
    
    
}
