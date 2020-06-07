package com.example.registrationapp;

public class Member {

    private String Name;
    private String Redgno;
    private String Sem;
    private String Branch;
    private String Subject;

    public Member() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRedgno() {
        return Redgno;
    }

    public void setRedgno(String redgno) {
        Redgno = redgno;
    }

    public String getSem() {
        return Sem;
    }

    public void setSem(String sem) {
        Sem = sem;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
