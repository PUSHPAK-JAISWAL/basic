class LinePattern2
{
    public static void main(String[]args)
    {
        int n=11;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==i || i+j==n-1 || i==0 || j==0 || i==10 ||j==10)
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