package com.example.jpa.quick.core;

import org.springframework.data.domain.AuditorAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;
public class MyAuditorAware implements AuditorAware<Integer> {
	/**
	 * Returns the current auditor of the application.
	 *
	 * @return the current auditor
	 */
	@Override
	public Optional<Integer> getCurrentAuditor() {
//		ServletRequestAttributes servletRequestAttributes =
//				(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//		Integer userId = (Integer) servletRequestAttributes.getRequest().getSession().getAttribute("userId");
		Integer userId=1;//test
		return Optional.ofNullable(userId);
	}
}
