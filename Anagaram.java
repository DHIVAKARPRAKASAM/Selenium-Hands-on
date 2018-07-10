
public class Anagaram {
public static void main(String[] args) {
	String s1="listen";
	String s2="sirent";
	String s3="";
	char c[]=s1.toCharArray();
	char d[]=s2.toCharArray();
	if(s1.length()==s2.length())
	{
	for(int i=0;i<=s1.length()-1;i++)
	{
		for(int j=0;j<=s2.length()-1;j++)
		{
			if(c[i]==d[j])
			{
				 s3+=c[i];
				 }
			
			
		}
		
		
	}
	if(s3.equals(s1))
	{
	System.out.println("anagaram");
	}
	else
	{
		System.out.println("Not an anagaram");
	}
}}
}
