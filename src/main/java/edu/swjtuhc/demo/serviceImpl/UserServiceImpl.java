package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		SysUser u1 = userMapper.selectUserByUsername(user.getU_name());
		int i = 1;
		if (u1==null) {
			i=userMapper.insertUser(user);
		}else {
			i=2;
		}
		return i;
	}
	@Override
	public SysUser userLogin(String u_name) {
		// TODO Auto-generated method stub
		return userMapper.userLogin(u_name);
	}
	@Override
	public SysUser selectUser(String u_name) {
		// TODO Auto-generated method stub
		return userMapper.selectUserBySysUser(u_name);
	}
}
