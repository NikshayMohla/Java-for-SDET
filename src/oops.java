public class oops {
    int eid;
    String ename;
    String job;
    int sal;

    void display() {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args) {
        oops o = new oops();
        o.eid = 1;
        o.ename = "Nikshay";
        o.job = "Quality Analyst";
        o.sal = 300000;


        System.out.println(o.eid);
        System.out.println(o.ename);
        System.out.println(o.job);
        System.out.println(o.sal);
    }

}