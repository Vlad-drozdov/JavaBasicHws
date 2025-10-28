package hw.hw11;

public class Person {

    private String name;
    private byte age;
    private String profession;

    public Person(String name,byte age,String profession){
        this.name = name;
        this.age = age;
        this. profession = profession;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }

    public String getName() { return name; }

    public byte getAge() { return age; }

    public String getProfession() { return profession; }



    public void setProfession(String profession) { this.profession = profession; }
}
