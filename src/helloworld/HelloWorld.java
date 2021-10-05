package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        //create an instance of the class and call the function.
        HelloWorld hello = new HelloWorld();
        hello.sayHello();

        /*
        could also do (this doesn't store the class instance):
        new HelloWorld().sayHello();
        */


    }
    public static void sayHello() {
        System.out.println("Hello World!");
    }
}
