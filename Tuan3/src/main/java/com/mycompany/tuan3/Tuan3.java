/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan3; //[cite: 2]

import java.util.Scanner;

public class Tuan3{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bai1: Nhập thông tin sách");
        
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();
        
        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        
        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();
        
        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());
        
        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        // BÀI 1: Hiển thị lại thông tin[cite: 1]
        System.out.println("\n--- THÔNG TIN CUỐN SÁCH ---");
        System.out.println("Mã sách: " + maSach + " | Tên sách: " + tenSach + " | Tác giả: " + tacGia);
        System.out.println("Năm XB: " + namXuatBan + " | Đơn giá: " + donGia + " | Số lượng: " + soLuong);

        // BÀI 2: Tính thành tiền = đơn giá × số lượng[cite: 1]
        double thanhTien = donGia * soLuong;

        // BÀI 3: Phí vận chuyển = 5% giá trị sách (dựa trên thành tiền)[cite: 1]
        double phiVanChuyen = thanhTien * 0.05;

        // BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển[cite: 1]
        double tongTienNhap = thanhTien + phiVanChuyen;

        // IN KẾT QUẢ
        System.out.println("\n=== KẾT QUẢ TÍNH TOÁN NHẬP KHO ===");
        System.out.println("Thành tiền (Bài 2): " + thanhTien);
        System.out.println("Phí vận chuyển (Bài 3): " + phiVanChuyen);
        System.out.println("Tổng tiền nhập (Bài 4): " + tongTienNhap);
    }
}
