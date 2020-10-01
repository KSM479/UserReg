package com.Project;




public class UserDAOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO userList = new UserDAO();
		User user1 = new User("kalpan.mehta@gmail.com", "Kalpan@1234","Kalpan","Mehta","Male",11,11,1995
				                    		              
				              );
		User user2 = new User("kal.mehta@gmail.com", "Kalpan@1234","Kevin","Mea","Male",1,1,1965
	              
);
		User user3 =new User("kala@gmail.com", "Kalpan@1234","Kev","Me","Male",1,2,1985
	              
);
		userList.addUser(user1);
		userList.addUser(user2);
		userList.addUser(user3);
		userList.printAll();
		userList.deleteUser("kal.mehta@gmail.com");
		userList.printAll();
	}

}
