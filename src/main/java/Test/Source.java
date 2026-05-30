package Test;

public class Source {
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square();
        s1.length=10f;
        s2.length=20f;
        float a1=s1.area();
        float a2=s2.area();
        System.out.println("Area is: "+a1);
        System.out.println("Area is: "+a2);
    }
}
