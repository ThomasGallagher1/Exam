package ie.atu;

import java.util.Scanner;

public class Employee {
    private string name;
    private string id;

    public Employee(){
    }

    public Employee(string name, string id)
    {
        this.name = name;
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }
}
