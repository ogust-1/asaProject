package asaM1;
import asa.impl.ComposantImpl;
import asa.impl.PortFournisComposantImpl;
import asa.*;

public class Client extends ComposantImpl {
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortRequisComposant in;
	private PortFournisComposant out;
	
	public Client(String name) {
		super();
		this.name=name;
		in=factory.createPortRequisComposant();
		out=factory.createPortFournisComposant();
	}
	
	public PortRequisComposant getIn() {
		return this.in;
	}
	
	public PortFournisComposant getOut() {
		return this.out;
	}
	
	public void setRoleIn(RoleFournis roleFournis ) {
		in.getAttachement().add(roleFournis);
	}
	
	public void setRoleOut(RoleRequis roleRequis) {
		out.getAttachement().add(roleRequis);
	}
	
	//Fournis
	public void sendRequest(int i) {
		System.out.println("requete envoy? au RPC");
		RPC c=(RPC)out.getAttachement().get(0).getConnecteur();
		c.glue(this, i);
	}
	
	//Requis
	public void receiveRequest(String s){
		System.out.println("resultat re?u dans le client");
		System.out.println(s);
	}
}
