package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.UserVo;
import service.UserService;

@Controller
public class HomeController {

	private UserService userService = new UserService();
	
	
	@RequestMapping("/home.do")
	public String home(Model model) throws Exception {
		System.out.println("컨트롤 진입 완료!");
		List<UserVo> vovo = userService.selectAll();
		System.out.println("DB 데이터 확인 용 : " + vovo);
		for(UserVo vo : vovo) {
			System.out.println(vo.getId());
			System.out.println(vo.getPwd());
		}
		model.addAttribute("message", "반갑습니다! 서버에서 보낸 데이터예요.");
		return "home";
	}

	
	@RequestMapping("/dbTest.do")
	public String dbTest(Model model) throws Exception {
		
		UserVo vo = new UserVo();
		
	    vo.setId("서비스 클래스 테스트");
	    vo.setPwd("인터페이스 없이 하나로 성공!");
	    
	    model.addAttribute("msg", "서비스 클래스 호출 성공!");
	    return "home";
	}
	
}
