// Problem B: Interface implementation

interface Gradable {
    double calculateGPA();
}

class UndergradStudent implements Gradable {
    String name;
    int rollNo;
    double[] subjectMarks; // marks out of 100 for each subject

    UndergradStudent(String name, int rollNo, double[] subjectMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjectMarks = subjectMarks;
    }

    @Override
    public double calculateGPA() {
        double total = 0;
        for (double marks : subjectMarks) {
            total += marks;
        }
        double average = total / subjectMarks.length;
        // Simple conversion: average percentage to GPA on a 10-point scale
        return (average / 100) * 10;
    }
}

public class ProblemB {
    public static void main(String[] args) {
        double[] marks = {85, 90, 78, 92, 88};
        UndergradStudent undergrad = new UndergradStudent("Rohan Mehta", 310, marks);

        System.out.println("Name: " + undergrad.name);
        System.out.println("Roll No: " + undergrad.rollNo);
        System.out.printf("GPA: %.2f%n", undergrad.calculateGPA());
    }
}
