package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class RPC extends ConnecteurImpl{
	
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleFournis out;
	private RoleRequis in;
	
	public RPC() {
		super();
		this.setName("RPC");
		out=factory.createRoleFournis();
		in=factory.createRoleRequis();
		this.getRolerequis().add(in);
		this.getRolefournis().add(out);
		in.setConnecteur(this);
		out.setConnecteur(this);
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
	
	public void deletePort() {
		out.getAttachement().remove(0);
		in.getAttachement().remove(0);
	}
	
	public void glue(Client cl, int i) {
		System.out.println("requete reçu dans le RPC");
		Serveur serveur=(Serveur)out.getAttachement().get(0).getComposant();
		serveur.request(cl, i);
	}
}
