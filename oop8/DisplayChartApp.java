public class DisplayChartApp {
	public static void main(String[] args) {
		
		// Chart ���� ��ü �����
		Chart c = new XLSChart();
		// Chart�� ��ü�� �����ؼ� Display��ü �����
		Display chartDisplay = new Display(c);
		// �׷��� �׸���
		chartDisplay.drawGraph();	


		Chart d = new CloudChart();
		Display chart2Display = new Display(d);
		chart2Display.drawGraph();
	}
}