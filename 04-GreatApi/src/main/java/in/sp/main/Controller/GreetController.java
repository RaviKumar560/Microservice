package in.sp.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.Service.WelcomeAndGreet;

@RestController
public class GreetController {
@Autowired
private WelcomeAndGreet wlcome;

	@GetMapping("/greet")
	public String DispalyGreet() {
		String msg=wlcome.DisplayMsg();
		String msg2="Good Morning";
		return msg+msg2;
	}
}
