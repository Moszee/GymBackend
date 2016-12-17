package org.szpax.brothers.model;

public class Coach {

    private static int counter = 0;

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    public Coach(String firstName, String lastName, Integer age) {
        counter = counter + 1;
        this.id = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
