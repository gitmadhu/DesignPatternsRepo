package com.designpatterns.classcreational.factory.gk;

public class SecureSearchProviderFactory extends SearchProviderFactory {

	@Override
	public SearchProvider getSearchpProvider(String type) {
		// TODO Auto-generated method stub
		if("Google".equalsIgnoreCase(type))
			return new GoogleSearch();
		if("Bingo".equalsIgnoreCase(type))
			return new BingoSearch();
		if("Yahoo".equalsIgnoreCase(type))
			return new YahooSearch();
		return null;
	}

}
