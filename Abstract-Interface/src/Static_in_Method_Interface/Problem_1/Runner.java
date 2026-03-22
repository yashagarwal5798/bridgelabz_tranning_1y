package Static_in_Method_Interface.Problem_1;

public class Runner {
    public static void main(String[] args)
    {
        String password = "Abc12345";
        if (SecurityUtils.isStrongPassword(password))
        {
            System.out.println("Strong Password");
        } else
        {
            System.out.println("Weak Password");
        }
    }
}
