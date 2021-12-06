package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurToSecurity extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleFournis out;
	private RoleRequis in;
	private Glue glue;
	
	public ConnecteurToSecurity() {
		super();
		this.setName("connecteur_to_security");
		glue = factory.createGlue();
		in = factory.createRoleRequis();
		out = factory.createRoleFournis();
	}
}
