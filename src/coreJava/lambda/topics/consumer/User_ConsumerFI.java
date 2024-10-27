package functionalInterface.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class User_ConsumerFI {

	private String userName;
	private String status;

	public User_ConsumerFI(String userName) {
		super();
		this.userName = userName;
		this.status = "Inactive";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	void updateStatus(String status) {
		this.status = "Active";
	}

	@Override
	public String toString() {
		return "User_ConsumerFI [userName=" + userName + ", status=" + status + "]";
	}

	public static void main(String[] args) {
		List<User_ConsumerFI> users = new ArrayList<>();
		users.add(new User_ConsumerFI("Praneeth"));
		users.add(new User_ConsumerFI("Sarvani"));
		System.out.println("Before Status Update ::");
		Consumer<User_ConsumerFI> userConsumer = user -> user.updateStatus(user.getStatus());
		System.out.println("After Status Update ::");
		users.forEach(userConsumer);
		users.forEach(System.out::println);
	}

}
