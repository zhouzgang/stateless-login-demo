package cn.ecomb.controller.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouzhigang on 2017/5/30.
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login(){

        return "token";
    }
}
