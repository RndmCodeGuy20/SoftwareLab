public class TestFunc {
    public void sayHello() {
        System.out.println("Hello!!!");
    }

    public void sayBye() {
        System.out.println("Bye!!!");
    }

    public void sayHey() {
        System.out.println("Hey!!!");
    }

    public static void main(String[] args) {
        TestFunc tFunc = new TestFunc();

        tFunc.sayHello();
        tFunc.sayBye();
        tFunc.sayHey();
    }
}
