package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
  ICMP code.
**/
public interface Icmpv6MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","icmpv6-match-fields")
    ;

    /**
    **/
    Short getIcmpv6Code();
    
    /**
      ICMP type.
    **/
    Short getIcmpv6Type();

}

