
public class Count {
public static void main(String[] args) {
	int i=12332425,rev=0,count=0;
	while(i!=0)
	{
		rev=rev*10;
		rev=i%10;
		i=i/10;
		count++;
	}
	System.out.println(count);
}
}
