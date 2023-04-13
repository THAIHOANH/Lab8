/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class SanPham {
       private String tenSp;
       private double dongia;
       private double giamgia;
       
       public SanPham(){}
       
       public SanPham(String tensp, double dongia, double giamgia){
             this.tenSp = tenSp;
             this.dongia = dongia;
             this.giamgia = giamgia;
       }
       
       public String getTenSp(){
           return tenSp;
       }
       public void setTenSp(String tenSp){
           this.tenSp = tenSp;
       }
       public double getDongia(){
           return dongia;
       }
       public void setDongia(double dongia){
           this.dongia = dongia;
       }
       public double getGiamgia(){
           return giamgia;
       }
       public void setGiamgia(double giamgia){
           this.giamgia = giamgia;
       }
       private double getThueNhapKho(){
           return dongia * 0.1;
       }
       
       public void xuat(){
           System.out.println("Ten San Pham:" + tenSp);
           System.out.println("Don gia:" + dongia);
           System.out.println("Giam gia:" + giamgia);
           System.out.println("Thue Nhap Khau" + getThueNhapKho());
       }
       public void nhap(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap Ten San Pham:");
           tenSp = scanner.nextLine();
       }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01",20000,1000);
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp2.nhap();
        sp1.xuat();
        sp2.xuat();
    }
    
}
