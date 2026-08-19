public class On2
{
    public static void printTerm(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.println(i+"  "+j);
            }
        }
    }
    public static void main(String[] args) {
printTerm(10);
    }
}
