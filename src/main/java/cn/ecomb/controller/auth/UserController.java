package cn.ecomb.controller.auth;

import cn.ecomb.entity.User;
import cn.ecomb.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouzhigang on 2017/5/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String Login(){

        return "token";
    }

    @Autowired
    private UserService userService;

    /**
     * 登录
     */
    @RequestMapping (value = "login", method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute User user){
        return userService.login(request, response, user);
    }
}
