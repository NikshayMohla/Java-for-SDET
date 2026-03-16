package OOPS;

public class StudentMain {

    public static void main(String[] args) {
        Student stu1 = new Student();
//        stu1.sname = "Nikshay";
//        stu1.sid = 1;
//        stu1.grade = 'A';
        stu1.setStudentData(1,"Nikshay",'A');
        stu1.getStudentData();

        Student stu2 = new Student();
//        stu2.sname = "Abhishek";
//        stu2.sid = 2;
//        stu2.grade = 'B';
        stu1.setStudentData(2,"Abhishek",'B');
        stu2.getStudentData();
    }

}

//whenever a new object is created it reserves a memory which contains the variables and methods