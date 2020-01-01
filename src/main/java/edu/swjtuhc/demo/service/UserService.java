package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
		public int register(SysUser user);
		 public SysUser userLogin(String u_name);
		SysUser selectUser(String u_name);
}
