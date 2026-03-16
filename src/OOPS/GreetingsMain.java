package OOPS;

public class GreetingsMain {

    public static void main(String[] args) {
        Greetings gr = new Greetings();

        gr.m1();

        int i = gr.m2();
        System.out.println(i);


        String name = gr.m3("Nikshay");
        System.out.println(name);

        char ch = 'A';
        gr.m4(ch);
    }

}