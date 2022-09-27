package com.Middleware.MiddlewareApp.methods;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Middleware.MiddlewareApp.entities.User;

@Component						 //essa URL possui porta randômica, a aplicação no qual se faz requisição encontra-se no servidor Eureka.
@FeignClient(name = "User-App" , url = "http://host.docker.internal:50873/", path = "/users")
public interface UserFeignClient {
	@GetMapping(value = "/{id}")
	ResponseEntity<User> findById(@PathVariable long id);
}
