import java.util.Scanner;

public class Demo {

    String name;
    int age;

    Demo(){
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        age=sc.nextInt();
    }
    public void m1(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.m1();
    }
}
