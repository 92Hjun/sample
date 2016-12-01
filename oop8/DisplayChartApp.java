public class DisplayChartApp {
	public static void main(String[] args) {
		
		// Chart 구현 객체 만들기
		Chart c = new XLSChart();
		// Chart류 객체를 전달해서 Display객체 만들기
		Display chartDisplay = new Display(c);
		// 그래프 그리기
		chartDisplay.drawGraph();	


		Chart d = new CloudChart();
		Display chart2Display = new Display(d);
		chart2Display.drawGraph();
	}
}