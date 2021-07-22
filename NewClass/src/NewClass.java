import java.io.*;

public class NewClass {
    public NewClass(String name) {
        System.out.println("This is a new class named: " + name);
    }// the only constructor

    public static void main(String[] args) {
        NewClass a_new_object = new NewClass("hahaha");
    }

    String name;
    long numbers;

    void do1() {
    }

    double do2() {
        return 1;
    }
}
