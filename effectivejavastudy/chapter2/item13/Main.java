package effectivejavastudy.chapter2.item13;

public class Main {

    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber(1, 1, 1);

        System.out.println(pn != pn.clone());
        System.out.println(pn.getClass() == pn.clone().getClass());
        System.out.println(pn.clone().equals(pn));
        System.out.println(pn.areaCode == pn.clone().areaCode
                && pn.prefix == pn.clone().prefix && pn.lineNum == pn.clone().lineNum);

        Stack s1 = new Stack();
        s1.push(1);

        Stack s2 = (Stack) s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}
