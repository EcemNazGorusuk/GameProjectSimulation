package Concrete;

import Abstract.GamerSystemService;
import Entities.Gamer;

public  class GamerSystemRegistration implements GamerSystemService{
    private Gamer gamer;
    
	public GamerSystemRegistration(Gamer gamer) {
		this.gamer = gamer;
	}
     
	@Override
	public void add(Gamer gamer) {
	   System.out.println("saved to database: "+gamer.getFirstName());
		
	}

	@Override
	public void update() {
		System.out.println("your changes have been updated: ");
		gamer.oyuncuBilgileri();
		
	}

	@Override
	public void delete() {
		System.out.println("the gamer has been deleted: "+gamer.getFirstName());
		
	}

}
