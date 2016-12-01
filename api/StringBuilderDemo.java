public class StringBuilderDemo {
		
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		sb.append("중앙hta학원");
		sb.append("정규과정 안내");
		sb.append("\n");
		sb.append("전자정부표준프레임워크 과정,");
		sb.append("소프트웨어 응용프로그램 개발자 과정");
		sb.append("\n");
		sb.append("수강기간(일)");
		sb.append(120);

		String text = sb.toString();
		System.out.println(text);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("a") 
			.append("b")
			.append("c");
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder();
		sb2.append("중앙hta학원")
		.append("정규과정 안내")
		.append("\n")
		.append("전자정부표준프레임워크 과정,")
		.append("소프트웨어 응용프로그램 개발자 과정")
		.append("\n")
		.append("수강기간(일)")
		.append(120);

		String text1 = sb.toString();
		System.out.println(text1);
	}
}