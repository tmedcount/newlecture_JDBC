package ex01;

import java.sql.SQLException;

import com.newlecture.app.console.NoticeConsole;

public class Program5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		
		console.printNoticeList();
		
		int menu = console.inputNoticeMenu();
		
		switch(menu) {
		case 1: // ����ȸ
			break;
		case 2: // ����
			break;
		case 3: // ����
			break;
		case 4: // �۾���
			break;
		}

	}

}
