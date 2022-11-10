package shape_interfice;

public class Circle11 implements Square11  {

private String displayName ="Circle";
    private double r;
private static double PI=3.14;
    public Circle11(String displayName, double r) {
       this.displayName=displayName;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle zas area of - " +
                squareOF();
    }
    public double squareOF(){
        return (3.14*r*r);
    };
}
