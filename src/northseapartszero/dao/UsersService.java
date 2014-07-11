package northseapartszero.dao;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("usersService")
public class UsersService extends MainModel 
{
	private UsersDAO usersDao;

	public List<Users> getAllUsers() 
	{
		return usersDao.getAllUsers();
	}
}
