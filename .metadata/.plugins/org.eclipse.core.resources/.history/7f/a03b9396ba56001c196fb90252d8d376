package asaM1;
import asa.AsaFactory;
import asa.AsaPackage;
import asa.impl.ComposantImpl;
import asa.impl.PortFournisComposantImpl;
import asa.*;

public class Client extends ComposantImpl {
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortFournisComposant port;
	
	public Client(String name) {
		super();
		this.setName(name);
		this.port = this.factory.createPortFournisComposant();
		this.port.setName(name + "_Send_Request");
	}
	
	public void sendRequest() {
		
	}
}
