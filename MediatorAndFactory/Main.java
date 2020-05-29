package MediatorAndFactory;

public class Main {
	public static void main(String[] args) {
		
		Factory factory = new MainFactory();
		
		User firstUser = factory.createUser("Stoqn");
		User secondUser = factory.createUser("Ivan");
		User thirdUser = factory.createUser("Georgi");
		User anotherUser = factory.createUser("Ivanka");

		Chat.AddUser(firstUser);
		Chat.AddUser(secondUser);
		Chat.AddUser(thirdUser);
		
		firstUser.sendMessage("My name is Stoqn!");
		secondUser.sendMessage("Hi Stoqn!");
		thirdUser.sendMessage("Hi Stoqn!");

		anotherUser.sendMessage("Hi!");
		firstUser.sendMessage("Do you  like cats?");
		secondUser.sendMessage("addBot");
		thirdUser.sendMessage("Yes cats are great, I have a cat at home!");
		thirdUser.sendMessage("another message!");

	}
}
