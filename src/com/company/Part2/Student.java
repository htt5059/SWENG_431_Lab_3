package com.company.Part2;

public class Student {
    private String name;
    private int id;
    public Student(int id, String name){
        this.id= id;
        this.name=name;
    }
    public String toString(){
        return "Name: "+this.name+", ID: "+this.id+" ";
    }
}