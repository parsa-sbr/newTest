public class Person {

    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void intro() {
        System.out.println("i am " + name);
    }

}
