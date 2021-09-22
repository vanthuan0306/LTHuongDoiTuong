package lab3.baitap.bai4;

import java.util.Scanner;

public class MainSV {

	public static void main(String[] args) {
		

		int maNganh;
        String functionKey;
        int endKey = 1;

        QuanLySV mn = new QuanLySV();

        while (endKey == 1) {
            System.out.println(" ");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Xuất thông tin danh sách sinh viên");
            System.out.println("3.Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4.Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5.Kết thúc");
            System.out.println("Mời bạn lựa chọn thao tác cần thực hiện");

            Scanner scan = new Scanner(System.in);
            functionKey = scan.nextLine();

            switch (functionKey) {
                case "1": {
                    System.out.println("Mời bạn chọn ngành(0:IT---1:Marketing): ");
                    Scanner scan2 = new Scanner(System.in);
                    maNganh = scan2.nextInt();

                    if (maNganh == 0) {
                        mn.NhapThongTinSvIT();
                    }
                    else {
                        mn.NhapThongTinSvKinhTe();
                    }
                    break;
                }
                case "2":
                    mn.xuatDanhSachSinhVien();
                    break;

                case "3": {
                    mn.xuatDanhSachSinhVienHocLucGioi();
                    break;
                }
                case "4": {
                    mn.sapXepSinhVienTheoDiem();
                    break;
                }

                case "5": {
                    endKey = 0;
                    break;
                }
                default:
                    System.out.println("Bạn đã nhập sai từ khóa, mời nhập lại");
                    break;
            }
        }
	}

}
