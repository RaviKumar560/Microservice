package in.sp.main.Service;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WelcomeApi")
public interface WelcomeAndGreet {

	@GetMapping("/wlc")
	public String DisplayMsg();
}
