package com.vartikasingh.transaction.driver;
import java.util.Scanner;

import com.vartikasingh.transaction.service.TransactionService;


public class TransactionDriver {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of the array");
		for(int i = 0; i< size; i++) 
			arr[i] = sc.nextInt();
		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetNo= sc.nextInt();
		TransactionService transactionService = new TransactionService();
		transactionService.checkTransaction(arr , targetNo);
		sc.close();
			
			
			

		}

	}
		



