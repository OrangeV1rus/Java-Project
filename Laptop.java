/**
 * This class is for laptops contains two new variable: gpu and touchscreen
 */
public class Laptop extends Electronic {
   private String gpu;
   private boolean touchscreen;
   
   public Laptop(double price, String sku, String name, String gpu, boolean touchscreen) {
	   super(price,sku,name);
	   this.gpu=gpu;
	   this.touchscreen=touchscreen;
	   
   }
   /**
	 * all the methods below are getters and setters, gets the value and set it. 
	 * @return
	 */
public String getGpu() {
	return gpu;
}

public void setGpu(String gpu) {
	this.gpu = gpu;
}

public boolean isTouchscreen() {
	return touchscreen;
}

public void setTouchscreen(boolean touchscreen) {
	this.touchscreen = touchscreen;
}
   
/**
 * a toString method print out the description of the laptop
 */
public String toString(){
	return "[SKU: " + super.getSku() +"] " + getGpu() + " " +isTouchscreen() +" isTouchscreen " + super.getName() + ": " + super.getPrice();
	

}
   
}
