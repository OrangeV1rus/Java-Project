/**
 * This class is for Phone contains two new variable: waterprooftype and gps
 */
public class Watch extends Electronic{
	 private String waterprooftype ;
	   private boolean gps;
	   
	   public Watch(double price, String sku, String name, String waterprooftype, boolean gps) {
		   super(price,sku,name);
		   this.waterprooftype=waterprooftype;
		   this.gps=gps;
	   }


	   /**
		 * all the methods below are getters and setters, gets the value and set it. 
		 * @return
		 */
	public String getWaterprooftype() {
		return waterprooftype;
	}



	public void setWaterprooftype(String waterprooftype) {
		this.waterprooftype = waterprooftype;
	}



	public boolean isGps() {
		return gps;
	}



	public void setGps(boolean gps) {
		this.gps = gps;
	}


	/**
	 * a toString method print out the description of the watch
	 */
	public String toString(){
		return "[SKU: " + super.getSku() +"] " + getWaterprooftype() + " " +isGps() +" Gps " + super.getName() + ": " + super.getPrice();

	}
}
