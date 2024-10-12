package enums.first;

public class Main {
    public static void main(String[] args) {
        Months.JANUARY.name();//This is a statement because it invokes a method
        //Months.JANUARY; //Unlike the line above, this is not a statement because it doesn't invoke a method or assigns something
        System.out.println(Months.JANUARY.name());
        System.out.println(Months.JANUARY.getValue());
        //Seasons season = new Seasons(); //Enum types can not be instantiated
        Seasons s1 = Seasons.SPRING;
        String string = "SPRING";
        Seasons s2 = Seasons.valueOf(string); //This method is case sensitive

        System.out.println("Equality with valueOf(): " + (s1 == s2) ); // True,

    }
}
