class LinePattern
{
    public static void main(String[]args)
    {
        int n=10;
        int i,j;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(j==i)
                {
                 System.out.print("*");
                }
                else
                {
                     System.out.print(" ");
                }
            }
             System.out.println(" ");
        }
    }
}