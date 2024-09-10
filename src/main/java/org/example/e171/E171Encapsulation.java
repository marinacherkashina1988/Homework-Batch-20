package org.example.e171;

public class E171Encapsulation {

    public static class Employee {
        private String empName;
        private int empAge;

        public Employee(String empName, int empAge) {
            this.empName = empName;
            this.empAge = empAge;
        }

        String getEmpName() {
            return empName;
        }

        int getEmpAge() {
            return empAge;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 30);
        System.out.println("Employee Name: "+e.getEmpName());
        System.out.println("Employee Age: "+e.getEmpAge());
    }
}



