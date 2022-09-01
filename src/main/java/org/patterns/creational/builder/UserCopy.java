package org.patterns.creational.builder;

import java.time.LocalDate;

public class UserCopy {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    private void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public Address getAddress() {
        return address;
    }
    private void setAddress(Address address) {
        this.address = address;
    }

    public static UserCopyBuilder builder() {
        return new UserCopyBuilder();
    }


    public static class UserCopyBuilder {
        private String firstName;
        private String lastName;
        private LocalDate birthday;
        private Address address;

        public UserCopyBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserCopyBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserCopy build() {
            UserCopy userCopy = new UserCopy();
            userCopy.setFirstName(this.firstName);
            userCopy.setLastName(this.lastName);
            return userCopy;
        }
    }
}
