public class Student {
	int no; // �й�
	String name; 
	int kor;
	int eng;
	int math;
	
	// �⺻ ������
	public Student(){
		no = 0;
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	
	
	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������

	public Student(int n, String na, int k, int e, int m){
		no = n;
		name = na;
		kor = k;
		eng = e;
		math = m;
	}

	// ������ ��ȯ�ϴ� ���
	public int total() {
		return kor + eng + math;
	}

	// ����� ��ȯ�ϴ� ���
	public double avg() {
		return total()/3.0;
	}

	// �л� ������ ����ϴ� ���
	public void info() {
		System.out.println("---------�л� ����---------");
		System.out.println("��     �� : " + no);
		System.out.println("�л� �̸� : " + name);
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + math);
		System.out.println("��     �� : " + total());
		System.out.println("��     �� : " + avg());
	}

}