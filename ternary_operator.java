public class ternary_operator
{
    public static void main(String[]args)
    {
        int a=17;
        ++a;
        int b= (a==18)?1:2;
        if(b==1)
        {
            System.out.println("a == 18");
        }
        else
        {
            System.out.println("a != 18");
        }
    }
}