package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
  ICMP code.
**/
public interface Icmpv4MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","icmpv4-match-fields")
    ;

    /**
    **/
    Short getIcmpv4Code();
    
    /**
      ICMP type.
    **/
    Short getIcmpv4Type();

}

