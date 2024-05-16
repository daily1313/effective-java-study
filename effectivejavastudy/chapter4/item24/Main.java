package effectivejavastudy.chapter4.item24;


import effectivejavastudy.chapter4.item24.OuterClass.StaticInnerClass;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticInnerClass innerClass = outerClass.new NonStaticInnerClass();
        innerClass.printValue(innerClass.getOuterClassValue());

        OuterClass.NonStaticInnerClass s1 = new OuterClass().new NonStaticInnerClass();
        OuterClass.NonStaticInnerClass s2 = new OuterClass().new NonStaticInnerClass();

        OuterClass.StaticInnerClass s3 = new OuterClass.StaticInnerClass();
        OuterClass.StaticInnerClass s4 = new OuterClass.StaticInnerClass();

        System.out.println(s1 != s2);
        System.out.println(s3 != s4);
    }
}
