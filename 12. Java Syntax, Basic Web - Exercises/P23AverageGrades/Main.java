package P23AverageGrades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNum = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < studentsNum; i++) {
            String[] studentsParams = scanner.nextLine().split(" ");

            String name = studentsParams[0];
            Double[] grades = Arrays.stream(studentsParams)
                    .skip(1)
                    .map(Double::parseDouble)
                    .toArray(Double[]::new);

            Student student = new Student(){{
               setName(name);
               setGrades(Arrays.asList(grades));
            }};

            students.add(student);
        }

        Student[] filteredStudents = students
                .stream()
                .filter(student -> student.getAverageGrade() >= 5.00)
                .sorted((a, b) -> {
                    int comparisonResult = a.getName().compareTo(b.getName());

                    if (comparisonResult == 0){
                        comparisonResult = Double.compare(b.getAverageGrade(), a.getAverageGrade());
                    }

                    return comparisonResult;
                })
                .toArray(Student[]::new);

        for (Student student : filteredStudents) {
            System.out.printf("%s -> %.2f%n", student.getName(), student.getAverageGrade());
        }
    }
}