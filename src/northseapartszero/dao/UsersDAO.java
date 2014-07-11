package northseapartszero.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.caveofprogramming.spring.web.dao.User;

import java.util.List;

import northseapartszero.dao.*;

@Repository
@Transactional
@Component("UsersDAO")
public class UsersDAO extends MainModel
{	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Transactional
	public void create(Users users) {
		users.setPassword(passwordEncoder.encode(users.getPassword()));
		session().save(users);
	}
	
	@SuppressWarnings("unchecked")
	public List<Users> getAllUsers() 
	{
		System.out.println(sessionFactory.getCurrentSession());
		return session().createQuery("from Users").list();
	}
	
	public void deleteUser()
	{
		
	}
	
	public void updateUser()
	{
		
	}
}
