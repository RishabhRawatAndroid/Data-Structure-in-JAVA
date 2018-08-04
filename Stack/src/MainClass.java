public class MainClass {
    public static void main(String[] args) {
        Stack<String> stringStack=new Stack<>();
        stringStack.push("Hello");
        stringStack.push("Rishabh");
        stringStack.iterate();
        System.out.println();
        stringStack.pop();
        stringStack.push("Google");
        stringStack.push("Microsoft");
        stringStack.iterate();
    }
}
