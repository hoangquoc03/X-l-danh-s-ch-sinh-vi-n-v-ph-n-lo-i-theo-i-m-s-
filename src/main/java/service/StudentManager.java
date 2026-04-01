package service;

import model.Student;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();

    // Thêm sinh viên
    public void add(Student s) {
        list.add(s);
    }

    // Hiển thị
    public void display() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("===== DANH SÁCH SINH VIÊN =====");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // Tìm kiếm theo tên
    public void searchByName(String keyword) {
        boolean found = false;

        for (Student s : list) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy!");
        }
    }

    // Phân loại
    public void classify() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("===== PHÂN LOẠI =====");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
