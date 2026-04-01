package org.example;
import model.Student;
import service.StudentManager;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo tên");
            System.out.println("4. Phân loại sinh viên");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Nhập số lượng: ");
                        int n = Integer.parseInt(sc.nextLine());

                        for (int i = 0; i < n; i++) {
                            System.out.println("\nSinh viên " + (i + 1));

                            System.out.print("Tên: ");
                            String name = sc.nextLine();

                            System.out.print("GPA: ");
                            double gpa = Double.parseDouble(sc.nextLine());

                            manager.add(new Student(name, gpa));
                        }
                        break;

                    case 2:
                        manager.display();
                        break;

                    case 3:
                        System.out.print("Nhập tên cần tìm: ");
                        String keyword = sc.nextLine();
                        manager.searchByName(keyword);
                        break;

                    case 4:
                        manager.classify();
                        break;

                    case 0:
                        System.out.println("Thoát!");
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Nhập sai số!");
            }
        }
    }
}