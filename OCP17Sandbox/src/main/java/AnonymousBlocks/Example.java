package AnonymousBlocks;

public class Example {
    private String dato;
    static{
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    public Example(){
        System.out.println("constructor");
    }
}
