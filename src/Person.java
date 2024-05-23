public class Person {
    private String name;
    private Integer age;
    private String married;

    public Person(String name, Integer age, String married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String isMarried() {
        return married;
    }
}
