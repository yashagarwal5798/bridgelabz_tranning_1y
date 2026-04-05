package Assignment_14;

import java.util.ArrayList;
import java.util.List;

public class Question_3 {
    public void autoBoxing()
    {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);
        int sum=0;
        for(Integer num:l1){
            sum+=num;
        }
        System.out.println(sum);
    }

    static void main(String[] args) {
        Question_3 q=new Question_3();
        q.autoBoxing();
    }
}
