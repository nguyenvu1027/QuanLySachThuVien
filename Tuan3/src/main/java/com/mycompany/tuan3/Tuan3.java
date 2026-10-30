/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan3; 

import java.util.Scanner;
import java.time.Year;

public class Tuan3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        // ================= PHẦN 1: NHẬP DỮ LIỆU =================
        System.out.println("=== BÀI 1: NHẬP THÔNG TIN SÁCH ===");
        
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

        // Bổ sung nhập loại sách cho Bài 4 (Tuần 4)
        System.out.print("Chọn loại sách (1: SGK, 2: Tham khảo, 3: Chuyên ngành, 4: Khác): ");
        int loaiSach = Integer.parseInt(sc.nextLine());

        // ================= PHẦN 2: XỬ LÝ YÊU CẦU TUẦN 3 =================
        System.out.println("\n--- THÔNG TIN CUỐN SÁCH ---");
        System.out.println("Mã sách: " + maSach + " | Tên sách: " + tenSach + " | Tác giả: " + tacGia);
        System.out.println("Năm XB: " + namXuatBan + " | Đơn giá: " + donGia + " | Số lượng: " + soLuong);

        // Tính toán[cite: 1]
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n=== KẾT QUẢ TÍNH TOÁN NHẬP KHO (TUẦN 3) ===");
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Phí vận chuyển: " + phiVanChuyen);
        System.out.println("Tổng tiền nhập: " + tongTienNhap);


        // ================= PHẦN 3: XỬ LÝ YÊU CẦU TUẦN 4 =================
        System.out.println("\n=== QUYẾT ĐỊNH & ĐÁNH GIÁ SÁCH (TUẦN 4) ===");
        
        // Bài 1: Kiểm tra tính hợp lệ[cite: 4]
        int namHienTai = Year.now().getValue();
        System.out.print("- Tính hợp lệ: ");
        if (donGia > 0 && soLuong >= 0 && namXuatBan > 0 && namXuatBan <= namHienTai) {
            System.out.println("Dữ liệu sách hợp lệ.");
        } else {
            System.out.println("Dữ liệu sách KHÔNG hợp lệ.");
        }

        // Bài 2: Phân loại giá trị[cite: 4]
        System.out.print("- Mức giá: ");
        if (donGia < 50000) {
            System.out.println("Sách giá thấp");
        } else if (donGia <= 100000) {
            System.out.println("Sách giá trung bình");
        } else if (donGia <= 200000) {
            System.out.println("Sách giá cao");
        } else {
            System.out.println("Sách giá đặc biệt");
        }

        // Bài 3: Phân loại tồn kho[cite: 4]
        System.out.print("- Tình trạng kho: ");
        if (soLuong == 0) {
            System.out.println("Hết sách");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("Sắp hết");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("Còn ít");
        } else if (soLuong > 20) {
            System.out.println("Còn nhiều");
        } else {
            System.out.println("Số lượng lỗi");
        }

        // Bài 4: Phân loại loại sách[cite: 4]
        System.out.print("- Phân loại: ");
        switch (loaiSach) {
            case 1:
                System.out.println("Sách giáo khoa");
                break;
            case 2:
                System.out.println("Sách tham khảo");
                break;
            case 3:
                System.out.println("Sách chuyên ngành");
                break;
            case 4:
                System.out.println("Sách khác");
                break;
            default:
                System.out.println("Mã loại sách không hợp lệ");
                break;
        }
    }
}