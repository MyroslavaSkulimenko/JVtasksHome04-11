package shape_interfice;

public class Rectangle11 implements Square11  {
    private int a;
    private int b;
    private String displayName ="Rectangle";

    public Rectangle11(String displayName, int a, int b) {
       this.displayName=displayName;
        this.a = a;
        this.b = b;
    }


    @Override
    public String toString() {
        return "Rectangle zas area of -  " +
                squareOF();

    }

    public double squareOF(){
        return a*b;
    };
}


