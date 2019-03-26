package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
*/
public class Passport {
    
    private int passport;       //номер пасспорта
    private String name;        //имя
    private String surName;     //фамилия
    private String fatherName;  //отчетство
    private String lastName;    //второе имя
    private int birthDay;       //день рождения
    private int passDate;       //дата выдачи
    private String police;      //кем выдан
    
    public Passport(){
        
    }
    
    public Passport(String name, String surName, String fatherName){
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
    }
    
    public Passport(String name, String surName, String fatherName, String lastName){
        this(name, surName, fatherName);
        this.lastName = lastName;
    }
    
    /* TODO (Проверка №1) Большинство полей класса не используются, но они 
        все равно должны быть инициализированы в конструкторе.
        
        Создать конструктор с полным набором полей, и все остальные 
        конструкторы реализовать через него
    */
    
    public String setName(String name){
        this.name = name;
        return this.name;
    }
    
    public String setSurName(String surName){
        this.surName = surName;
        return this.surName;
    }
    
    public String setFatherName(String fatherName){
        this.fatherName = fatherName;
        return this.fatherName;
    }
    
    public String setLastName(String lastName){
        this.lastName = lastName;
        return this.lastName;
    }
    
    /* TODO (Проверка №1) Сделать сетеры стандартного вида
     */
    
    public String getName(){
        return name;
    }
    
    public String getSurName(){
        return surName;
    }
    
    public String getFatherName(){
        
        return fatherName;
    }
    
    public String getLastName(){
        
        return lastName.substring(0, 1);
    }
    
    /* TODO (Проверка №1) гетер getLastName должен возвращать второе имя целиком
        а преобразования второго имени делается в методах, где это необходимо.
    
        Сделать геетеры стандартного вида
        Сделать гетеры для всех полей класса
    */
    

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
