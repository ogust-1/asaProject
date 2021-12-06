package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.impl.ComposantImpl;

public class SecurityManager extends ComposantImpl {
	
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortRequisComposant in;
	private PortFournisComposant out;
	
	public SecurityManager() {
		super();
		this.setName("SecurityManager");
		
		in=factory.createPortRequisComposant();
		out=factory.createPortFournisComposant();
	}
	

}
