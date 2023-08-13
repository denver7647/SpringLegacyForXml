package kr.co.sample.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DefaultInterceptors extends HandlerInterceptorAdapter {

	private Logger log = LoggerFactory.getLogger(DefaultInterceptors.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		log.info("==================== preHandle interceptor ====================");

		log.info(" Request URI \t: " + request.getRequestURI());

		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		log.info("====================================== postHandle interceptor ======================================\n");

		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		log.info("====================================== afterCompletion interceptor ======================================\n");

		super.afterCompletion(request, response, handler, ex);
	}
}
