package org.example;

public class Person {
    private String name;
    private int age;
    private long cnp;
    private double salary;

    public Person(String name,int age,long cnp,double salary){
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getCnp() {
        return cnp;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
