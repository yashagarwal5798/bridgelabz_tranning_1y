public class Circle {
    private double r;
    public Circle(double r)
    {
        this.r = r;
    }
    public double calculateArea()
    {
        return Math.PI * r*r;
    }
    public double calculateCircumfeence()
    {
        return 2* Math.PI * r;
    }
    public void result(){
        System.out.println(+r);
        System.out.println(calculateArea());
        System.out.println(calculateCircumfeence());
    }

}
