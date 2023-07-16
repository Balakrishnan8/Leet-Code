public class FactorilaTrailingZero
{
public static void main(String[] args)
{
int n = 125;
int temp = n;
int count = 0;
while(temp>0)
{
temp /= 5;
count += temp;
}
System.out.println("Number of Zeros = "+count);
}
}