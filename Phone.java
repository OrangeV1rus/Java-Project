/**
 * This class is for Phone contains two new variable: cpu and fullscreen
 */
public class Phone extends Electronic{
	 private String cpu ;
	   private boolean fullscreen;
	   
	   public Phone(double price, String sku, String name, String cpu, boolean fullscreen) {
		   super(price,sku,name);
		   this.cpu=cpu;
		   this.fullscreen=fullscreen;
	   }


	   
	   /**
		 * all the methods below are getters and setters, gets the value and set it. 
		 * @return
		 */
	public String getCpu() {
		return cpu;
	}






	public void setCpu(String cpu) {
		this.cpu = cpu;
	}






	public boolean isFullscreen() {
		return fullscreen;
	}






	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
	}




	/**
	 * a toString method print out the description of the phone
	 */

	public String toString(){
		return "[SKU: " + super.getSku() +"] " + getCpu() +" " + isFullscreen() +" Fullscreen " + super.getName() + ": " + super.getPrice();

	}
  
  
}
