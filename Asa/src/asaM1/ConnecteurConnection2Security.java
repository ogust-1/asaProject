package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurConnection2Security extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleFournis out;
	private RoleRequis in;
	private Glue glue;
	
	public ConnecteurConnection2Security() {
		super();
		this.setName("connecteur_to_security");
		glue = factory.createGlue();
		in = factory.createRoleRequis();
		out = factory.createRoleFournis();
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
}