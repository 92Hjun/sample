public class MemberApp {

	public static void main(String[] args) {
		
		// ȸ�� ������ ������� Member ��ü�� �����ϰ�
		Member m = new Member();

		// Setter�� ����� �̸�,���̵�,���,���� ���� �����͸� ��ü�� �����ϱ�
		m.setName("ȫ�浿");
		m.setId("Reader");
		m.setPassword("1234");
		m.setAge(29);

		// ������ Member��ü�� ����� ���� getter�Լ��� ����ؼ� ȭ�鿡 ����ϱ�.
		System.out.printf("��    ��: %s\n�� �� ��: %s\n��й�ȣ: %s\n��    ��: %d\n",
							m.getName(), m.getId(), m.getPassword(), m.getAge());
	}
}