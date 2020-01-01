package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
    public SysUser userLogin(String u_name);
	public SysUser selectUserByUsername(String u_name);
	public int insertUser(SysUser user);
	public SysUser selectUserBySysUser(String u_name);
	
}
