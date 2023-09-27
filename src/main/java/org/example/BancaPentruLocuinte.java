package org.example;

public class BancaPentruLocuinte implements  UnitateBancara{
    @Override
    public double credit(Person person) {
        return person.getSalary() * 100;
    }

    @Override
    public double dobanda(Person person) {
        return person.getSalary() * 0.05;
    }
}
