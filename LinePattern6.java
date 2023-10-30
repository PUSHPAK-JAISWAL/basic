public class LinePattern6
{
    public static void main(String[]args)
    {
        int n=19;
        int i,j;
        int p=(n-1)/2;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i==0 || j==0 || j==n || i==n || i+j<=p || i==0 && j>=p|| j==n-1 && i<=p|| j-i>=p||i+j<=((n-1)+p))
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