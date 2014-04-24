package com.designpatterns.objectcreational.abstractfactory.model.madhu;

public abstract class CarEngine {
	
	private boolean hasFuel;
	
	public boolean isHasFuel() {
		return hasFuel;
	}

	public void setHasFuel(boolean hasFuel) {
		this.hasFuel = hasFuel;
	}

	public abstract void fillFuel();
	
	public void strart(){
		if(hasFuel){
			System.out.println("Engine is started......");
		}else{
			System.out.println("please fill fuel");
		}
		
		
	}


}
