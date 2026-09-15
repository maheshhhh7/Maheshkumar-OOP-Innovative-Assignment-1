// Problem A: Inheritance and constructor chaining using super()

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class GraduateStudent extends Student {
    String thesisTitle;

    GraduateStudent(String name, int rollNo, String thesisTitle) {
        super(name, rollNo);
        this.thesisTitle = thesisTitle;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class ProblemA {
    public static void main(String[] args) {
        Student student = new Student("Aarav Sharma", 101);
        System.out.println("--- Student ---");
        student.display();

        GraduateStudent gradStudent = new GraduateStudent(
                "Priya Verma", 205, "Machine Learning for Crop Yield Prediction");
        System.out.println("\n--- Graduate Student ---");
        gradStudent.display();
    }
}
