public class StringBuilderDemo {
		
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		sb.append("�߾�hta�п�");
		sb.append("���԰��� �ȳ�");
		sb.append("\n");
		sb.append("��������ǥ�������ӿ�ũ ����,");
		sb.append("����Ʈ���� �������α׷� ������ ����");
		sb.append("\n");
		sb.append("�����Ⱓ(��)");
		sb.append(120);

		String text = sb.toString();
		System.out.println(text);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("a") 
			.append("b")
			.append("c");
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder();
		sb2.append("�߾�hta�п�")
		.append("���԰��� �ȳ�")
		.append("\n")
		.append("��������ǥ�������ӿ�ũ ����,")
		.append("����Ʈ���� �������α׷� ������ ����")
		.append("\n")
		.append("�����Ⱓ(��)")
		.append(120);

		String text1 = sb.toString();
		System.out.println(text1);
	}
}