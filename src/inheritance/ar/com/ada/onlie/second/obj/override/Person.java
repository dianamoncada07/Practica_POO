package src.inheritance.ar.com.ada.onlie.second.obj.override;

import java.util.Objects;

public class Person {
    private String name;
    private String lasName;

    public Person(){
    }

    public Person (String name){
        this.name = name;
    }

    public Person (String name, String lasName){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lasName='" + lasName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lasName, person.lasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lasName);
    }
}
