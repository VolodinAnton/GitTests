public class Woman {
    private String name;
    private int age;

    public Woman(String name, int age) {
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
        System.out.println("I'm a woman");
    }
    @Override
    public String toString() {
        return "My name is " + name + ". I'm " + age + " years old.";
    }
}
