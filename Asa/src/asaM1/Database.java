package asaM1;

import asa.impl.*;
import asa.AsaFactory;
import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;

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
		this.getPortrequiscomposant().add(in);
		this.getPortfourniscomposant().add(out);
		
	}
	
	public PortRequisComposant getIn(){
		//return this.getPortrequiscomposant().get(0);
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
	
	
	
}
