public class Parrot {
    private String name;
    private int age;
    private String kingdom;

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

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public Parrot(String name, int age, String kingdom) {
        this.name = name;
        this.age = age;
        this.kingdom = kingdom;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kingdom='" + kingdom + '\'' +
                '}';
    }
}
