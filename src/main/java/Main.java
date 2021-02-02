public class Main {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Щукин Владислав", "Инженер", "Vlad@mail.ru", "8-921-888-78-36", 60000, 36);
        persArray[1] = new Employee("Лосось Пётр", "Бухгалтер", "Petr@gmai.com", "8-999-666-20-36", 45000, 45);
        persArray[2] = new Employee("Карась Виктор", "Менеджер по персоналу", "KrVictor@gmail.com", "8-921-155-36-91", 30000, 39);
        persArray[3] = new Employee("Судак Александр", "Начальник смены", "SashkaSy@mail.ru", "8-921-777-78-31", 75000, 41);
        persArray[4] = new Employee("Окунева Елизавета", "Заместитель директора", "Zam_Boss@mail.ru", "8-921-957-36-66", 200000, 50);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() >= 40){
                persArray[i].print();
            }
        }


    }
}
