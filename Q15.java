class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId; 
        this.studentName = studentName;
    }

    
    public void setStudentId(int studentId) {
        this.studentId = studentId; 
    }

    public int getStudentId() {
        return this.studentId; 
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId); 
        System.out.println("Student Name: " + this.studentName);
    }
}

public class Q15 {
    public static void main(String[] args) {
        
        Student student = new Student(1020, "Aayush");
        System.out.println("Initial Details:");
        student.displayDetails();
        student.setStudentId(1021);
        System.out.println("\nUpdated Details:");
        student.displayDetails();
    }
}
