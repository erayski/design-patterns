package MediatorAndFactory;

public class Bot {
	public void printMessage() {
		System.out.println("Bot: cat is a forbidden word!");
	}
	public void removeUser(User user) {
		Chat.RemoveUser(user);
	}
}
