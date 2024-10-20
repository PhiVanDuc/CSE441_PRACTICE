package com.example.practice_03.data.model;

public class Student {
    static class Fullname {
        private String first;
        private String middle;
        private String last;

        public Fullname(String first, String last, String middle) {
            this.first = first;
            this.last = last;
            this.middle = middle;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getMiddle() {
            return middle;
        }

        public void setMiddle(String middle) {
            this.middle = middle;
        }
    }

    private String id;
    private Fullname fullname;
    private String gender;
    private String birthOfDate;
    private String email;
    private String address;
    private String major;
    private int gpa;
    private int year;

    public Student(String address, String birthOfDate, String email, Fullname fullname, String gender, int gpa, String id, String major, int year) {
        this.address = address;
        this.birthOfDate = birthOfDate;
        this.email = email;
        this.fullname = fullname;
        this.gender = gender;
        this.gpa = gpa;
        this.id = id;
        this.major = major;
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fullname getFullname() {
        return fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
