public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("ФИО сотрудника: " + fullName + ";\n" + "Должность: " + position + ";\n"
                + "Почта: " + email + ";\n" + "Телефон:  " + telephone + ";\n" + "Зарплата: "
                + salary + ";\n" + "Возраст: " + age + ";\n");
    }

}