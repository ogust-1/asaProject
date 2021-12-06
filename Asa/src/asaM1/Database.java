package asaM1;

import asa.impl.*;
import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;

public class Database extends ComposantImpl {
	
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	PortRequisComposant in;
	PortFournisComposant out;
	
	public Database() {
		super();
		this.setName("dataBase");
		in=factory.createPortRequisComposant();
		out=factory.createPortFournisComposant();
		
	}
	

}
