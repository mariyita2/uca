package com.example.alberto.guiaextra.Modelos;

/**
 * Created by marioperezt on 10/11/17.
 */

public class Student {
    private String mName;
    private String mSubject;
    private int mGrade;


    public Student(String name, String subject, int grade){
        mName = name;
        mSubject = subject;
        mGrade = grade;
    }
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSubject() {
        return mSubject;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

}
