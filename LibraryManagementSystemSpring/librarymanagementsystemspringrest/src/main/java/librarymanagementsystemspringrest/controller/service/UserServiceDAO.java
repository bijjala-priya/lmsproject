package librarymanagementsystemspringrest.controller.service;

public interface UserServiceDAO {
	
	boolean bookRequest(int id,int bookId);
	boolean bookReturn(int userId,int bookId);
	boolean changePassword(int id,String oldPassword,String newPassword);

}
