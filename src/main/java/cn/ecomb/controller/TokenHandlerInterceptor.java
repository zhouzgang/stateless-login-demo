package cn.ecomb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Created by zhouzhigang on 2017/5/30.
 */
/**
 * 拦截器实现
 */
public class TokenHandlerInterceptor extends HandlerInterceptorAdapter {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//    int type = (Integer) request.getSession().getAttribute("userType");
    if (1 == 1) {
      return true;
    } else {
//      String result = ResultUtils.getErrorResult("当前登录用户无操作权限！");
      String result = "gkgjhkjg";
      response.getOutputStream().write(result.getBytes());
      response.setStatus(HttpStatus.OK.value());
      return false;
    }
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
      throws Exception {
    // TODO Auto-generated method stub
    System.out.println(">>>MyInterceptor1>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    // TODO Auto-generated method stub
  }

}
