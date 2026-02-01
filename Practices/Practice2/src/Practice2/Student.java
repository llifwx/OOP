package Practice2;

import java.util.Scanner;

public class Student{

    private String studentName;
    private String studentID;
    private int studentYoS;

    public Student(String name, String id){
        this.studentName = name;
        this.studentID = id;
        this.studentYoS = 1;
    }

    public String getName(){
        return studentName;
    }

    public String getID(){
        return studentID;
    }

    public int getYOS(){
        return studentYoS;
    }

    public void YOSincrease(){
        studentYoS += 1;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String id = scan.nextLine();

        Student student = new Student(name, id);
        student.YOSincrease();

        System.out.println(student.getName());
        System.out.println(student.getID());
        System.out.println(student.getYOS());
    }
}







