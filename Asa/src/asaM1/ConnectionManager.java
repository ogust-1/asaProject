package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.impl.ComposantImpl;

public class ConnectionManager extends ComposantImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortRequisComposant in;
	private PortFournisComposant out;
	
	public ConnectionManager() {
		super();
		this.setName("connectionManager");
		out = factory.createPortFournisComposant();
		in = factory.createPortRequisComposant();
	}
}
