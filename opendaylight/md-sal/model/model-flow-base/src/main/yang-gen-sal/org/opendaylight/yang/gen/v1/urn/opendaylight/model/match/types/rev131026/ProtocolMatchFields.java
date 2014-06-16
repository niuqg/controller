package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.protocol.match.fields.Pbb;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface ProtocolMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","protocol-match-fields")
    ;

    /**
      BoS bit in the first MPLS shim header
    **/
    Short getMplsBos();
    
    /**
      Label in the first MPLS shim header
    **/
    Long getMplsLabel();
    
    /**
      TC in the first MPLS shim header
    **/
    Short getMplsTc();
    
    Pbb getPbb();

}

