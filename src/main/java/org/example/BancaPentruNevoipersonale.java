package org.example;

public class BancaPentruNevoipersonale implements UnitateBancara{
    @Override
    public double credit(Person person) {
        return person.getSalary() * 10;
    }

    @Override
    public double dobanda(Person person) {
        return person.getSalary() * 0.08;
    }
}
