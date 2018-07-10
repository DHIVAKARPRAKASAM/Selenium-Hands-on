
public class A3b2 {

	public static void main(String[] args) {
	String s1="a3b2";
	String s2="123456789";
	String s3="abcdefghijklmnopqrstuvwxyz";
	int temp=0;
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	char c[]=s3.toCharArray();
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			if(a[i]==b[j])
			{
				
			     temp=Integer.parseInt(String.valueOf(a[i]));
			    // System.out.println(temp);
			     for(int k=1;k<=temp;k++)
			     {
			  System.out.print(a[i-1]);
			     }
			}
		}
		
		
		
	}
	

	}

}
