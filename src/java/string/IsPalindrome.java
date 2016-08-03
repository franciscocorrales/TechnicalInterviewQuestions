package src.java.string;


public class IsPalindrome {

	  private String text;
	  private Boolean isPalindrome;
	  
	  public IsPalindrome(String text){
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
	  
	  public static void main(String[] args)
	  {
			IsPalindrome p1 = new IsPalindrome("abba");
		    IsPalindrome p2 = new IsPalindrome(null);
		    IsPalindrome p3 = new IsPalindrome("abbanot");
		    IsPalindrome p4 = new IsPalindrome("ababbaba");
		    IsPalindrome p5 = new IsPalindrome("");
		    IsPalindrome p6 = new IsPalindrome("abba!#@$%^(^&*()(*abba");
		    IsPalindrome p7 = new IsPalindrome("abcba");
		    IsPalindrome p8 = new IsPalindrome("aa");
		    IsPalindrome p9 = new IsPalindrome("a");
		    IsPalindrome p10 = new IsPalindrome("ababcbaba");
		    IsPalindrome p11 = new IsPalindrome("zababbabaz");
	  }	
}
