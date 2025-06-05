package Diwali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOGODiscountOptimizer {

	public static void main(String[] args) {
		
		 List<Integer> prices = Arrays.asList(10, 20, 30, 40, 50, 60);
	        calculateBOGODiscount(prices);
	    }

	    public static void calculateBOGODiscount(List<Integer> prices) {
	      
	        List<Integer> sortedPrices = new ArrayList<>(prices);
	        sortedPrices.sort(Collections.reverseOrder());

	        List<Integer> payableItems = new ArrayList<>();
	        List<Integer> freeItems = new ArrayList<>();

	    
	        for (int i = 0; i < sortedPrices.size(); i++) {
	            if (i % 2 == 0) {
	                payableItems.add(sortedPrices.get(i)); 
	            } else {
	                freeItems.add(sortedPrices.get(i));
	            }
	        }

	      
	        System.out.println("Product Price List: " + prices);
	        System.out.println("Payable Items: " + payableItems);
	        System.out.println("Discounted Items (Free): " + freeItems);
	        System.out.println("Total Amount Payable: ₹" + payableItems.stream().mapToInt(Integer::intValue).sum());
	        System.out.println("Total Discount Received: ₹" + freeItems.stream().mapToInt(Integer::intValue).sum());
	    }
	
	
	}


