package org.apache.camel.examples;

import org.fusesource.camel.component.sap.model.idoc.Document;
import org.fusesource.camel.component.sap.model.idoc.IdocFactory;
import org.fusesource.camel.component.sap.model.idoc.Segment;

public class Tmp {

	public static void main(String[] args) {


Document document = IdocFactory.eINSTANCE.createDocument();
		
		document.setMessageType("EKSEKS01");
		document.setRecipientPartnerNumber("QUICKCLNT");
		document.setRecipientPartnerType("LS");
		document.setSenderPartnerNumber("QUICKSTART");
		document.setSenderPartnerType("LS");

//		System.out.println(poline);
//		System.out.println(document);
	
		Segment rootSegment = document.getRootSegment();
		Segment EDI_DC40_Segment =  IdocFactory.eINSTANCE.createSegment();
		
		Segment E1CMCCO_Segment =  IdocFactory.eINSTANCE.createSegment();
		Segment E1PISTY_Segment =  IdocFactory.eINSTANCE.createSegment();
		rootSegment.getChildren().add(EDI_DC40_Segment);
		rootSegment.getChildren().add(E1CMCCO_Segment);
		rootSegment.getChildren().add(E1PISTY_Segment);

		Segment E1SCU_CRE_Segment = rootSegment.getChildren("EKSEKS01").add();}

}
