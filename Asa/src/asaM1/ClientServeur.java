package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.*;
import asa.impl.*;

public class ClientServeur extends ConfigurationImpl{
	
	private Client client;
	private Serveur serveur;
	private RPC RPC;
	private RPCReponse RPCReponse;

	public ClientServeur(Client client,Serveur serveur) {

		AsaPackage aPackage=AsaPackage.eINSTANCE;
		AsaFactory factory= aPackage.getAsaFactory();
		
		this.client=client;
		this.serveur=serveur;
		RPC=new RPC();
		RPCReponse=new RPCReponse();
		
		RPC.setPortIn(client.getOut());
		RPC.setPortOut(serveur.getInExt());
		
		RPCReponse.setPortIn(serveur.getOutExt());		
		RPCReponse.setPortOut(client.getIn());
			
		
		
	}
	
	public void changeClient(Client cl) {
		this.client=cl;
		RPC.deletePort();
		RPCReponse.deletePort();
		RPC.setPortIn(client.getOut());
		RPC.setPortOut(serveur.getInExt());	
		RPCReponse.setPortIn(serveur.getOutExt());		
		RPCReponse.setPortOut(client.getIn());
	}
	
	public void demandeClient(int i) {
		client.sendRequest(i);
	}

}
