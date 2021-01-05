package kr.co.ezen;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContext implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("어플리케이션 종료");
		File f = new File("c:"+File.separator+"EZEN");
		if (f.exists()) {
			f.delete();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("어플리케이션 시작");
		File f = new File("c:"+File.separator+"EZEN");
		if (!f.exists()) {
			f.mkdir();
		}
		
	}

}
