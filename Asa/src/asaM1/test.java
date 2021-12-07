package asaM1;

import asa.PortFournisComposant;
import asa.RoleFournis;

public class test {

	public static void main(String[] args) {
		Client cl1=new Client("cl1");
		Client cl2=new Client("cl2");
		Client cl3=new Client("cl3");
		Client cl4=new Client("cl4");
		Serveur serveur=new Serveur();
		serveur.addClient(cl1);
		serveur.addClient(cl3);
		serveur.addClient(cl4);
		serveur.addBlacklist("cl1");
		ClientServeur cl=new ClientServeur(cl1, serveur);
		
		//test blacklist
		cl.demandeClient(0);
		
		//test clien pas dans bd
		//cl.changeClient(cl2);
		//cl.demandeClient(0);
		
		//test client ayant accès
		//cl.changeClient(cl4);
		//cl.demandeClient(0);
		/*cl.demandeClient(1);
		cl.demandeClient(2);*/
		
	}

}
