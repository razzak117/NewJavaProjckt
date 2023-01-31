package com.clas;

public class bikePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike bk1=new bike();
		bike bk2=new bike();
		bike bk3=new bike();
		bike bk4=new bike();
		
		bk1.bikeName="Yamaha";
		bk1.color="Red";
		bk1.madeBy="Japan";
		bk1.speed=85;
		
		bk2.bikeName="Honda";
		bk2.color="Gray/Blue";
		bk2.madeBy="India";
		bk2.speed=75;
		
		bk3.bikeName="Suzuki";
		bk3.color="Silver";
		bk3.madeBy="Malaysia";
		bk3.speed=80;
		
		System.out.println("This is"+bk1.bikeName+","+"colr"+ bk3.color+","+"Made in"+bk3.madeBy+","+ "Its run"+bk2.speed+"/pkm"+".");
		
	}
		
		
		
}	

		
