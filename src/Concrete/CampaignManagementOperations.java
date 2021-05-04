package Concrete;

import Abstract.CampaignManagement;
import Entities.Gamer;

public class CampaignManagementOperations extends Management implements CampaignManagement{
	
	

	public CampaignManagementOperations(Gamer gamer, boolean couponeCode) {
		super(gamer, couponeCode);
	}

	@Override
	public void addCampaign() {
		System.out.println("coupon campaign has been added.");
		
	}

	@Override
	public void deleteCampaign() {
		System.out.println("coupon campaign has been deleted.");
		
	}

	@Override
	public void updateCampaign() {
		System.out.println("campaign has been updated.");
		
	}




}
