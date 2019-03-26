package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    private String fullName;        //полное имя
    private String address;         //адрес проживания
    
    private Passport man;           //ссылка на объект типа Паспорт
    private Address post;           //ссылка на объект типа Адрес
    
    
    /*
        Сделать инкапсуляцию всех полей класса. Добавить комментарии полям и методам.
    */
    public Person(){
        man = new Passport();
        post = new Address();
    }

    public Person(Passport man, Address post) {
        this.man = man;
        this.post = post;
    }
    
    /*
        TODO (Проверка №1) Вместо инициализации используй констркторы классов.
    */
    
    
    
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        fullName = "";
        if(man.getSurName()==null && man.getLastName()==null && man.getFatherName()==null){
            fullName = man.getName() + ", " + man.getPolice();
        }else if(man.getFatherName()==null && man.getLastName()==null || man.getFatherName()=="" && man.getLastName()==""){
            fullName = man.getName() + " " + man.getSurName();
        }
        else if (man.getFatherName()!=null && !man.getFatherName().equals("")) {
            fullName = man.getName() + " " + man.getSurName() + " " + man.getFatherName();
        }
        else if(man.getLastName()!=null && !man.getLastName().equals("")){
            fullName = man.getName() + " " + man.getLastName().substring(0, 1) + ". " + man.getSurName();
        }
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        address = "";
        if(post.getStreet()==null && post.getStreet()=="" && post.getHouse()==0 && post.getAppartment()==0){
            address = "Город: " + post.getCity();
        }else if(post.getAppartment()==0 && post.getHouse()==0){
            address = "Город: " + post.getCity() + ", улица: " + post.getStreet();
        }else if (post.getAppartment()==0) {
            address = "Город: " + post.getCity()+ ", улица: " + post.getStreet()+ ", номер дома: " + post.getHouse();
        }else address = "Город: " + post.getCity() + ", улица: " + post.getStreet() + ", номер дома: " + 
                post.getHouse() + ", номер квартиры: " + post.getAppartment();
        
        return address;
    }
}