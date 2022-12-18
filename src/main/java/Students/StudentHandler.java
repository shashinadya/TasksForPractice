package Students;

import java.util.Arrays;

public class StudentHandler {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Ivanov", "I. P.", 6, new double[]{3, 4, 5, 4, 3});
        students[1] = new Student("Petrov", "0. M.", 5, new double[]{4, 4, 4, 4, 3});
        students[2] = new Student("Smirnov", "I. B.", 4, new double[]{5, 4, 5, 5, 5});
        students[3] = new Student("Pogorelov", "R. E.", 6, new double[]{3, 4, 3, 3, 3});
        students[4] = new Student("Karev", "I. T.", 2, new double[]{3, 5, 5, 4, 5});
        students[5] = new Student("Ponkin", "U. P.", 3, new double[]{4, 4, 5, 4, 4});
        students[6] = new Student("Vasilev", "C. Y.", 5, new double[]{3, 4, 4, 4, 3});
        students[7] = new Student("Ivashin", "N. B.", 1, new double[]{5, 4, 5, 5, 3});
        students[8] = new Student("Orlov", "W. V.", 4, new double[]{3, 4, 3, 3, 3});
        students[9] = new Student("Morev", "I. K.", 6, new double[]{3, 4, 4, 4, 4});

        printStudentsWithGoodGrades(students);


    }

    public static void printStudentsWithGoodGrades(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            double[] grade = students[i].grade;
            boolean print = true;
            for (int j = 0; j < grade.length; j++) {
                if (grade[j] < 4) {
                    print = false;
                    break;
                }
            }
            if (print) {
                System.out.println(students[i].lastName + ", " + students[i].groupNumber);
            }
        }
    }


}

