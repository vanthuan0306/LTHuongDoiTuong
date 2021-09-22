package lab3.baitap.bai4;
public class SinhVienIT extends SinhVienGD {
	 public double DiemJava;
	    public double DiemCSS;
	    public double DiemHtml;

	    public SinhVienIT(String hoTen,String nganh,double diemJava,double diemCSS,double diemHtml){
	        super(hoTen,nganh);
	        this.DiemJava = diemJava;
	        this.DiemCSS = diemCSS;
	        this.DiemHtml = diemHtml;
	    }


	    @Override
	    public double getDiemTB(){
	        double diem;
	        diem = (2 * DiemJava + DiemCSS + DiemHtml)/4;
	        return diem;
	    }

	    @Override
	    public void Xuat(){
	        super.Xuat();
	        System.out.println("Diem Java:"+ this.DiemJava);
	        System.out.println("Diem CSS:"+this.DiemCSS);
	        System.out.println("Diem HTML:"+this.DiemHtml);
	        System.out.println("Điểm trung bình: " + this.getDiemTB());
	        System.out.println("Học lực: " + this.getHocLuc());
	    }
}
