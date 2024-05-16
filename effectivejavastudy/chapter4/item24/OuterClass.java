package effectivejavastudy.chapter4.item24;

public class OuterClass {

    int value = 20;

    // static nested class
    public class NonStaticInnerClass {
        int getOuterClassValue() {
            return OuterClass.this.getValue();
        }

        void printValue(int outerClassInstanceValue) {
            System.out.println(outerClassInstanceValue);
        }
    }

    // non-static nested class
    public static class StaticInnerClass {
//        int getOuterClassValue() {
//            return OuterClass.this.getValue(); // Compile Error
//        }
//        void printValue(int outerClassInstanceValue) {
//            System.out.println(outerClassInstanceValue);
//        }
    }

    public int getValue() {
        return value;
    }
}
