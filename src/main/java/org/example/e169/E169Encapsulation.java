package org.example.e169;

public class E169Encapsulation {

    private static class Employee {

        private String empName;
        private int empAge;

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
            System.out.println("Employee Name: " + getEmpName());
        }

        public int getEmpAge() {
            return empAge;
        }

        public void setEmpAge(int empAge) {
            this.empAge = empAge;
            System.out.println("Employee Age: " + getEmpAge());
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpName("John");
        e.setEmpAge(30);
    }
}
