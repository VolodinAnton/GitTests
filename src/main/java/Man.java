public class Man {
    private String name;
    private String surName;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("I'm a man");
    }

    @Override
    public String toString() {
        return "I'm a " + this.getClass().getName() +
                ". My name is " + name +
                ". I'm " + age + " years old.";
    }
}