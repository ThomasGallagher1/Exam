package ie.atu;

import java.util.Scanner;

public class Employee {
    public String name;
    public String id;

    public Employee() {
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReportdetails() {
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's id: " + id);
        return null;
    }
}
