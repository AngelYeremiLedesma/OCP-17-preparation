package enums.first;

import java.util.Enumeration;

public enum Months { //Enums are automatically final
    //static{}//At this part it's not possible to add any kind of anonymous block
    JANUARY, FEBRUARY, MARCH, APRIL, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;;;;;;;
    ;

    //public Months(){} //In a enum, the constructor is automatically private, it can't be public nor protected

    Months(){ //If a non-empty constructor is declared, the compiler doesn´t create the default constructor and it becomes necessary to use that constructor when declaring all the values
        System.out.println("constructor");
        this.value = this.name().charAt(0) + this.name().substring(1).toLowerCase(); //Enums has a name() and values() default methods
    }
    protected String value;;;;; //In a final class it's possible to declare a protected member

    public String getValue() {
        return value;
    }

    static {
        System.out.println("Bye"); //Surprisingly the order here is instance, static, constructor
    }

    {
        System.out.println("Hola"); //It prints Hola as many times as values are
    }
    //public int name(){} //Remember that final doesn't allow to overwrite nor overload
    //public String name(){return null} //That was not possible beacuse the name() and values() methods are final in java.lang.enum
    //public Enumeration values(){return null;}
    //public int ordinal(){return 0;}
}
