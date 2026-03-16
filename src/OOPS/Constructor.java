package OOPS;

public class Constructor {
//    two types of constructor
//    1)Default constructor: no parameters
//    2)Parameterised constructor: Takes parameter
    int x, y;

    //    Default constructor - only assignment
    Constructor() {
        x = 100;
        y = 200;
    }

    //    parameterized constructor
    Constructor(int a, int b) {
        x = a;
        y = b;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();//default constructor will be called if we add parameters then parameterized

    }

}