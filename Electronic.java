import java.util.ArrayList;

/**
 * This is the superclass, which will generate random products, have the variables that all the superclass have
 */

public class Electronic {
	  private double price;
	  private String sku;
	  private String name;
	  private static int totalInventory;
	  private static int totalSales;
	  
	  static ArrayList<Electronic> catalog = new ArrayList<Electronic>();
	  public Electronic(double price, String sku, String name){
		  this.price=price;
		  this.sku=sku;
		  this.name=name;
		  totalInventory++;
		  catalog.add(this);
	  }
	  
	/**
	 * This method will add money to the totalsales, minus one the toalinventory, and remove one after the item that is sold. 
	 * @param sku
	 */
	public static void sell(String sku) {
		  for(int i = 0; i <catalog.size(); i++) {
			  if(sku.equals(catalog.get(i).getSku())) {
				  totalSales += catalog.get(i).getPrice();
				  totalInventory --;
				  catalog.remove(i);
			  }
		  }
	  }
	  
	/**
	 * all the methods below are getters and setters, gets the value and set it. 
	 * @return
	 */
	public String getName(){
		return name;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public static int getTotalInventory() {
		return totalInventory;
	}

	public static void setTotalInventory(int totalInventory) {
		Electronic.totalInventory = totalInventory;
	}

	public static int getTotalSales() {
		return totalSales;
	}

	public static void setTotalSales(int totalSales) {
		Electronic.totalSales = totalSales;
	}

	public static ArrayList<Electronic> getCatalog() {
		return catalog;
	}

	public static void setCatalog(ArrayList<Electronic> catalog) {
		Electronic.catalog = catalog;
	}

	 
/**
 * a toString method print out the sku and price. 
 */
	public String toString() {
		return sku + price +" ";
	}
	
	/**
	* Returns a random integer between 0 and n-1, inclusive
	* @return a random integer between 0 and n-1, inclusive
	*/	
	public static int random(int n) {
		return (int)(Math.random() * n);
	}
	

	
	static {
	    for (int i = 0; i < 10; i++) {
	        String[] gpus = {"RTX 4060", "RTX 4050", "RTX 4080", "RTX 4070"};
	        String gpu = gpus[random(gpus.length)];
	        String[] names = {"Omen", "Zenbook", "Thinkbook", "Thinkpad", "Zephyrus"};
	        String name = names[random(names.length)];
	        boolean[] touchscreen = {true, false};
	        boolean screen = touchscreen[random(touchscreen.length)];

	       

	        double[] prices = {1000, 2000, 1500, 900, 1200, 1700};
	        double price = prices[random(prices.length)];

	        String sku = "1234-" + i; 

	        Laptop s = new Laptop(price, sku, name, gpu, screen);
	     
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	 String[] cpus = {"A17pro", "Snapdragon gen 3", "Snapdragon gen 2", "A16"};
		        String cpu = cpus[random(cpus.length)];
		        String[] names1 = {"iPhone15pro", "S23 pro", "S22", "RedMagic", "Pix"};
		        String name1 = names1[random(names1.length)];
		        boolean[] fullscreens = {true, false};
		        boolean fullscreen = fullscreens[random(fullscreens.length)];

	       

	        double[] prices = {1000, 2000, 1500, 900, 1200, 1700};
	        double price = prices[random(prices.length)];

	        String sku = "1235-" + i; 

	        Phone d = new Phone(price, sku, name1, cpu, fullscreen);
	     
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	 String[] waterprooftypes = {"PI68", "PI65", "PI66", "PI67"};
		        String waterprooftype = waterprooftypes[random(waterprooftypes.length)];
		        String[] names2 = {"Omen", "Zenbook", "Thinkbook", "Thinkpad", "Zephyrus"};
		        String name2 = names2[random(names2.length)];
		        boolean[] gpss = {true, false};
		        boolean gps = gpss[random(gpss.length)];
	        double[] prices = {1000, 2000, 1500, 900, 1200, 1700};
	        double price = prices[random(prices.length)];

	        String sku = "1236-" + i; 

	        Watch c = new Watch(price, sku, name2, waterprooftype, gps);
	     
	    }
	}
	
	  
	  
}
