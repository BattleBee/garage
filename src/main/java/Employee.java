/**
 * Работник. Поля - имя, фамилия, id, возраст, опыт работы
 */
public class Employee {
    private int id, age, experience;
    private String name, surname, specialization;

    public Employee(int id, String name, String surname, int age, String specialization) {
        this.id = id;

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void installDetail(Car car, Detail detail, Employee employee) {


    }

    public void removeDetail(Car car, Detail detail, Employee employee) {

    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
