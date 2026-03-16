package OOPS;

public class Student {
    int sid;
    String sname;
    char grade;

//    void printData() {
//        System.out.println(sid + "\nStudent Name:" + sname + "\nGrade:" + grade);
//    }

    //Setter
    void setStudentData(int id, String name, char grade1) {
        sid = id;
        sname = name;
        grade = grade1;
    }

    //Getter

    void getStudentData() {
        System.out.println(sid + "\nStudent Name:" + sname + "\nGrade:" + grade);
    }
}