package com.prachi.app.model;

public class Employee {
    int id;

    String name;

    double salary;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void salaryIncrement(Double percentage) {
        Double newSalary = salary + percentage * salary / 100;
        setSalary(newSalary);
    }
@Override
    public String toString(){
        return "Employee Name:"+name+" Id:"+id+" salary:"+salary;

}



}
