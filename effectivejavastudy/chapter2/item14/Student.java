package effectivejavastudy.chapter2.item14;

import java.util.Comparator;

public class Student implements Comparable<Student>{

    public static final Comparator<Student> COMPARATOR =
            Comparator.comparingDouble((Student student) -> student.score)
                    .thenComparing((Student student) -> student.name)
                    .thenComparingInt((Student student) -> student.id);

    private String name;
    private int id;
    private double score;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return COMPARATOR.compare(this, o);
    }
}
