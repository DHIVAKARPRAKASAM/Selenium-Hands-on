
public class StringPalindrome {
public static void main(String[] args) {
	String s1="moam";
	char c[]=s1.toCharArray();
	String s2="";
	for(int i=c.length-1;i>=0;i--)
	{
		s2+=c[i];
		
	}
	if(s1.equals(s2))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("not");
	}
}
}
