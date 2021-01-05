package kr.co.ezen;

import com.naver.Call;
import com.naver.Center;
import com.naver.Tel;

public class MainEx {
	public static void main(String[] args) {
		Call call = new Call();
		Center center = new Center(call);
		Tel tel = new Tel();
		
		center.CallToCenter(tel);
		
	}

}
