package model;

public class Student {
    private static int autoId = 1;

    private int id;
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.id = autoId++;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    public void setName(String name) { this.name = name; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // Phân loại GPA
    public String getRank() {
        if (gpa >= 8.5) return "Xuất sắc";
        else if (gpa >= 7.0) return "Giỏi";
        else if (gpa >= 5.5) return "Khá";
        else return "Trung bình / Yếu";
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Tên: " + name +
                " | GPA: " + gpa +
                " | Xếp loại: " + getRank();
    }
}
