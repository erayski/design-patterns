
public class StartState implements State{


		   public void doAction(Context context) {
		      System.out.println("\nAn employee takes a package");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "a package is being checked \n";
		   }
}

