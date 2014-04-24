package com.designpatterns.classcreational.factory.gk;

import java.util.Scanner;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchProviderFactory factory = new SecureSearchProviderFactory();
		System.out.println("Enter Object to be created(Google,Yahoo,Bingo ) : ");
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		sc.close();// to avoid resource leak
		SearchProvider provider = factory.getSearchpProvider(type);
		if(provider!=null)
			provider.doSearch();
		
	}

}
