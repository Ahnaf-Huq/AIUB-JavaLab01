import java.util.Scanner;
public class Mmain{
	public static void main(String args[]){
		
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System. in);
		String str = sc.nextLine();
		int length = str.length();
		
		System.out.println("Reverse of the string:");
		for(int i = length-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
		}
}



