package final_blog.service;

import final_blog.entity.User;

public interface UserService {
	

	public User findByEmail(String email);
	
	public User findByFullName(String fullName);


}
