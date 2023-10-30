class LinePattern3
{
    public static void main(String[]args)
    {
        int n=19;
        int i,j;
        int p=(n-1)/2;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==i || i+j==n-1 || i==0 || j==0 || i==18 ||j==18 || i+j==p-1 )
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