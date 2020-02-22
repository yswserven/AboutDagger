package com.custom.dagger.use.two;

/**
 * Created by: Ysw on 2020/2/22.
 */
public class Person {
    String name = "吴士胜";
    String age = "31";

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
