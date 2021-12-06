package asaM1;

import asa.*;
import asa.impl.*;

public class Serveur extends ConfigurationImpl{

	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortRequisComposant sRequis;
	private PortFournisComposant sFournis;
	private PortRequisConfiguration out;
	private PortFournisConfiguration in;
	
	
	
	public Serveur () {
		super();
		this.setName("Serveur");
		sRequis=factory.createPortRequisComposant();
		sFournis=factory.createPortFournisComposant();
		in=factory.createPortFournisConfiguration();
		out=factory.createPortRequisConfiguration();
		
	}

}
