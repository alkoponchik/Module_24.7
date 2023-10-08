package org.example;

public enum StudyProfile {
    MEDICINE ("Медицина"), HUMANITARIAN ("Гуманитарий"), ECONOMIST ("Экономист"), ENGINEER ("Инжинер");

    private String translation;

    StudyProfile(String translation) {
        this.translation = translation;
    }

    public String profileName () {
        return translation;
    }
}
