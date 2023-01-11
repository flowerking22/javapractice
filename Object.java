class IPhone extends Apple {
  private String model = "iPhone 11";    
 
	public static void main(String args[]) {

    IPhone myMobile = new IPhone();

    System.out.println(myMobile.brand + "'s new realease is " + myMobile.model);
    myMobile.Features();

  }
}
class Apple {
  protected String brand = "Apple";        
  public void Features() {                    
    System.out.println("Capacity : 256 GB");
    System.out.println("Liquid retina HD Display of 6.1 inches.");
    System.out.println("Dual 12MP Ultra Wide and Wide cameras");
  }
}





utput:

Apple's new realease is iPhone 11
Capacity : 256 GB
Liquid retina HD Display of 6.1 inches.
Dual 12MP Ultra Wide and Wide cameras
