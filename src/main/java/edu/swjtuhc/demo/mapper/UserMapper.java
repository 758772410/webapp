package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
    public SysUser userLogin(String username);
	public SysUser selectUserByUsername(String username);
	public int insertUser(SysUser user);
	public SysUser selectUserBySysUser(String username);
	
}
