package org.example.e142;

public class E142Constructor {
    public static void main(String[] args) {

        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        obj1.display();
        obj2.display();
    }
}

class SyntaxTechnologies {

    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public SyntaxTechnologies() {
        schoolName = null;
        batch = 0;
        year = 0;
        lastDayOfClass = null;

    }

    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    public void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}