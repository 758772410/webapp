package edu.swjtuhc.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.util.JSONPObject;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;
import netscape.javascript.JSObject;
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
}
