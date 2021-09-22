package lab3.baitap.bai4;

abstract public class SinhVienGD {
	  private String HoTen;
	    private String Nganh;

	    public SinhVienGD(){}

	    public SinhVienGD(String hoTen,String nganh){
	        this.HoTen = hoTen;
	        this.Nganh = nganh;
	    }

	    public String getHoTen(){
	        return HoTen;
	    }

	    public String getNganh(){
	        return Nganh;
	    }

	    public void setHoTen(String hoTen){
	        this.HoTen = hoTen;
	    }

	    public void setNganh(String nganh){
	        this.Nganh = nganh;
	    }

	    abstract public double getDiemTB();

	    public String getHocLuc(){
	        double diem = this.getDiemTB();
	        String hocLuc= "";
	        if(diem<5) {
	            hocLuc= "Yếu";
	        }
	        if(diem>=5 && diem<6.5) {
	            hocLuc= "Trung bình";
	        }
	        if(diem>=6.5 && diem<7.5) {
	            hocLuc= "Khá";
	        }
	        if(diem>=7.5 && diem<9) {
	            hocLuc= "Giỏi";
	        }
	        if(diem>=9) {
	            hocLuc= "Xuất sắc";
	        }
	        return hocLuc;
	    }
	     public void Xuat(){
	        System.out.println("Ho Ten SV:"+this.HoTen);
	        System.out.println("Nganh:"+this.Nganh);
	        System.out.println("Diem TB:"+getDiemTB());
	        System.out.println("Hoc Luc:"+getHocLuc());
	     }
}
