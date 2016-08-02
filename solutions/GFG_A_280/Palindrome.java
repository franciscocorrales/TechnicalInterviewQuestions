package solutions.GFG_A_280;

public class Palindrome {

	  private String text;
	  private Boolean isPalindrome;
	  
	  public Palindrome(String text){
	    this.text = text;
	    this.isPalindrome = true;
	    this.isPalindrome();
	    System.out.println( this.text + ": " + this.isPalindrome );
	  }
	  
	  public void isPalindrome(){
	    if(isBaseCase()){
	      isPalindrome = false;
	    }
	    else{
			checkFullText();
	    }
	  }
	  
	  private boolean isBaseCase(){
	  	return text == null || text.length() == 0;
	  }
	  
	  private void checkFullText(){
	      int requiredChecks = (text.length() / 2) -1 ;
	      for(int i = 0; i <=  requiredChecks ; i++){
	        if(checkChars(i) == false){
	        	isPalindrome = false;
	        }
	      }
	  }
	  
	  private boolean checkChars(int charIndex){
	  		int reverseIndex = text.length() - 1 - charIndex;
	        return (text.charAt(charIndex) == text.charAt(reverseIndex)) ;
	  }
}
