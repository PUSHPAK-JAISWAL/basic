public class NestedIfElse
{
    public static void main(String[]args)
    {
        int age = 15; 
        int a = 2;
        if(age == 18)
        {
            if( a==2)
            {
                System.out.println("print 1");
            }
            else
            {
                System.out.println("print 2");
            }
        }
        else
        {
            if(a==2)
            {
                System.out.println("print 3");
            }
            else
            {
                System.out.println("print 4");
            }
        }
    }
}