import java.util.Scanner;
import java.util.ArrayList;;
interface Inhap {
    void nhap();
   }
  interface Ixuat {
   void xuat();
    
   }
   class VatNuoi implements Inhap,Ixuat {
    Scanner sc= new Scanner(System.in);
    String maVatNuoi;
    String tenVatNuoi;
    int tuoiVatNuoi;
    double canNangVatNuoi;
    String loaiVatNuoi;
    String trangThaiVatNuoi;
    static int tongVatNuoi = 0;
    public VatNuoi(){

    }
    public VatNuoi(String maVatNuoi,String tenVatNuoi,int tuoiVatNuoi,double canNangVatNuoi,String loaiVatNuoi,String trangThaiVatNuoi){ 
        this.maVatNuoi=maVatNuoi; 
        this.tenVatNuoi=tenVatNuoi;
        this.tuoiVatNuoi=tuoiVatNuoi;
        this.canNangVatNuoi=canNangVatNuoi;
        this.loaiVatNuoi=loaiVatNuoi;
        this.trangThaiVatNuoi=trangThaiVatNuoi;
    }
    String GetmaVatNuoi(){
        return maVatNuoi;
    }
    String GettenVatNuoi(){
        return tenVatNuoi;
    }
    int GettuoiVatNuoi(){
        return tuoiVatNuoi;
    }
    double GetcanNangVatNuoi(){
        return canNangVatNuoi;
    }
    String GetloaiVatNuoi(){
        return maVatNuoi;
    }
    String GettrangThaiVatNuoi(){
        return maVatNuoi;
    }
    void SetmaVatNuoi(String NewmaVatNuoi){
        maVatNuoi=NewmaVatNuoi;
    }
    void SettenVatNuoi(String NewtenVatNuoi){
        tenVatNuoi=NewtenVatNuoi;
    }
    void SettuoiVatNuoi( int NewtuoiVatNuoi){
        tuoiVatNuoi=NewtuoiVatNuoi;
    }
    void SetcanNangVatNuoi(double NewcanNangVatNuoi){
        canNangVatNuoi=NewcanNangVatNuoi;
    }
    void setloaiVatNuoi(String NewloaiVatNuoi){
        loaiVatNuoi=NewloaiVatNuoi;
    }
    void SettrangThaiVatNuoi(String NewtrangThaiVatNuoi){
        trangThaiVatNuoi=NewtrangThaiVatNuoi;
    }
    @Override
    public void nhap(){
        System.out.println("nhap ma vat nuoi ");
        maVatNuoi=sc.nextLine();
        System.out.println("nhap ten vat nuoi ");
        tenVatNuoi=sc.nextLine();
        System.out.println("nhap tuoi vat nuoi ");
        tuoiVatNuoi=sc.nextInt();
        System.out.println("nhap can nang vat nuoi ");
        canNangVatNuoi=sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap loai vat nuoi ");
        loaiVatNuoi=sc.nextLine();
        System.out.println("trang thai vat nuoi \n 1: bi benh \n 2:khoe manh");
        int chon=0;
        chon=sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1:
            trangThaiVatNuoi=" bi benh ";
                break;
        case 2:
            trangThaiVatNuoi=" khoe manh ";
            default:
            System.out.println(" loi xin khoi dong lai chuong trinh sau ");
            return;
        }
    }
    public void xuat(){
        System.out.print("ma vat nuoi "+maVatNuoi+" ten vat nuoi: "+tenVatNuoi+", tuoi vat nuoi: "+tuoiVatNuoi+", can nang vat nuoi: "+canNangVatNuoi+", loai vat nuoi "+loaiVatNuoi+", trang thai vat nuoi: "+trangThaiVatNuoi);
    }

}
class Ga extends VatNuoi{
    String mauLong;
    public Ga(){

    }
    public Ga(String maVatNuoi,String tenVatNuoi,int tuoiVatNuoi,double canNangVatNuoi,String loaiVatNuoi,String trangThaiVatNuoi,String mauLong){
        super(maVatNuoi,tenVatNuoi,tuoiVatNuoi,canNangVatNuoi,loaiVatNuoi,trangThaiVatNuoi);
        this.mauLong=mauLong;
    }
    public String getMauLong() {
        return mauLong;
    }
    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }
    public void nhap(){
      super.nhap();
      System.out.println(" Hay nhap mau long cua chu ga nay ");
      mauLong=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println(" Mau long: "+mauLong);
        
      }

}
class Bo extends VatNuoi{
    String GiongLoai;
    public Bo(){

    }
    public Bo(String maVatNuoi,String tenVatNuoi,int tuoiVatNuoi,double canNangVatNuoi,String loaiVatNuoi,String trangThaiVatNuoi,String GiongLoai){
        super(maVatNuoi,tenVatNuoi,tuoiVatNuoi,canNangVatNuoi,loaiVatNuoi,trangThaiVatNuoi);
        this.GiongLoai=GiongLoai;
    }
    public void nhap(){
      super.nhap();
      System.out.println(" Hay nhap mau long cua chu ga nay ");
      GiongLoai=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println(" Mau long: "+GiongLoai);
        
      }
}
   class DSVatNuoi{
    Scanner sc= new Scanner(System.in);
    ArrayList<VatNuoi> dsVatNuoi=new ArrayList<>();
    String tinhtrang;
    String nhapMaChuongNuoi;
    void them(){
        int chon=sc.nextInt();
        System.out.println("Con vat duoc them la \n 1: Ga \n 2:Bo");
        switch (chon) {
            case 1:
                Ga ga= new Ga();
                ga.nhap();
                dsVatNuoi.add(ga);
                break;
            case 2:
            Bo bo= new Bo();
            bo.nhap();
            dsVatNuoi.add(bo);
            default:
            System.out.println("Erro");
                break;
        }
       }
       void xoa(){
        int index=0;
        int moc=-1;
        System.out.println("Nhap ma con vat muon xoa");

        String maCanXoa= sc.nextLine();
        for(int i=0;i<dsVatNuoi.size();i++){
            if(dsVatNuoi.get(i).maVatNuoi.equals(maCanXoa)){
                index=i;
             moc++;
             break;
            }
         }
         if(moc==-1){
            System.out.println("Khong co dong vat nao co ma nhu vay ");
            return;
         }
         else{
            dsVatNuoi.remove(index);
            System.out.println(" da xoa ");
         }
       }
       void hienThiDanhSachVatNuoi(){
        for(int i=0;i<dsVatNuoi.size();i++){
            dsVatNuoi.get(i).xuat();
         }
       }
       void SuaVatNUoi(){
        int indexSua=0;
        int moc=-1;
        System.out.println("Nhap ma con vat muon sua");

        String maCanSua= sc.nextLine();
        for(int i=0;i<dsVatNuoi.size();i++){
            if(dsVatNuoi.get(i).maVatNuoi.equals(maCanSua)){
                indexSua=i;
             moc++;
             break;
            }
         }
       if(moc==-1){
        System.out.println(" khong co dong vat nao co ma nhu vay ");
        return;
       }
       else{

            if (dsVatNuoi.get(indexSua) instanceof Ga) {
                Ga ga = (Ga) dsVatNuoi.get(indexSua); 
                System.out.println("Ban muon sua gi cho con ga co ma la " + ga.maVatNuoi);
                System.out.println("1. Ma vat nuoi\n2. Ten vat nuoi\n3. Tuoi vat nuoi\n4. Can nang vat nuoi\n5. Loai vat nuoi\n6. Trang thai vat nuoi\n7. Mau long");
    
                int chon = sc.nextInt();
                sc.nextLine(); 
    
                switch (chon) {
                    case 1:
                        System.out.println("Nhap ma moi:");
                        String ma = sc.nextLine();
                        ga.maVatNuoi = ma;
                        System.out.println("Da sua.");
                        break;
                    case 2:
                        System.out.println("Nhap ten moi:");
                        String ten = sc.nextLine();
                        ga.tenVatNuoi = ten;
                        System.out.println("Da sua.");
                        break;
                    case 3:
                        System.out.println("Nhap tuoi moi:");
                        int tuoi = sc.nextInt();
                        ga.tuoiVatNuoi = tuoi;
                        System.out.println("Da sua.");
                        break;
                    case 4:
                        System.out.println("Nhap can nang moi:");
                        double cannang = sc.nextDouble();
                        ga.canNangVatNuoi = cannang;
                        System.out.println("Da sua.");
                        break;
                    case 5:
                        System.out.println("Nhap loai vat nuoi moi:");
                        String loai = sc.nextLine();
                        ga.loaiVatNuoi = loai;
                        System.out.println("Da sua.");
                        break;
                    case 6:
                        System.out.println("Nhap trang thai moi:");
                        String trangthai = sc.nextLine();
                        ga.trangThaiVatNuoi = trangthai;
                        System.out.println("Da sua.");
                        break;
                    case 7:
                        System.out.println("Nhap mau long moi:");
                        String maulong = sc.nextLine();
                        ga.mauLong = maulong; 
                        System.out.println("Da sua.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le.");
                        break;
                }
            }
            else if(dsVatNuoi.get(indexSua) instanceof Bo){
                Bo bo = (Bo) dsVatNuoi.get(indexSua); 
                System.out.println("Ban muon sua gi cho con bo co ma la " + bo.maVatNuoi);
                System.out.println("1. Ma vat nuoi\n2. Ten vat nuoi\n3. Tuoi vat nuoi\n4. Can nang vat nuoi\n5. Loai vat nuoi\n6. Trang thai vat nuoi\n7. giong loai");
    
                int chon = sc.nextInt();
                sc.nextLine(); 
    
                switch (chon) {
                    case 1:
                        System.out.println("Nhap ma moi:");
                        String ma = sc.nextLine();
                        bo.maVatNuoi = ma;
                        System.out.println("Da sua.");
                        break;
                    case 2:
                        System.out.println("Nhap ten moi:");
                        String ten = sc.nextLine();
                        bo.tenVatNuoi = ten;
                        System.out.println("Da sua.");
                        break;
                    case 3:
                        System.out.println("Nhap tuoi moi:");
                        int tuoi = sc.nextInt();
                        bo.tuoiVatNuoi = tuoi;
                        System.out.println("Da sua.");
                        break;
                    case 4:
                        System.out.println("Nhap can nang moi:");
                        double cannang = sc.nextDouble();
                        bo.canNangVatNuoi = cannang;
                        System.out.println("Da sua.");
                        break;
                    case 5:
                        System.out.println("Nhap loai vat nuoi moi:");
                        String loai = sc.nextLine();
                        bo.loaiVatNuoi = loai;
                        System.out.println("Da sua.");
                        break;
                    case 6:
                        System.out.println("Nhap trang thai moi:");
                        String trangthai = sc.nextLine();
                        bo.trangThaiVatNuoi = trangthai;
                        System.out.println("Da sua.");
                        break;
                    case 7:
                        System.out.println("Nhap giong loai moi:");
                        String GiongLoai = sc.nextLine();
                        bo.GiongLoai = GiongLoai; 
                        System.out.println("Da sua.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le.");
                        break;
                }
            }
        }
       }
   }
public class QLDongVat {
public static void main(String args[]){
    VatNuoi a= new VatNuoi();
    a.nhap();
    a.xuat();
}
    
}