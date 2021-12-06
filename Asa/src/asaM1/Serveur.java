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
	
	//private ConnecteurDatabase2Security dataBase2Security;
	//private ConnecteurConnection2Database connection2DataBase;
	//private ConnecteurConnection2Security connection2Security;
	
	private ConnecteurServeur dataBase2Security;
	private ConnecteurServeur dataBase2Connection;
	private ConnecteurServeur security2DataBase;
	private ConnecteurServeur security2Connection;
	private ConnecteurServeur connection2Security;
	private ConnecteurServeur connection2DataBase;
	
	
	
	public Serveur () {
		super();
		this.setName("Serveur");
		inExt=factory.createPortRequisComposant();
		outExt=factory.createPortFournisComposant();
		out=factory.createPortFournisConfiguration();
		in=factory.createPortRequisConfiguration();
		
		
		dataBase=new Database();
		securityManager= new SecurityManager();
		connectionManager=new ConnectionManager();
		this.getComposant().add(connectionManager);
		this.getComposant().add(securityManager);
		this.getComposant().add(dataBase);
		
		/*ataBase2Security=new ConnecteurDatabase2Security();
		connection2DataBase=new ConnecteurConnection2Database();
		connection2Security=new ConnecteurConnection2Security();*/
		
		dataBase2Security=new ConnecteurServeur();
		dataBase2Connection=new ConnecteurServeur();
		connection2DataBase=new ConnecteurServeur();
		connection2Security=new ConnecteurServeur();
		security2Connection= new ConnecteurServeur();
		security2DataBase= new ConnecteurServeur();
		
		//connectiondes composants internes
		dataBase.setRoleIn(dataBase2Security.GetOut());
		dataBase.setRoleOut(dataBase2Security.getIn());
		dataBase.setRoleIn(dataBase2Connection.GetOut());
		dataBase.setRoleOut(dataBase2Connection.getIn());
		
		securityManager.setRoleIn(security2DataBase.GetOut());
		securityManager.setRoleOut(security2DataBase.getIn());
		securityManager.setRoleIn(security2Connection.GetOut());
		securityManager.setRoleOut(security2Connection.getIn());
		
		connectionManager.setRoleIn(connection2Security.GetOut());
		connectionManager.setRoleOut(connection2Security.getIn());
		connectionManager.setRoleIn(connection2DataBase.GetOut());
		connectionManager.setRoleOut(connection2DataBase.getIn());		
		
		//connexion du serveur
		in.getBinding().add(connectionManager.getOut());
		out.getBinding().add(connectionManager.getIn());
		inExt.getBinding().add(out);
		outExt.getBinding().add(in);
		
	}
	
	public ConnecteurServeur getTest() {
		return this.dataBase2Security;
	}
	
	public Database getData() {
		return this.dataBase;
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

}
