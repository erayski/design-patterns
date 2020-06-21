
public class ReadyObserver extends Observer {
	

		   public ReadyObserver(Subject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "\nThe offices are ready to serve clients.\n" );
		   }
		
}
