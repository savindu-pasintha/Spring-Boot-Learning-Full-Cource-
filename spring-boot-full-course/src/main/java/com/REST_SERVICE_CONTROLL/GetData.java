package com.REST_SERVICE_CONTROLL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.BusinessLogic.User;
import com.Normal_Mysql_Database.databasePkg.Login;
import com.Normal_Mysql_Database.modelsPkg.LoginModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetData {
	
	@GetMapping(value = "/api/users")
	public List<String> getAPIUsers() {
		return List.of("id","name","age");
	}


	@GetMapping(value = "/api/login")
	public ArrayList<LoginModel> getAPILogin() throws SQLException, ClassNotFoundException {
		return new Login().read();
	}


	@GetMapping(value = "/api/users/{id}")
	public String viewUser(@PathVariable("id") String id) {
		new User().allUsers(id);
		return id;
	}
}
