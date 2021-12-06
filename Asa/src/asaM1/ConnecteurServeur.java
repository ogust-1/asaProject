package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurServeur extends ConnecteurImpl {
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleRequis in;
	private RoleFournis out;
	private Glue glue;
	
	public ConnecteurServeur () {
		super();
		this.setName("Connecteur_to_database");
		in = factory.createRoleRequis();
		out = factory.createRoleFournis();
		glue = factory.createGlue();
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