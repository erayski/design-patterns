
public class OutOfCountry implements Chain{

    private  Chain nextInChain;   
  
    public void setNextChain(Chain nextChain) {       
     nextInChain = nextChain;       
    }
     
    public void calculate(Packages request) {
        
        if(request.getCheckWanted() == "OutOfCountry"){
             
            System.out.print("\n A new package to " + request.getPackageDestination() + " has been registered!\n It contains "
            + request.getPackageName() + " which will be delivered outside Bulgaria.\n");
            
      } else {
             
            nextInChain.calculate(request);

             
        }         
   }
}

