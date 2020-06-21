
public class InCountry implements Chain{


    private  Chain nextInChain;   
  
    public void setNextChain(Chain nextChain) {       
     nextInChain = nextChain;       
    }
     
    public void calculate(Packages request) {
        
        if(request.getCheckWanted() == "inCountry"){
             
        	System.out.print("\n A new package to " + request.getPackageDestination() + " has been registered!\n It contains "
                    + request.getPackageName() + " which will be delivered within Bulgaria.\n");
            
      } else {
             
            nextInChain.calculate(request);

             
        }         
   }
	
}
