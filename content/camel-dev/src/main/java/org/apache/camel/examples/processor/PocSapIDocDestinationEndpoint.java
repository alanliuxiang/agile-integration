package org.apache.camel.examples.processor;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.examples.pojo.Poline;
import org.fusesource.camel.component.sap.model.idoc.IdocFactory;
import org.fusesource.camel.component.sap.model.idoc.Segment;
import org.fusesource.camel.component.sap.model.idoc.impl.DocumentImpl;
import org.fusesource.camel.component.sap.model.idoc.impl.SegmentImpl;

public class PocSapIDocDestinationEndpoint implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		//From Previous transform, mapping
		Poline poline = (Poline) exchange.getIn().getBody();
		
		DocumentImpl iDoc = (DocumentImpl)IdocFactory.eINSTANCE.createDocument();
		Segment segment =  IdocFactory.eINSTANCE.createSegment();
		iDoc.setRootSegment(segment);
		((SegmentImpl) segment).setDocument(iDoc);
		iDoc.setCreationDate(new Date());
		iDoc.setCreationTime(new Date());
		
		iDoc.setMessageType("EKSEKS01");
		iDoc.setRecipientPartnerNumber("QUICKCLNT");
		iDoc.setRecipientPartnerType("LS");
		iDoc.setSenderPartnerNumber("QUICKSTART");
		iDoc.setSenderPartnerType("LS");
		
		exchange.getOut().setBody(iDoc);
	}

}
