package asaM1;

import asa.PortFournisComposant;
import asa.RoleFournis;

public class test {

	public static void main(String[] args) {
		Client cl1=new Client();
		Client cl2=new Client();
		cl1.setName("cl1");
		cl2.setName("cl2");
		Serveur serveur=new Serveur();
		serveur.getData().addClient(cl1);
		serveur.getCOnnection().InterrogationSecurity(cl2);
		serveur.getCOnnection().InterrogationDatabase(cl1, 0);
		
		
	}

}
