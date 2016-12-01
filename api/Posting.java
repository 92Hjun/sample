import java.util.Date;
import java.text.SimpleDateFormat;


public class Posting {
	private int no;
	private String title;
	private String text;
	private Date regdate;

	// 보통 static을 선언하여 만든다.
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

	public Posting(int no, String title, String text, Date regdate) {
		this.no = no;
		this.title = title;
		this.text = text;
		this.regdate = regdate;
	}

	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getText() {
		return text;
	}
	public Date getRegdate() {
		return regdate;
	}
	// 포멧을 사용해 불러오는 메소드를 선언해준다.
	public String getPrettyRegdate() {
		String textDate = sdf.format(regdate);
		return textDate;
	}
}