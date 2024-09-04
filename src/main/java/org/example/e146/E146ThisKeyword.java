package org.example.e146;

public class E146ThisKeyword {

    public static class Employee {
        private String name;
        private String lastName;
        private int employeeId;
        private String startDate;
        private int salary;

        public Employee (){
            name = null;
            lastName= null;
            employeeId=0;
            startDate = null;
            salary = 0;
        }

        public Employee (String name, String lastName, int employeeId, String startDate, int salary){
        this.name = name;
        this.lastName= lastName;
        this.employeeId=employeeId;
        this.startDate = startDate;
        this.salary = salary;
        }

        public String printDetails(){
            String s = name+" "+ lastName+" "+employeeId+" " +startDate+" " +salary;
            return s;
        }
    }

    public static void main(String[] args) {

        Employee obj1 = new Employee();
        Employee obj2 = new Employee("Joe", "Smith", 12345, "01/01/1970",35000);
        System.out.println(obj1.printDetails()+ System.lineSeparator()+obj2.printDetails());

    }
}
