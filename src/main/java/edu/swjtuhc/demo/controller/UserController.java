package edu.swjtuhc.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.util.JSONPObject;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;
@RestController
@RequestMapping("/user")
public class UserController {
	    @Autowired
	    UserService userService;
	    
		@RequestMapping("/register")
		public JSONObject register(@RequestBody SysUser user) {
			JSONObject result = new JSONObject();
			int i=userService.register(user);
			result.put("state",i);			
			return result;
		}
		@RequestMapping("/login")
		public JSONObject login(@RequestBody SysUser user) {
			JSONObject result = new JSONObject();
			SysUser user1=userService.userLogin(user.getU_name());
			if (user1==null) {
				result.put("state","没有这个用户");
				return result;
			}else {
				if (user1.getU_password().equals(user.getU_password())) {
					result.put("state", "登录成功");
					return result;
				}else {
					result.put("state", "密码错误");
					return result;
				}
			}
		}
		@RequestMapping("/data")
		public JSONObject selectUser(@RequestBody SysUser user) {
			JSONObject result = new JSONObject();
			SysUser user2=userService.selectUser(user.getU_name());
			result.put("state", user2);
			return result;
			
		}
}
