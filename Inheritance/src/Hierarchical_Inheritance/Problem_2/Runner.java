package Hierarchical_Inheritance.Problem_2;

public class Runner {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Yash";
        t.age = 19;
        t.subject = "Java";

        Student s = new Student();
        s.name = "Rahul";
        s.age = 20;
        s.grade = "A";

        Staff st = new Staff();
        st.name = "Amit";
        st.age = 30;
        st.department = "Admin";

        t.printInfo();
        System.out.println();

        s.printInfo();
        System.out.println();

        st.printInfo();
    }
}
