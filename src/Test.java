import java.sql.Date;
import Concrete.GamerSystemRegistration;
import Concrete.Management;
import Concrete.UserGamePurchaseManagement;
import Entities.Gamer;

public class Test {
public static void main(String[] args) {
	Date date=new Date(1997,19,8);
	String games[]= {"Counter Strike","Apex Legends","Grand Theft Auto"};
	Gamer gamer=new Gamer("152", "Engin", "Demiroð",date, "288614");
	gamer.oyuncuBilgileri();
	System.out.println(" ");
	Management management=new Management(gamer, true);
	GamerSystemRegistration gamerSystemRegistration=new GamerSystemRegistration(gamer);
	gamerSystemRegistration.add(gamer);
	System.out.println(" ");
	UserGamePurchaseManagement userGamePurchaseManagement=new UserGamePurchaseManagement(gamer, true, games);
	System.out.println(" ");
	userGamePurchaseManagement.buyGame(gamer);
	 
		
		
	
}
}
