package asaM1;

import asa.*;
import asa.impl.*;

public class Serveur extends ConfigurationImpl{

	AsaPackage aPackage=AsaPackage.eINSTANCE;
	AsaFactory factory= aPackage.getAsaFactory();
	
	private PortRequisComposant inExt;
	private PortFournisComposant outExt;
	private PortRequisConfiguration in;
	private PortFournisConfiguration out;
	
	private Database dataBase;
	private SecurityManager securityManager;
	private ConnectionManager connectionManager;
	
	private ConnecteurDatabase2Security dataBase2Security;
	private ConnecteurDatabase2Connection dataBase2Connection;
	private ConnecteurConnection2Database connection2DataBase;
	private ConnecteurConnection2Security connection2Security;
	private ConnecteurSecurity2Connection security2Connection;
	private ConnecteurSecurity2Database security2DataBase;
	
	
	
	
	public Serveur () {
		super();
		this.setName("Serveur");
		inExt=factory.createPortRequisComposant();
		outExt=factory.createPortFournisComposant();
		out=factory.createPortFournisConfiguration();
		in=factory.createPortRequisConfiguration();
		inExt.setComposant(this);
		outExt.setComposant(this);
		out.setConfiguration(this);
		in.setConfiguration(this);
		
		
		dataBase=new Database();
		securityManager= new SecurityManager();
		connectionManager=new ConnectionManager();
		this.getComposant().add(connectionManager);
		this.getComposant().add(securityManager);
		this.getComposant().add(dataBase);
		
		
		dataBase2Security=new ConnecteurDatabase2Security();
		dataBase2Connection=new ConnecteurDatabase2Connection();
		connection2DataBase=new ConnecteurConnection2Database();
		connection2Security=new ConnecteurConnection2Security();
		security2Connection= new ConnecteurSecurity2Connection();
		security2DataBase= new ConnecteurSecurity2Database();
		
		//connectiondes composants internes
		dataBase.setRoleIn(security2DataBase.GetOut());
		dataBase.setRoleOut(dataBase2Security.getIn());
		dataBase.setRoleIn(connection2DataBase.GetOut());
		dataBase.setRoleOut(dataBase2Connection.getIn());
		
		securityManager.setRoleIn(dataBase2Security.GetOut());
		securityManager.setRoleOut(security2DataBase.getIn());
		securityManager.setRoleIn(connection2Security.GetOut());
		securityManager.setRoleOut(security2Connection.getIn());
		
		connectionManager.setRoleIn(security2Connection.GetOut());
		connectionManager.setRoleOut(connection2Security.getIn());
		connectionManager.setRoleIn(dataBase2Connection.GetOut());
		connectionManager.setRoleOut(connection2DataBase.getIn());		
		
		//connexion du serveur
		in.getBinding().add(connectionManager.getOut());
		out.getBinding().add(connectionManager.getIn());
		inExt.getBinding().add(out);
		outExt.getBinding().add(in);
		
	}
	
	
	public void addClient(Client cl) {
		 this.dataBase.addClient(cl);;
	}
	
	public void addBlacklist(String name) {
		this.dataBase.addBlacklist(name);
		//this.answer(name, "reponse");
	}
	
	public ConnectionManager getCOnnection() {
		return this.connectionManager;
	}
	
	public PortRequisComposant getInExt() {
		return this.inExt;
	}
	
	public PortFournisComposant getOutExt() {
		return this.outExt;
	}
	
	public void setInExt(RoleFournis roleFournis) {
		inExt.getAttachement().add(roleFournis);
	}
	
	public void setOutExt(RoleRequis roleRequis) {
		outExt.getAttachement().add(roleRequis);
	}
	
	public void request(Client cl, int i) {
		System.out.println("requete re?u dans le serveur");
		ConnectionManager c=(ConnectionManager) out.getBinding().get(0).getComposant();
		c.questionSeveur(cl, i);
	}
	
	public void answer(String name, String reponse) {
		RPCReponse r=(RPCReponse)outExt.getAttachement().get(0).getConnecteur();
		r.glue(name,reponse);
	}
	


}
