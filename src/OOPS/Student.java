package OOPS;

public class Student {
    int sid;
    String sname;
    char grade;

    void printData() {
        System.out.println(sid + "\nStudent Name:" + sname + "\nGrade:" + grade);
    }

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


//    constructor has no return value because no logic
//    Automatically invokes when object is created
//    can write multiple constructors but need to change parameters
//    Only for assignment values no operations initializing data

    Student(int id, String name, char grade1){
        sid=id;
        sname=name;
        grade=grade1;
    }

//    difference bw constructors and methods
//    method can be named anything constructors name should be the same as the class name
//    Constructor will never return any values
//    No Need to specify void in constructors
//    Constructor automatically invoked during object creation
//    Used for initializing the values of the variables
//    methods used to specifying logic
//    method can take parameters/arguments
//    method may or maynot return a value


//

}