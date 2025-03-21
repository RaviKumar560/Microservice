package in.sp.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	private Environment env;

	
	@GetMapping("/wlc")
	public String DisplayMsg() {
		String port=env.getProperty("server.port");
		return "Welcome in spring boot classes run on port ("+port+")";
	}

}
