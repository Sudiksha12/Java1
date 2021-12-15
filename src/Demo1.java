import java.util.Scanner;

public class Demo1 {

    String name;
    int age;

    Demo1(){
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        age=sc.nextInt();
    }
    public void m2(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Demo1 obj=new Demo1();
        obj.m2();
    }
}

