public class TestFunc {
    public void sayHello() {
        System.out.println("Hello!!!");
    }

    public void sayBye() {
        System.out.println("Bye!!!");
    }

    public static void main(String[] args) {
        TestFunc tFunc = new TestFunc();

        tFunc.sayHello();
        tFunc.sayBye();
    }
}
