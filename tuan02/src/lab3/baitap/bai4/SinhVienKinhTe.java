package lab3.baitap.bai4;

public class SinhVienKinhTe extends SinhVienGD {
	public double DiemMarketing;
    public double DiemSales;

    public SinhVienKinhTe(String hoTen,String nganh,double diemMarketing,double diemSales){
        super(hoTen,nganh);
        this.DiemMarketing = diemMarketing;
        this.DiemSales = diemSales;
    }

    @Override
    public double getDiemTB(){
        double diem;
        diem = (2 * DiemSales + DiemMarketing) /3;
        return diem;
    }

    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Diem MarketTing:"+this.DiemMarketing);
        System.out.println("Diem Sales:"+this.DiemSales);
        System.out.println("Điểm trung bình: " + this.getDiemTB());
        System.out.println("Học lực: " + this.getHocLuc());
    }
}
