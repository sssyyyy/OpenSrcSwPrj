import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.print("출력하고 싶은 단을 입력하시오: ");
		Scanner scn = new Scanner(System.in);
		int num=scn.nextInt();
		
		for(int i=1;i<10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
