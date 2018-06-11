package pl.kamil;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	public static List<User> getUsers() {
		List<User> users = new ArrayList<>();

		users.add(new User(1, "Ensei", "Tankado", "kamil@gmail.com"));

		return users;
	}

}
