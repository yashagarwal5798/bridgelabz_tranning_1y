package Assignment_14;

import java.util.Scanner;

public class Question_1 {
    public void primitiveToWrapper()
    {
        Scanner sy=new Scanner(System.in);
        int n1=sy.nextInt();
        Integer n2=n1;
        System.out.println("Primitive "+n1);
        System.out.println("Wrapper "+n2);

    }

    static void main(String[] args) {
        Question_1 q1=new Question_1();
        q1.primitiveToWrapper();
    }
}


