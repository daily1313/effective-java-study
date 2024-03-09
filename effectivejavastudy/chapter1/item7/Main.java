package effectivejavastudy.chapter1.item7;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        AdvancedStack advancedStack = new AdvancedStack();

        for(int i=0; i<10; i++) {
            stack.push(i);
        }

        for(int i=0; i<10; i++) {
            stack.pop();
        }

        for(int i=0; i<10; i++) {
            advancedStack.push(i);
        }

        for(int i=0; i<10; i++) {
            advancedStack.pop();
        }
    }
}
