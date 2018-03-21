package fr.pixelsparkle.volletauto;

import fr.pixelsparkle.volletauto.Watchdog.WDErrorMessage;
import fr.pixelsparkle.volletauto.Watchdog.WDMessages;

public class VolletAuto {
	
	private static int suite = 1;
	
	private static int VitesseDuVent = 10;
	private static int SoleilDetecte = 0;

	private static void checkConfig() {
	
		System.out.println(WDMessages.FIRSTCHECK);
		
		if(VitesseDuVent > 100 || VitesseDuVent < 1) {
			System.out.println(WDErrorMessage.VENTINVALIDE);
			suite = 0;
		}
		
		else if(SoleilDetecte < 0 || SoleilDetecte > 1) {
			System.out.println(WDErrorMessage.SOLEILINVALIDE);
			suite = 0;
		}
	}
	
	public static void main(String[] args) {
		
		checkConfig();
		
		if(suite == 1) {
			System.out.println(WDMessages.CHECK);
			
			if(VitesseDuVent > 50) {
				System.out.println(WDMessages.VENTFORT);
			}
			
			else if(SoleilDetecte == 1) {
				System.out.println(WDMessages.SOLEILDET);
			}
			
			else {
				System.out.println(WDMessages.RAD);
			}
		}
		
		else if(suite == 0) {
			System.out.println(WDErrorMessage.ENDSUITE);
			System.exit(0);
		}
		
	}

}
