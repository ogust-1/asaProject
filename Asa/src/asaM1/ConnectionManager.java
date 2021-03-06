package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortFournisConfiguration;
import asa.PortRequisComposant;
import asa.PortRequisConfiguration;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ComposantImpl;

public class ConnectionManager extends ComposantImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortRequisComposant in;
	private PortFournisComposant out; 
	private boolean autorized;
	String nameClient;
	
	public ConnectionManager() {
		super();
		this.setName("connectionManager");
		out = factory.createPortFournisComposant();
		in = factory.createPortRequisComposant();
		in.setComposant(this);
		out.setComposant(this);
		this.getPortrequiscomposant().add(in);
		this.getPortfourniscomposant().add(out);
	}
	
	public PortRequisComposant getIn(){
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
	
	public void setBindingIn(PortFournisConfiguration portFournisConfig) {
		in.getBinding().add(portFournisConfig);
	}
	
	public void SetBindingOut(PortRequisConfiguration portRequisConfig) {
		out.getBinding().add(portRequisConfig);
	}
	
	public void reponseDatabse(String name) {
		this.nameClient=name;
		System.out.println(name);
	}
	
	public void reponseSecurity(String s, Boolean b) {
		this.autorized=b;
		this.nameClient=name;
		
	}
	
	//fournis
	public void InterrogationDatabase (Client c, int i) {
		InterrogationSecurity(c);
		if (this.autorized) {
		ConnecteurConnection2Database co=(ConnecteurConnection2Database) out.getAttachement().get(1).getConnecteur();
		co.glue(i);
		}
	}
	
	//fournis
	public void InterrogationSecurity(Client c) {
		System.out.println("requete envoy? au manager2Security pour verification");
		ConnecteurConnection2Security co=(ConnecteurConnection2Security) out.getAttachement().get(0).getConnecteur();
		co.glue(c);
		
	}
	
	//fournis
	public void questionSeveur(Client cl, int i) {
		System.out.println("requete re?ue dans le ConnectionManager");
		InterrogationDatabase(cl,i);
		
	}
	
	//requis
	public void reponseServeur() {
		System.out.println("reponse re?u dans le connection manager");
		Serveur s=(Serveur)out.getBinding().get(0).getConfiguration();
		if (autorized) {
		s.answer(this.nameClient, "acc?s valide");}
		else s.answer(null, "acc?s non valide, user non autoris?");
	}
}
