package org.example;

public class University {

    public String Id, fullName, shortName;
    public int yearOfFoundation;
    public StudyProfile mainProfile;

    public University ()
    {
        this.fullName = null;
        this.shortName = null;
        this.Id = null;
        this.yearOfFoundation = 0;
    }

    public University(String fullName, String Id, String shortName, int yearOfFoundation )
    {
        University university = new University.UniversityBuilderImpl()
                .setFullName(fullName)
                .setId(Id)
                .setShortName(shortName)
                .setYearOfFoundation(yearOfFoundation)
                .Build();

    }

    interface UniversityBuilder {
        University.UniversityBuilder setFullName(String fullName);

        University.UniversityBuilder setId(String Id);

        University.UniversityBuilder setShortName(String shortName);

        University.UniversityBuilder setYearOfFoundation(int yearOfFoundation);

        University Build();

    }


        static class UniversityBuilderImpl implements University.UniversityBuilder {

            University university = new University();

            @Override
            public UniversityBuilder setFullName(String fullName) {
                university.fullName = fullName;
                return this;
            }

            @Override
            public UniversityBuilder setId(String Id) {
                university.Id = Id;
                return this;
            }

            @Override
            public UniversityBuilder setShortName(String shortName) {
                university.shortName = shortName;
                return this;
            }

            @Override
            public UniversityBuilder setYearOfFoundation(int yearOfFoundation) {
                university.yearOfFoundation = yearOfFoundation;
                return this;
            }

            @Override
            public University Build() {
                return university;
            }
        }




    @Override
    public String toString()
    {
        return fullName + "," + shortName + "," + Id + "," + yearOfFoundation;
    }

}
