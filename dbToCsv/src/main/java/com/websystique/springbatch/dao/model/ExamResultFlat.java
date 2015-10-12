package com.websystique.springbatch.dao.model;

public class ExamResultFlat {

    private String studentName;
    private String dob;
    private double percentage;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "ExamResult [studentName=" + studentName + ", dob=" + dob + ", percentage=" + percentage + "]";
    }


}
