package controllers;


public class Security extends Secure.Security {
	static boolean authenticate(String username, String password) {
		return true;
		// return User.connect(username, password) != null;
	}

	static boolean check(String profile) {
		if ("admin".equals(profile)) {
			return true;
			// return User.all().filter("email", connected()).get().isAdmin;
		}
		return false;
	}

	static void onDisconnected() {
		Application.index();
	}

	static void onAuthenticated() {
		Admin.index();
	}
}