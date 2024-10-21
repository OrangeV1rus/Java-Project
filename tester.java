import java.util.Scanner;
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner input = new Scanner(System.in);
		System.out.println("currentCatalog: ");
		System.out.println(Electronic.getCatalog());
		System.out.println();
		System.out.println("(q to quit) Enter SKU to sell: ");
		String w = input.nextLine();
		
		while(!w.equals("q")) {
		        Electronic.sell(w);
		        System.out.println("Item sold! Total sales to date: " + Electronic.getTotalSales());
		        System.out.println("Current number of items in inventory: " + Electronic.getTotalInventory());
		        System.out.println("currentCatalog: ");
				System.out.println(Electronic.getCatalog());
				System.out.println();
				System.out.print("(q to quit) Enter SKU to sell: ");
				w = input.nextLine();
		        
		}
		
		
	}
    
	
}
