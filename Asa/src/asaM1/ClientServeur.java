package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.*;

public class ClientServeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AsaPackage aPackage=AsaPackage.eINSTANCE;
		AsaFactory factory= aPackage.getAsaFactory();
		
		Configuration clientServer= factory.createConfiguration();
		PortRequisComposant sRequis= factory.createPortRequisComposant();
		PortFournisComposant sFournis = factory.createPortFournisComposant();
		PortRequisConfiguration sServeurIn= factory.createPortRequisConfiguration();
		PortFournisConfiguration sServeurOut=factory.createPortFournisConfiguration();
		

	}

}
