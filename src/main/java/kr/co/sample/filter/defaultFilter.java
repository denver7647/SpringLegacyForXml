package kr.co.sample.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class defaultFilter implements Filter {
	
	Logger log = LoggerFactory.getLogger(defaultFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // FilterConfig를 통한 filter 설정
        // 서블릿 컨테이너가 필터 인스턴스 생성한 후 초기화 하기 위해서 사용 전 호출하는 메소드
    	log.info("====================================== defaultFilter init ======================================\n");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 필터에서 구현해야 하는 로직을 작성하는 메소드

                // 처리 전
    			log.info("====================================== defaultFilter doFilter start ======================================\n");
    	
                chain.doFilter(request, response);
             
                log.info("====================================== defaultFilter doFilter end======================================\n");
                // 처리 후
    }

    @Override
    public void destroy() {
        // 필터 인스턴스를 종료시키기 전에 호출하는 메소드
    	
    	log.info("====================================== defaultFilter destroy ======================================\n");
    }
}