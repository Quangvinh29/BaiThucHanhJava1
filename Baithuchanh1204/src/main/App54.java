package main;

  import slide54.Hinhchunhat;
  import slide54.Hinhtron;
  import slide54.Hinhtru;
  import slide54.Hinhvuong;

  public class App54{
      public static void main(String[] arg){
    Hinhtron Hinhtron = new Hinhtron();
    Hinhtron.xuatTen();
    Hinhtron.nhapBanKinh();
    Hinhtron.tinhChuvi();
    Hinhtron.tinhDientich();
    Hinhtron.inChuvi();
    Hinhtron.inDientich();

    Hinhtru HinhTru = new Hinhtru();
    HinhTru.xuatTen();
    HinhTru.nhapChieucao();
    HinhTru.tinhThetich();
    HinhTru.inThetich();

    Hinhchunhat hinhchunhat = new Hinhchunhat();
    hinhchunhat.xuatTen();
    hinhchunhat.nhapchieudai();
    hinhchunhat.nhapchieurong();
    hinhchunhat.tinhChuvi();
    hinhchunhat.tinhDientich();
    hinhchunhat.inChuvi();
    hinhchunhat.inDientich();

    Hinhvuong hinhvuong = new Hinhvuong();
    hinhvuong.xuatTen();
    hinhvuong.nhapCanh();
    hinhvuong.tinhChuvi();
    hinhvuong.tinhDientich();
    hinhvuong.inChuvi();
    hinhvuong.inDientich();
    }

}
