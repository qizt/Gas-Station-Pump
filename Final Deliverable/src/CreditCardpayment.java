
import java.util.*;

/**
 * 
 */
public class CreditCardpayment implements IPayment {

	CreditCardAuthenticationCenter authCenter;
    /**
     * Default constructor
     */
    public CreditCardpayment() {
    	authCenter=new CreditCardAuthenticationCenter();
    	
    }




    /**
     * 
     */
 

    
	public double requestPreAuthorize(String cardNum, int expDate, int ZIPcode) {
		// TODO Auto-generated method stub
		return authCenter.requestPreAuthorize(cardNum, expDate, ZIPcode);	
	}




	@Override
	public void requestCharge(double amount) {
		// TODO Auto-generated method stub
		authCenter.requestCharge(amount);
		
	}

}