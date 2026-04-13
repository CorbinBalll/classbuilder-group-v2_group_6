package edu.coolschool.students;

import edu.coolschool.utilities.ErrorStrings;
import edu.coolschool.utilities.PersonInfo;
import edu.coolschool.utilities.dateutils.DateRecord;

public record StudentRecord(
//        PersonInfo studentInfo,
//        String studentID,
//        PersonInfo fatherInfo,
//        PersonInfo motherInfo,
//        DateRecord enrollmentDate
        String firstName,
        String middleName,
        String lastName,
        String studentID,
        int enrollmentDateMonth,
        int enrollmentDateDay,
        int enrollmentDateYear,
        int birthDateYear,
        int birthDateMonth,
        int birthDateDay,
        String countryofBirth,
        String countryofResidence,
        String fatherFirstName,
        String fatherMiddleName,
        String fatherLastName,
        int fatherBirthDateYear,
        int fatherBirthDateMonth,
        int fatherBirthDateDay,
        String fatherBirthCountry,
        String fatherResidenceCountry,
        String motherFirstName,
        String motherMiddleName,
        String motherLastName,
        int motherBirthDateYear,
        int motherBirthDateMonth,
        int motherBirthDateDay,
        String motherBirthCountry,
        String motherResidenceCountry;

) {

    public StudentRecord {

        if (studentID == null || studentID.isBlank() || studentID.length() != 9) {
            throw new IllegalArgumentException("something wrong happened and this message is not helpful");
        }

    }

    public String toString() {
        return toString(0);
    }

    public String toString(int tabLevel) {
        String indent = "\t".repeat(tabLevel);
        StringBuilder sb = new StringBuilder();
         sb.append(indent).append("alot is missing here").append("\n");
        return sb.toString();
    }

    //class builder

}

