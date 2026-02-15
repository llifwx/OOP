package task4;
import Practice2.Student;
import java.util.ArrayList;


public class GradeBook {
    private Course course;
    private ArrayList<GradeRecord> records;

    public GradeBook(Course course){
        this.course = course;
        this.records = new ArrayList<>();
    }

    public void addRecord(Student student, int grade) {
        records.add(new GradeRecord(student, grade));
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public void displayGradeReport() {

        double average = determineClassAverage();
        GradeRecord min = findMin();
        GradeRecord max = findMax();

        System.out.printf("Class average is %.2f\n", average);

        System.out.println("Lowest grade is " + min.getGrade() +
                " (" + min.getStudent().getName() +
                ", id: " + min.getStudent().getID() + ")");

        System.out.println("Highest grade is " + max.getGrade() +
                " (" + max.getStudent().getName() +
                ", id: " + max.getStudent().getID() + ")");

        System.out.println("\nGrades distribution:");
        outputBarChart();
    }

    private double determineClassAverage() {
        int sum = 0;
        for (GradeRecord r : records) {
            sum += r.getGrade();
        }
        return (double) sum / records.size();
    }

    private GradeRecord findMin() {
        GradeRecord min = records.get(0);
        for (GradeRecord r : records) {
            if (r.getGrade() < min.getGrade()) {
                min = r;
            }
        }
        return min;
    }

    private GradeRecord findMax() {
        GradeRecord max = records.get(0);
        for (GradeRecord r : records) {
            if (r.getGrade() > max.getGrade()) {
                max = r;
            }
        }
        return max;
    }

    private void outputBarChart() {

        int[] freq = new int[11];

        for (GradeRecord r : records) {
            int index = r.getGrade() / 10;
            if (index > 10) index = 10;
            freq[index]++;
        }

        for (int i = 0; i < freq.length; i++) {

            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public String toString() {
        return "GradeBook for course: " + course.getName();
    }
}
