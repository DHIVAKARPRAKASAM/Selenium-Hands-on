
public class Decimal {
public static void main(String[] args) {
	int i=156;
	int count=0;
	String s1="";
	while(i!=0)
	{
		if((i%2)!=1)
		{
			count++;
		}
		s1=s1+""+(i%2);
		i=i/2;
		
	
	}
	System.out.println(s1);
	StringBuffer sb=new StringBuffer();
	sb.append(s1);
	System.out.println(sb.reverse());
	
}
}
