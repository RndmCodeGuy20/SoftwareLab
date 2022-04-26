public class RevertFile2Func {

    public void sayHello() {
        System.out.println("Hello!!!");
    }

    public void sayBye() {
        System.out.println("Bye!!! (this function will be reverted!");
    }

    public static void main(String[] args) {
        RevertFile2Func rFunc = new RevertFile2Func();

        rFunc.sayHello();
        rFunc.sayBye();
    }
}
