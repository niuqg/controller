package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetSource;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface EthernetMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ethernet-match-fields")
    ;

    /**
      Ethernet destination address.
    **/
    EthernetDestination getEthernetDestination();
    
    /**
      Ethernet source address.
    **/
    EthernetSource getEthernetSource();
    
    /**
      Ethernet frame type.
    **/
    EthernetType getEthernetType();

}

