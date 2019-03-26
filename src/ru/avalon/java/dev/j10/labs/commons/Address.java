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
package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    private String city;        //город
    private String street;      //улица
    private int house;          //дом
    private int appartment;     //квартира
    
    /* TODO (Проверка №1) Мало полей класса Address, при поиске необходимого
        параметра в адресе, ты не сможешь его найти,  например, если ты запишешь
        все строчкой и будешь искать номер дома, у тебя найдется несколько чисел,
        а какое из них номер дома, ты не будешь знать.
    
        Добавить поля - дом, улица, квартира, город
        Добавить коментарии к полям и методам класса
     */
    
    //конструктор для неизвестного адреса (без параметров)
    public Address(){                           
        this.city = "Неизвестный город";
        this.street = "Неизвестная улица";
        this.house = 0;
        this.appartment = 0;
    }
    
    //конструктор только при заданном городе
    public Address(String city) {               
        this.city = city;
    }
    
    //конструктор при заданных городе и улице
    public Address(String city, String street) {        
        this.city = city;
        this.street = street;
    }
    
    //конструктор при заданных городе, улице и номере дома
    public Address(String city, String street, int house) {     
        this(city, street);
        this.house = house;
    }
    
    //конструктор, инициализирующих все поля класса
    public Address(String city, String street, int house, int appartment) {
        this(city, street, house);
        this.appartment = appartment;
    }
    
    
    
    
     
     /* TODO (Проверка №1) setAddress - Бессмысленное соединение гетера и сетера
        Приходит переменная, меняет значение и сразу же возращается назад.
        Для возврата у тебя есть метод getAddress.
        Сделать сетер стандартного вида
     */
    
    
    //получить названия города
    public String getCity() {
        return city;
    }
    
    //получить название улицы
    public String getStreet() {
        return street;
    }
    
    //получить номер дома
    public int getHouse() {
        return house;
    }
    
    //получить номер квартиры
    public int getAppartment() {
        return appartment;
    }
    
}
