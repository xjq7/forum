package org.stu;

public class UserVO {
    private String name;
    private Short age;

    public String getName() {
        return name;
    }

    public UserVO setName(String name) {
        this.name = name;
        return this;
    }

    public Short getAge() {
        return age;
    }

    public UserVO setAge(Short age) {
        this.age = age;
        return this;
    }
}
