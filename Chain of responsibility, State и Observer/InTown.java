
public class InTown implements Chain{


    private  Chain nextInChain;   
  
    public void setNextChain(Chain nextChain) {       
     nextInChain = nextChain;       
    }
     
    public void calculate(Packages request) {
        
        if(request.getCheckWanted() == "InTown"){
             
        	System.out.print("\n A new package to " + request.getPackageDestination() + " has been registered!\n It contains "
                    + request.getPackageName() + " which will be delivered within Plovdiv.\n");
            
      } else {
             
    	  System.out.print("This package cannot be changed!"
    	  		+ "\n Are you sure that it's using 'OutOfCountry',"
    			  + "'InCountry', or 'InTown' ?");
    	  

             
        }         
   }
	
}
