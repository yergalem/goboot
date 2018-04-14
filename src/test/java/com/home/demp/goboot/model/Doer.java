package com.home.demp.goboot.model;

import org.springframework.stereotype.Component;

@Component
public class Doer {

	private String componentName() {
		return "Doer";
	}
}


//spring-boot:run -Drun.jvmArguments='-Dserver.port=8081'   ... alternative to app.prop file config