
public class Palindrome {

	public static void main(String[] args) {
		int i=11,rev=0,temp=i;
		while(i!=0)
		{
			rev=rev*10;
			rev=rev+i%10;
			i=i/10;
		
		
		}
		/*System.out.println(temp);
		System.out.println(flag);*/
		if(temp==rev)
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
