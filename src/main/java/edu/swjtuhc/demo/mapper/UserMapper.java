<<<<<<< HEAD
package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {

	public SysUser selectUserByUsername(String username);
	public int insertUser(SysUser user);
	
	
}
=======
package edu.swjtuhc.demo.mapper;

public interface UserMapper {

}
>>>>>>> branch 'master' of https://github.com/758772410/webapp.git
