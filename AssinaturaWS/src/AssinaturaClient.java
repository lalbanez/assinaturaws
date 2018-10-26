import java.rmi.RemoteException;
import java.sql.SQLException;

import DefaultNamespace.AssinaturaProxy;

public class AssinaturaClient {

	public static void main(String[] args) throws SQLException, RemoteException {
		AssinaturaProxy proxy = new AssinaturaProxy();
		final String XML_ESOCIAL = "<eSocial\r\n" + 
				"	xmlns=\"http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02\">\r\n" + 
				"	<evtInfoEmpregador\r\n" + 
				"		Id=\"ID1090412130000002018090410324100002\">\r\n" + 
				"		<ideEvento>\r\n" + 
				"			<tpAmb>2</tpAmb>\r\n" + 
				"			<procEmi>1</procEmi>\r\n" + 
				"			<verProc>2.4.02 Beta</verProc>\r\n" + 
				"		</ideEvento>\r\n" + 
				"		<ideEmpregador>\r\n" + 
				"			<tpInsc>1</tpInsc>\r\n" + 
				"			<nrInsc>09041213</nrInsc>\r\n" + 
				"		</ideEmpregador>\r\n" + 
				"		<infoEmpregador>\r\n" + 
				"			<inclusao>\r\n" + 
				"				<idePeriodo>\r\n" + 
				"					<iniValid>2018-05</iniValid>\r\n" + 
				"				</idePeriodo>\r\n" + 
				"				<infoCadastro>\r\n" + 
				"					<nmRazao>SÃO PAULO PREVIDÊNCIA</nmRazao>\r\n" + 
				"					<classTrib>85</classTrib>\r\n" + 
				"					<natJurid>1112</natJurid>\r\n"+
				"					<indCoop>0</indCoop>\r\n"+
				"					<indConstr>0</indConstr>\r\n"+
				"					<indDesFolha>0</indDesFolha>\r\n" +
				"  					<indOptRegEletron>1</indOptRegEletron>\r\n" +
				"					<indEntEd>N</indEntEd>\r\n"+
				"					<indEtt>N</indEtt>\r\n" + 
				"					<contato>\r\n" + 
				"						<nmCtt>JOSE ROBERTO DE MORAES</nmCtt>\r\n" + 
				"						<cpfCtt>51907488804</cpfCtt>\r\n" +
				"						<foneCel>11958465954</foneCel>\r\n" + 
				"					</contato>\r\n" + 
				"					<infoComplementares>\r\n" + 
				"						<situacaoPJ>\r\n" + 
				"							<indSitPJ>0</indSitPJ>\r\n" + 
				"						</situacaoPJ>\r\n" + 
				"					</infoComplementares>\r\n" + 
				"				</infoCadastro>\r\n" + 
				"			</inclusao>\r\n" + 
				"		</infoEmpregador>\r\n" + 
				"	</evtInfoEmpregador>\r\n" + 
				"</eSocial>"; 
//		Assinatura assinatura = new Assinatura();
//		assinatura.getAssinatura(XML_ESOCIAL);
		long tmpInicio = System.currentTimeMillis();
		proxy.setEndpoint("http://localhost:8085/AssinaturaWS/services/Assinatura");
		System.out.println(proxy.getAssinatura(XML_ESOCIAL));
		long tmpFim = System.currentTimeMillis();
		System.out.println(tmpFim-tmpInicio);
	}
}
