package lab3.baitap.bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLySV {
	List<SinhVienGD> dsSinhVien = new ArrayList<>();

    public void NhapThongTinSvIT(){
        double DiemJava;
        double DiemCss;
        double DiemHtml;
        String HoTen;
        String Nganh;


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho Ten SV:");
        HoTen = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap nganh:");
        Nganh = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Nhap diem Java:");
        DiemJava = sc3.nextDouble();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Nhap diem CSS:");
        DiemCss = sc4.nextDouble();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Nhap diem HTML:");
        DiemHtml = sc5.nextDouble();

        SinhVienIT svIT = new SinhVienIT(HoTen,Nganh,DiemJava,DiemCss,DiemHtml);
        dsSinhVien.add(svIT);

    }

    public void NhapThongTinSvKinhTe(){
        double diemMakerting;
        double diemSales;
        String hoTen;
        String nganh;

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Nhap Ho Ten SV:");
        hoTen = sc6.nextLine();

        Scanner sc7 = new Scanner(System.in);
        System.out.println("Nhap nganh:");
        nganh = sc7.nextLine();

        Scanner sc8 = new Scanner(System.in);
        System.out.println("Nhap diem Marketing:");
        diemMakerting = sc8.nextDouble();

        Scanner sc9 = new Scanner(System.in);
        System.out.println("Nhap diem Sales:");
        diemSales = sc9.nextDouble();

        SinhVienKinhTe svBIZ = new SinhVienKinhTe(hoTen,nganh,diemMakerting,diemSales);
        dsSinhVien.add(svBIZ);
    }

    public void xuatDanhSachSinhVien() {
        if (dsSinhVien.size() == 0) {
            System.out.println("Chưa có sinh viên trong danh sách");
        } else {
            for (SinhVienGD svgd : dsSinhVien)
                svgd.Xuat();
            System.out.println("\n");
        }
    }

    public void xuatDanhSachSinhVienHocLucGioi() {
        System.out.println("Danh sách sinh viên có học lực Giỏi: ");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            if (dsSinhVien.get(i).getHocLuc() == "Giỏi") {
                dsSinhVien.get(i).Xuat();
            }
        }
    }
    public void sapXepSinhVienTheoDiem() {
        Comparator<SinhVienGD> compIt = new Comparator<SinhVienGD>() {
            @Override
            public int compare(SinhVienGD o1, SinhVienGD o2) {
                // return o1.getDiem().compareTo(o2.getDiem());
                if (o1.getDiemTB() > o2.getDiemTB()) {
                    return 1;
                } else if (o1.getDiemTB() < o2.getDiemTB()) {
                    return -1;
                } else
                    return 0;
            }
        };
        Collections.sort(dsSinhVien, compIt);
        if (dsSinhVien.size() == 0) {
            System.out.println("Chưa có sinh viên trong danh sách");
        } else {
            System.out.println("Danh sách sinh viên sắp xếp theo điểm:");
            for (SinhVienGD svgd : dsSinhVien)
                svgd.Xuat();
            System.out.println("\n");
        }
    }
    
    
}

