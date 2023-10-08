package org.example;

import java.time.Period;

public class Student {

    public String fullName;
    public String universityId;
    int currentCourseNumber;
    float avgExamScore;

    public String studentProfile;

    public Student ()
    {
        this.fullName = null;
        this.universityId = null;
        this.studentProfile = null;
        this.currentCourseNumber=0;
        this.avgExamScore = 0;

    }

    //def constructor
    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore)
        {
            Student student = new Student.StudentBuilderImpl()
                    .setFullName(fullName)
                    .setUniversityId(universityId)
                    .setCurrentCourseNumber(currentCourseNumber)
                    .setAvgExamScore(avgExamScore)
                    .setStudentProfile(StudyProfile.valueOf(studentProfile))
                    .Build();
        }


    interface StudentBuilder {
        StudentBuilder setFullName (String fullName);
        StudentBuilder setUniversityId (String setUniversityId);
        StudentBuilder setCurrentCourseNumber (int currentCourseNumber);
        StudentBuilder setAvgExamScore (float avgExamScore);
        StudentBuilder setStudentProfile (StudyProfile studentProfile);

        Student Build();

    }

    static class StudentBuilderImpl implements StudentBuilder {

        Student student = new Student();

        @Override
        public StudentBuilder setFullName(String fullName) {
            student.fullName = fullName;
            return this;
        }

        @Override
        public StudentBuilder setUniversityId(String universityId) {
            student.universityId = universityId;
            return this;
        }

        @Override
        public StudentBuilder setCurrentCourseNumber(int currentCourseNumber) {
            student.currentCourseNumber = currentCourseNumber;
            return this;
        }

        @Override
        public StudentBuilder setAvgExamScore(float avgExamScore) {
            student.avgExamScore = avgExamScore;
            return this;
        }

        @Override
        public StudentBuilder setStudentProfile(StudyProfile studentProfile) {
            student.studentProfile = String.valueOf(studentProfile.profileName());
            return this;
        }

        @Override
        public Student Build() {
            return student;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }


       @Override
   public String toString ()
    {
        return fullName + "," + universityId + "," + currentCourseNumber + "," + avgExamScore + "," + String.valueOf(studentProfile);
    }
}

