package Concrete;

import java.util.Scanner;

import Abstract.GamePurchases;
import Entities.Gamer;

public class UserGamePurchaseManagement  extends Management implements GamePurchases{
   Scanner scanner=new Scanner(System.in);
   private String games[];
   private int coin;
    
   public UserGamePurchaseManagement(Gamer gamer,boolean couponeCode,String games[]) {
		super(gamer, couponeCode);
		this.games=games;
		this.coin=5000;
	}
   
    @Override
    	public void allPaidItems(String[] games) {
    	System.out.println("All paid games (20% discount applies if you have a coupon): ");
    	for(int i=0;i<games.length;i++) {
    		System.out.println((i+1)+") "+games[i]);
    		
    	}
    		
  	}
	@Override
	public void buyGame(Gamer gamer) {
		
		String select  = "1. Process: query money\n"+"2. Process: Purchase game\n"+"Press q to exit";
        System.out.println(select);
        while (true) {
             System.out.print("make your choice: ");
             String operation  = scanner.nextLine();
  
             if (operation.equals("q")) {
      
                  System.out.println("Exiting the Program...");
                  break;
             }
             else if (operation.equals("1")){
                  System.out.println("money in your account: " + coin);
             }
             else if (operation.equals("2")){
            
            	 System.out.println("************************************************");
            	 allPaidItems(games);
            	 System.out.println("*************************************************");
            	 String selectGame="1-Counter Strike:300TL\n"+"2-Apex Legends:200TL\n"+"3-Grand Theft Auto:270TL\n"+"Exit:q";
            	 System.out.println(selectGame);
            	 while (true) {
                     System.out.print("Select game: ");
                     String operation1 = scanner.nextLine();
          
                     if (operation1.equals("q")) {
              
                          System.out.println("you are redirected to user transactions...");
                          break;
                     }
                     else if (operation1.equals("1")){
                          System.out.println("The game to be purchased: "+games[0]);
                          System.out.print(gamer.getFirstName()+",Please enter the amount you would pay to purchase the game: ");
                          int amount = scanner.nextInt();
                          scanner.nextLine();
               
                          if (coin - amount < 0) {
                   
                                  System.out.println("There is not enough money in your account. Your money: " + coin);
                           }
                           else {
                        	   if(couponeControl()==true) {
                        		   amount-=(amount*20)/100;
                        		   coin -= amount;
                        	   }else {
                        		   coin -= amount;
                        	   }
                                   System.out.println("your money : " + coin);
                           }
                     }
                     else if (operation1.equals("2")){
                         System.out.println("The game to be purchased: "+games[1]);
                         System.out.print(gamer.getFirstName()+",Please enter the amount you would pay to purchase the game: ");
                         int amount = scanner.nextInt();
                         scanner.nextLine();
              
                            if (coin- amount < 0) {
                  
                                 System.out.println("There is not enough money in your account. Your money: " + coin);
                            }
                            else {
                         	   if(couponeControl()==true) {
                         		  amount-=(amount*20)/100;
                         		  coin -= amount;
                         	   }else {
                         		  coin -= amount;
                         	   }
                                    System.out.println("your money : " + coin);
                            }
                    }
                     else if (operation1.equals("3")){
                         System.out.println("The game to be purchased: "+games[2]);
                         System.out.print(gamer.getFirstName()+",Please enter the amount you would pay to purchase the game: ");
                         int amount = scanner.nextInt();
                         scanner.nextLine();
              
                         if (coin - amount < 0) {
                  
                                 System.out.println("There is not enough money in your account. Your money : " + coin);
                          }
                         else {
                      	   if(couponeControl()==true) {
                      		 amount-=(amount*20)/100;
                      		 coin -= amount;
                      	   }else {
                      		 coin -= amount;
                      	   }
                                 System.out.println("your money : " + coin);
                         }
                     
            	   }
                   else {
                    	 System.out.println("invalid expression..");
                   }
            	 } 
               }
             else {
            	 System.out.println("invalid expression..");
             }
           }
       }
            
  
	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public String[] getGames() {
		return games;
	}

	public void setGames(String[] games) {
		this.games = games;
	}
	
    
}
