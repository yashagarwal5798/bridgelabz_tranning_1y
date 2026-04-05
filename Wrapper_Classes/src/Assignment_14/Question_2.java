package Assignment_14;

public class Question_2 {
    public void wrapperToPrimitive()
    {
        Double n1=33.33;
        double n2=33.33;

        int n3=(int)n2 ;
        System.out.println("Double object "+n1);
        System.out.println("double Primitive "+n2);
        System.out.println("Integer Primitive "+n3);
    }

    static void main(String[] args) {
    Question_2 q2=new Question_2();
    q2.wrapperToPrimitive();
    }
}
