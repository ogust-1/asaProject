package asaM1;

import asa.*;
import asa.impl.*;

public class Serveur extends ConfigurationImpl{
	
	private PortRequisComposantImpl sRequis;
	private PortFournisComposantImpl sFournis;
	private PortRequisConfigurationImpl sServeurOut;
	private PortFournisConfigurationImpl sServeurIn;
	
	
	
	public Serveur (String name) {
		super();
		this.setName(name);
		
		
	}

}
