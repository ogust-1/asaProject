package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
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
		return this.getRolerequis().get(0);
	}
	
	public RoleFournis GetOut() {
		return this.getRolefournis().get(1);
	}
}
