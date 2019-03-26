package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

public class Main {

    public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
        Person ivanov = null;
        Person smith = null;
        
        Passport ivanovPass = new Passport("Иван", "Иванов", "Иванович");
        Passport smithPass = new Passport("Jhon", "Smith", "", "Edvard");
        Passport myPass = new Passport("Nikita", "Antonov");
        
        
        Address ivanovAdd = new Address("Санкт-Петербург", "Московский пр.", 22, 51);
        Address smithAdd = new Address("New-York", "2nd street", 3290);
        Address myAdd = new Address();
        
        ivanov = new Person(ivanovPass, ivanovAdd);
        smith = new Person(smithPass, smithAdd);
        
        Person myPerson = new Person(myPass, myAdd);            //вызов конструктора только с именем и фамилией, без адреса
        Person nullPerson = new Person();                       //вызов конструкторов Person и Address при незаданных полях классов
        
        /* TODO (Проверка №1) Поля класса необходимо инициализировать сразу в
            конструкторе, переделать.
        
            Возникает ошибка при вводе только имени и фамилии.  ИСПРАВИТЬ!!!
            Проверить все варианты возврата на выполнение!
        */
        System.out.println(ivanov.getFullName());
        System.out.println(smith.getFullName());
        System.out.println(ivanov.getAddress());
        System.out.println(smith.getAddress());
        
        
        System.out.println(myPerson.getFullName());
        System.out.println(myPerson.getAddress());
        System.out.println(nullPerson.getFullName());
        System.out.println(nullPerson.getAddress());
        
        
    }
        
        

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
}
