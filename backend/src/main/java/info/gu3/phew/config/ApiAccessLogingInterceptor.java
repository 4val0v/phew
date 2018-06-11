package info.gu3.phew.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApiAccessLogingInterceptor extends HandlerInterceptorAdapter {

  private static final Logger LOGGER = LoggerFactory.getLogger(ApiAccessLogingInterceptor.class);

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    LOGGER.info(String.format("[START] %s %s", request.getMethod(), request.getRequestURL().toString()));
    return super.preHandle(request, response, handler);
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    LOGGER.info(String.format("[END] %s %s [STATUS:%d]", request.getMethod(), request.getRequestURL().toString(), response.getStatus()));
    super.postHandle(request, response, handler, modelAndView);
  }
}
