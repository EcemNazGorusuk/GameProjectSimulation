package Adapters;
import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

	public class MernisServiceAdapters implements IGamerCheckService{

		@Override
		public boolean checkIfRealPerson(Gamer gamer) {
			KPSPublicSoapProxy client=new KPSPublicSoapProxy();
			 boolean result=false;
				try {
					return client.TCKimlikNoDogrula(Long.parseLong(gamer.getId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}catch (RemoteException e) {
					 e.printStackTrace();
				}
				return result;
	   }
		

	
	 
}
