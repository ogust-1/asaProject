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
	
	public void glue(boolean b, boolean blackList) {
		System.out.println("reponse de la db re?ue sur databse2security et transmise au security");
		SecurityManager m=(SecurityManager)out.getAttachement().get(0).getComposant();
		if(blackList) {
			m.reponseDataBase("le client est blacklist", false, true);
		}
		else{if (b) {
			m.reponseDataBase("le client a acc?s", b, false);
		}else m.reponseDataBase("le client n'a pas acc?s", b, false);
	}
	}
}
