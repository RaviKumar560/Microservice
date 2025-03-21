package in.sp.main.ApiGatewayComponent;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class ApiGateway implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		ServerHttpRequest request=exchange.getRequest();
		HttpHeaders header=request.getHeaders();
		Set<String> key=header.keySet();
		if(!key.contains("secret")) {
			throw new RuntimeException("Invalid request");
		}
		List<String>list=header.get("secret");
		if(!list.get(0).equals("Ravi560@")) {
			throw new RuntimeException("Invalid request");
		}
		System.out.println("filltering .....");
		return chain.filter(exchange);
	}

	
}
