package org.example.e161;

public class E161MethodOverriding {

    public static class Employee {
        public void work() {
            System.out.println("I am an Employee working");
        }

        protected void takeBreak() {
            System.out.println("I am an Employee taking a break");
        }

        void attendMeeting() {
            System.out.println("I am an Employee attending a meeting");
        }

        private void submitReport() {
            System.out.println("I am an Employee submitting a report");
        }

        public void hello() {
            System.out.println("method in Employee class");
        }
    }

    public static class Manager extends Employee {
        public void work() {
            System.out.println("I am a Manager working");
        }

        protected void takeBreak() {
            System.out.println("I am a Manager taking a break");
        }

        void attendMeeting() {
            System.out.println("I am a Manager attending a meeting");
        }

        public void hello() {
            System.out.println("method in Manager class");
        }
    }

    public static class Developer extends Employee {
        public void work() {
            System.out.println("I am a Developer working");
        }

        protected void takeBreak() {
            System.out.println("I am a Developer taking a break");
        }

        void attendMeeting() {
            System.out.println("I am a Developer attending a meeting");
        }

        public void hello() {
            System.out.println("method in Developer class");
        }
    }

    public static class Intern extends Employee {
        public void work() {
            System.out.println("I am an Intern working");
        }

        protected void takeBreak() {
            System.out.println("I am an Intern taking a break");
        }

        void attendMeeting() {
            System.out.println("I am an Intern attending a meeting");
        }

        public void hello() {
            System.out.println("method in Intern class");
        }
    }

    public static void main(String[] args) {

        Manager m = new Manager();
        Developer d = new Developer();
        Intern in = new Intern();

        Employee[] array = new Employee[3];
        array[0] = m;
        array[1] = d;
        array[2] = in;

        for (Employee e : array) {
            e.hello();
        }

        d.work();
        d.takeBreak();
        d.attendMeeting();
    }
}



