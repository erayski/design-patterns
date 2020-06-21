public class StopState implements State {

   public void doAction(Context context) {
      System.out.println("An employee has checked a package");
      context.setState(this);	
   }

   public String toString(){
      return " the package has been checked ";
   }
}