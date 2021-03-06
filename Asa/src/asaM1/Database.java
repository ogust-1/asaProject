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
	private ArrayList<String> blackList;
	
	
	public Database() {
		super();
		this.setName("dataBase");
		in=factory.createPortRequisComposant();
		out=factory.createPortFournisComposant();
		this.getPortrequiscomposant().add(in);
		this.getPortfourniscomposant().add(out);
		this.BDClient=new ArrayList<>();
		this.blackList=new ArrayList<>();
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
	
	public void addBlacklist(String name) {
		this.blackList.add(name);
	}
	
	//requis
	public void  serviceConnection(int i) {
		System.out.println("client "+i+" envoy? au connecteur");
		sentReponse2Connection( BDClient.get(i));
		
	}
	
	//requis
	public void clientIsPresent(Client client) {
		System.out.println("reponse envoy? au securityManager");
		if (blackList.contains(client.getName())) {
			sentResponse2Security( BDClient.contains(client), true);
		}
		else {
		sentResponse2Security( BDClient.contains(client),false);}
	}
	
	//fournis
	public void sentReponse2Connection(Client client) {	
		ConnecteurDatabase2Connection c=(ConnecteurDatabase2Connection) this.out.getAttachement().get(1).getConnecteur();
		c.glue(client);
	}
	
	//Fournis
	public void sentResponse2Security(boolean b, boolean blackList) {
		
		ConnecteurDatabase2Security c= (ConnecteurDatabase2Security) this.out.getAttachement().get(0).getConnecteur();
		c.glue(b, blackList);
		
	}
	
}
