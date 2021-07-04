package practice1;

public class methodexprience {
	public static String numbering(int init, int limit)//*매개변수(parameter)
	{
		int i = init;
		String output = "";
		while (i<limit) {
			output += i;
			i++;
		}
		return output;//반환형으로 인해 코드는 부품으로의 가치상승
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,5);//*인자(argument)
		System.out.println(result);
	}
}
