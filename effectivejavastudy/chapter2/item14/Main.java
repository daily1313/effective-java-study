package effectivejavastudy.chapter2.item14;

import static effectivejavastudy.chapter2.item14.Student.COMPARATOR;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("c",1, 70));
        students.add(new Student("b",2, 50));
        students.add(new Student("a", 3, 20));

        for(Student student: students) {
            System.out.println(student);
        }

        students.sort(COMPARATOR);

        for(Student student: students) {
            System.out.println(student);
        }
    }
}
