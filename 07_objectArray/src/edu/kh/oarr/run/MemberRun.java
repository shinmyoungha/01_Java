package edu.kh.oarr.run;

import edu.kh.oarr.model.service.MemberService;

public class MemberRun { // 실행용 클래스 메인 필수

	public static void main(String[] args) {

		MemberService service = new MemberService();
		service.displayMenu();
		
		//service.ex();
	}
}
