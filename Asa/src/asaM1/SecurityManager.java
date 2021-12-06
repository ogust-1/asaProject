package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
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
		
		in.setComposant(this);
		out.setComposant(this);

		this.getPortrequiscomposant().add(in);
		this.getPortfourniscomposant().add(out);
	}
	
	public PortRequisComposant getIn(){
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
	
	public void reponseDataBase(String s, Boolean b) {
		ConnecteurSecurity2Connection c= (ConnecteurSecurity2Connection)out.getAttachement().get(1).getConnecteur();
		c.glue(s,b);
		System.out.println("La db � envoy� sa reponse");
	}
	
	public void interrogationDataBase(Client c) {
		ConnecteurSecurity2Database co= (ConnecteurSecurity2Database)out.getAttachement().get(0).getConnecteur();
		co.glue( c);
		System.out.println("Verification aupr�s de la db que le client y a acc�s");
	}

}
