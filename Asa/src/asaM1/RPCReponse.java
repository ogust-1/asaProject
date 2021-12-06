package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class RPCReponse extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleFournis out;
	private RoleRequis in;
	
	public RPCReponse() {
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
	
	public void glue(String name, String reponse) {
		Client cl=(Client)out.getAttachement().get(0).getComposant();
		cl.receiveRequest(name+reponse);
	}

}
