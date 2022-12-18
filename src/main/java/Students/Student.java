//1. Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создать массив из десяти элементов такого типа.
// Добавить возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 4 или 5.

package Students;

import java.util.Arrays;

public class Student {
    public String lastName;
    public String initials;
    public int groupNumber;
    public double[] grade = new double[5];

    public Student(String lastName, String initials, int groupNumber, double[] grade) {
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [lastName =" + lastName
                + " , initials =" + initials
                + " , groupNumber =" + groupNumber
                + " , grade = " + Arrays.toString(grade) + "]";
    }
}
