package asaM1;

import asa.impl.*;

import java.util.ArrayList;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;

public class Database extends ComposantImpl {
	
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	private PortRequisComposant in;
	private PortFournisComposant out;
	private ArrayList<Client> BDClient;
	
	
	public Database() {
		super();
		this.setName("dataBase");
		in=factory.createPortRequisComposant();
		out=factory.createPortFournisComposant();
		this.getPortrequiscomposant().add(in);
		this.getPortfourniscomposant().add(out);
		this.BDClient=new ArrayList<>();
		in.setComposant(this);
		out.setComposant(this);
		
	}
	
	public PortRequisComposant getIn(){
		//return this.getPortrequiscomposant().get(0);
		return this.in;
	}
	
	public PortFournisComposant getOut() {
		return this.out;
	}	
	
	public void setRoleIn(RoleFournis roleFournis ) {
		in.getAttachement().add(roleFournis);
	}
	
	public void setRoleOut(RoleRequis roleRequis) {
		out.getAttachement().add(roleRequis);
	}
	
	public void addClient(Client client) {
		this.BDClient.add(client);
	}
	
	public void  serviceConnection(int i) {
		sentReponse2Connection( BDClient.get(i));
		System.out.println("client "+i+" envoy� au connecteur");
	}
	
	public void clientIsPresent(Client client) {
		sentResponse2Security( BDClient.contains(client));
	}
	
	
	public void sentReponse2Connection(Client client) {		
		ConnecteurDatabase2Connection c=(ConnecteurDatabase2Connection) this.out.getAttachement().get(1).getConnecteur();
		c.glue(client);
	}
	
	public void sentResponse2Security(boolean b) {
		ConnecteurDatabase2Security c= (ConnecteurDatabase2Security) this.out.getAttachement().get(0).getConnecteur();
		c.glue(b);
		System.out.println("reponse envoy� au securityManager");
	}
	
}
