package hw.hw12;

public class Employee {
    private String name;
    private String profession;
    private String email;
    private String tel;
    private byte age;

    public Employee(String name, String profession, String email, String tel, byte age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }
}
