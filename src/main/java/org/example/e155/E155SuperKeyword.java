package org.example.e155;

public class E155SuperKeyword {

    public static class Company {
        public Company(){
            System.out.println("Company Established");
        }
    }

    public static class Department extends Company{
        public Department(){
            System.out.println("Department Created");
        }
    }

    public static class Employee extends Department{
        public Employee(){
            System.out.println("Employee Hired");
        }
    }

    public static void main(String[] args) {

        Employee obj = new Employee();
    }
}

