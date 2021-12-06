package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurToDatabase extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleFournis out;
	private RoleRequis in;
	private Glue glue;
	
	public ConnecteurToDatabase() {
		super();
		this.setName("Connecteur_to_database");
		in = factory.createRoleRequis();
		out = factory.createRoleFournis();
		glue = factory.createGlue();
	}
	
}
