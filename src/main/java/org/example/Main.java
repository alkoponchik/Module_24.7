package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student student = new Student.StudentBuilderImpl().setFullName("Шилов А.В.").setUniversityId("111").setCurrentCourseNumber(2).setAvgExamScore(5).setStudentProfile(StudyProfile.valueOf("ECONOMIST")).Build();
        University university = new University.UniversityBuilderImpl().setFullName("Московский Государственный университет").setShortName("МГУ").setId("МГУ").setId("112").setYearOfFoundation(1755).Build();

        System.out.println(student);
        System.out.println(university);
    }
}
