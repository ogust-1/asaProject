package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurDatabase2SecurityManager extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleRequis in;
	private RoleFournis out;
	private Glue glue;
	
	public ConnecteurDatabase2SecurityManager() {
		super();
		this.setName("ConnecteurDatabase2SecurityManager");
		in=factory.createRoleRequis();
		out=factory.createRoleFournis();
		glue= factory.createGlue();
	}

}
