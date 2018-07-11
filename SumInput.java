
public class SumInput {
public static void main(String[] args) {
	int i=123,a=0,flag=0;
while(i!=0)
{
	a=a*10;
	a=i%10;
	i=i/10;
	flag+=a;
	
	
}
System.out.print(flag);



}

}
