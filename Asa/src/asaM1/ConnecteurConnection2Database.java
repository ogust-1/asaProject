package asaM1;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Glue;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.RoleFournis;
import asa.RoleRequis;
import asa.impl.ConnecteurImpl;

public class ConnecteurConnection2Database extends ConnecteurImpl{
	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private RoleFournis out;
	private RoleRequis in;
	
	public ConnecteurConnection2Database() {
		super();
		this.setName("Connecteur_to_database");
		in = factory.createRoleRequis();
		out = factory.createRoleFournis();
		in.setConnecteur(this);
		out.setConnecteur(this);
		this.getRolerequis().add(in);
		this.getRolefournis().add(out);
	}
	
	public RoleRequis getIn() {
		return this.in;
	}
	
	public RoleFournis GetOut() {
		return this.out;
	}
	
	public void setPortIn(PortFournisComposant portFournis) {
		in.getAttachement().add(portFournis);
	}
	
	public void setPortOut(PortRequisComposant portRequis) {
		out.getAttachement().add(portRequis);
	}
	
	public void glue(int i ) {
		System.out.println("requ?te re?u dans le connecteur Connection2database");
		Database d=(Database) out.getAttachement().get(0).getComposant();
		d.serviceConnection(i);
		
	}
	
}
