package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurDatabase2Connection extends ConnecteurImpl {
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleRequis in;
	private RoleFournis out;

	
	public ConnecteurDatabase2Connection() {
		super();
		this.setName("ConnecteurDatabase2SecurityManager");
		in=factory.createRoleRequis();
		out=factory.createRoleFournis();
		in.setConnecteur(this);
		out.setConnecteur(this);
		this.getRolerequis().add(in);
		this.getRolefournis().add(out);
	}
	
	public RoleRequis getIn() {
		return this.in;
	}
	
	public RoleFournis GetOut() {
		return this.out;
	}
	
	public void setPortIn(PortFournisComposant portFournis) {
		in.getAttachement().add(portFournis);
	}
	
	public void setPortOut(PortRequisComposant portRequis) {
		out.getAttachement().add(portRequis);
	}
	
	public void glue(Client client) {
		System.out.println("numero client reçu sur le connecteur database2Connection et transmis au manager");
		ConnectionManager c=(ConnectionManager)out.getAttachement().get(0).getComposant();
		c.reponseDatabse(client.getName());
	}
	

}
