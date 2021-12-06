package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.*;
import asa.impl.*;

public class ClientServeur extends ConfigurationImpl{
	
	private Client client;
	private Serveur serveur;
	private RPC RPC;

	public ClientServeur() {

		AsaPackage aPackage=AsaPackage.eINSTANCE;
		AsaFactory factory= aPackage.getAsaFactory();
		
		this.client=new Client();
		this.serveur=new Serveur();
		RPC=new RPC();
		
		RPC.setPortIn(client.getOut());
		RPC.setPortIn(serveur.getOutExt());
		RPC.setPortOut(client.getIn());
		RPC.setPortIn(serveur.getOutExt());
		
		
		
	}

}
