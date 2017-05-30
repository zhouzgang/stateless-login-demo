package cn.ecomb.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhouzhigang on 2017/5/30.
 */
@Configuration
public class TokenInterceptor extends WebMvcConfigurerAdapter {

  /**
   * 添加拦截器
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new TokenHandlerInterceptor())
        //添加需要验证登录用户操作权限的请求
//        .addPathPatterns("/*", "/testContrl/update*", "/testContrl/delete*")
        // 前后端没有分离，得考虑前端静态资源的访问，或者给请求添加／api 配置
        .addPathPatterns("/**")
        //排除不需要验证登录用户操作权限的请求
        .excludePathPatterns("/user/login");
  }
}
