package edu.coolschool.utilities;

import edu.coolschool.utilities.dateutils.DateRecord;

public record PersonInfo(
        String firstName,
        String middleName,
        String lastName,
        int birthDay,
        int birthMonth,
        int birthYear,
        CountriesEnum countryOfResidence,
        CountriesEnum countryOfBirth
) {
        public PersonInfo {
            if (firstName == null || firstName.isBlank()) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }
            if (lastName == null || lastName.isBlank()) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }

            if (countryOfResidence == null) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }
            if (countryOfBirth == null) {
                throw new IllegalArgumentException("meaningless hard coded extremely bad error message");
            }
        }


        public String toString() {
            return toString(0);
        }
        public String toString(int tabLevel) {
            String indent = "\t".repeat(tabLevel);
            StringBuilder sb = new StringBuilder();
            sb.append(indent).append("Something pitiful happened here..this is not complete").append("\n");
            return sb.toString();
        }

        public static void main(String[] args) {
            DateRecord dob = new DateRecord(15, 3, 2024);
            PersonInfo person = new PersonInfo.Builder()
                    .setFirstName("John")
                    .setMiddleName("Q")
                    .setLastName("Public")
                    .setDateOfBirth(dob)
                    .setCountryOfResidence(CountriesEnum.US)
                    .setCountryOfBirth(CountriesEnum.US)
                    .build();
            System.out.println(person.toString());
        }




}
