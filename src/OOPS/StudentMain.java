package OOPS;

public class StudentMain {

    public static void main(String[] args) {
        Student stu1 = new Student(1, "Nikshay", 'A');
//        First
//        stu1.sname = "Nikshay";
//        stu1.sid = 1;
//        stu1.grade = 'A';
//        Second using getters and setters
//        stu1.setStudentData(1, "Nikshay", 'A');
//        stu1.getStudentData();
//        Third using constructor
        stu1.printData();


        Student stu2 = new Student(2, "Abhishek", 'B');
//        First
//        stu2.sname = "Abhishek";
//        stu2.sid = 2;
//        stu2.grade = 'B';
//        Second using getters and setters
//        stu1.setStudentData(2, "Abhishek", 'B');
//        stu2.getStudentData();
//        Third using constructor
        stu2.printData();
    }

}

//whenever a new object is created it reserves a memory which contains the variables and methods