package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurDatabase2Security extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleRequis in;
	private RoleFournis out;

	
	public ConnecteurDatabase2Security(){
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
	
	public void glue(boolean b) {
		
		SecurityManager m=(SecurityManager)out.getAttachement().get(0).getComposant();
		if(b) {
		m.reponseDataBase("vous avez acc�s", b);}
		else {
			m.reponseDataBase("vous n'avez pas acc�s", b);
		}
	}
}
