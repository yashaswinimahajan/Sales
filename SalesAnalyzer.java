package salesanalyzer;

public class SalesAnalyzer {
	private double[] sales;
		
		public SalesAnalyzer(int i) {
			
			this.sales=new double[i];
			
		}
		
		public void addSale(double saleAmount, int i) {
			sales[i]=saleAmount;
		}
		
		public double calculateTotalSales() {
			double totalSales=0;
			for(double sale:sales) {
				totalSales=totalSales+sale;
			}
			return totalSales;
		}
		
		public double calculateAverageDailySales() {
			double totalSales=calculateTotalSales();
			double avgDailySales=totalSales/sales.length;
			return avgDailySales;
		}
		
		public String findBestSalesDay() {
			int bestDay=0;
			double bestSale=sales[0];
			for(int i=0; i<sales.length;i++) {
				if(sales[i]>bestSale) {
					bestSale=sales[i];
					bestDay=i;
				}
			}
			if(bestDay==0)
				return "monday";
			if(bestDay==1)
				return "tuesday";
			if(bestDay==2)
				return "wednesday";
			if(bestDay==3)
				return "thursday";
			if(bestDay==4)
				return "friday";
			if(bestDay==5)
				return "saturday";
			if(bestDay==6)
				return "sunday";
			
			return "Not Found";
		}
		
		public String findWorstSalesDay() {
			int worstDay=0;
			double worstSale=sales[0];
			for(int i=0;i<sales.length;i++) {
				if(sales[i]<worstSale) {
					worstSale=sales[i];
					worstDay=i;
				}
			}
			if(worstDay==0)
				return "monday";
			if(worstDay==1)
				return "tuesday";
			if(worstDay==2)
				return "wednesday";
			if(worstDay==3)
				return "thursday";
			if(worstDay==4)
				return "friday";
			if(worstDay==5)
				return "saturday";
			if(worstDay==6)
				return "sunday";
			
			return "Not Found";
		}
		
		public void displaySalesReport() {
			System.out.println("Total Sales: "+calculateTotalSales());
			System.out.println("Average daily sales: "+calculateAverageDailySales());
			System.out.println("Best Sales Day: "+findBestSalesDay());
			System.out.println("Worst Sales Day: "+findWorstSalesDay());
			
		}
		
		
		
		
		public static void main(String[] args) {
			
			SalesAnalyzer obj=new SalesAnalyzer(7);
			
			obj.addSale(3000.00, 0);
			obj.addSale(2000.00, 1);
			obj.addSale(3500.00, 2);
			obj.addSale(1000.00, 3);
			obj.addSale(4000.00, 4);
			obj.addSale(1500.00, 5);
			obj.addSale(4500.00, 6);
			
			obj.displaySalesReport();
		}

	}



