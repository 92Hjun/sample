import java.util.Scanner;

public class  Quiz4 {
	public static void main(String[] args) { 
		// ������ ���� ���ڸ��� �Է¹޾� ���ڸ� ���ڷ� ����Ͻÿ�.
		// ��) 23 = �̽ʻ�.

		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է��Ͻÿ� : ");
		int number = sc.nextInt();
		int number1 = number/10;
		int number2 = (number - number1*10);

		String hangul = "";
		
		if(number1 == 0) {
		} else if(number1 == 1) {
			hangul = "��";
		} else if(number1 == 2) {
			hangul = "�̽�";
		} else if(number1 == 3) {
			hangul = "���";
		} else if(number1 == 4) {
			hangul = "���";
		} else if(number1 == 5) {
			hangul = "����";
		} else if(number1 == 6) {
			hangul = "����";
		} else if(number1 == 7) {
			hangul = "ĥ��";
		} else if(number1 == 8) {
			hangul = "�Ƚ�";
		} else if(number1 == 9) {
			hangul = "����";
		}

		if(number2 == 0) {
		} else if(number2 == 1) {
			hangul += "��";
		} else if(number2 == 2) {
			hangul += "��";
		} else if(number2 == 3) {
			hangul += "��";
		} else if(number2 == 4) {
			hangul += "��";
		} else if(number2 == 5) {
			hangul += "��";
		} else if(number2 == 6) {
			hangul += "��";
		} else if(number2 == 7) {
			hangul += "ĥ";
		} else if(number2 == 8) {
			hangul += "��";
		} else if(number2 == 9) {
			hangul += "��";
		}

		System.out.println(hangul);
	}	
}