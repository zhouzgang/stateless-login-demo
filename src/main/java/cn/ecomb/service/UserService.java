package cn.ecomb.service;

import cn.ecomb.config.Constant;
import cn.ecomb.entity.User;
import cn.ecomb.util.JwtUtil;
import cn.ecomb.util.ResponseUtil;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private static final Logger logger = LogManager.getLogger(UserService.class);
	
	@Autowired
	private JwtUtil jwt;

	public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response, User user){
		try {
			if(!"admin".equals(user.getAccount()) || !"123456".equals(user.getPwd())){
				return ResponseUtil.exception("账号或者密码错误");
			}
			user.setRoleId(1L);
			String subject = JwtUtil.generalSubject(user);
			String token = jwt.createJWT(Constant.JWT_ID, subject, Constant.JWT_TTL);
			String refreshToken = jwt.createJWT(Constant.JWT_ID, subject, Constant.JWT_REFRESH_TTL);
			JSONObject jo = new JSONObject();
			jo.put("token", token);
			jo.put("refreshToken", refreshToken);
			return ResponseUtil.success(jo);
		} catch (Exception e) {
			logger.error(e);
			return ResponseUtil.unKonwException();
		}
	}
}
