package northseapartszero.dao;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users extends MainModel
{
	@Id
	@Column(name="users_id")
	@GeneratedValue
	private int users_id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="security_template")
	private String security_template;
	
	public Users(){};
	
	public Users(int users_id, String username, String password,
			boolean enabled, String security_template) {
		super();
		this.users_id = users_id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.security_template = security_template;
	}
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getSecurity_template() {
		return security_template;
	}
	public void setSecurity_template(String security_template) {
		this.security_template = security_template;
	}
	
	@Override
	public String toString() {
		return "Users [users_id=" + users_id + ", username=" + username
				+ ", password=" + password + ", enabled=" + enabled
				+ ", security_template=" + security_template + "]";
	}
	
}
