package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.vlan.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  VLAN id.
**/
public interface VlanId
    extends
    ChildOf<VlanMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.vlan.match.fields.VlanId>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","vlan-id")
    ;

    /**
    **/
    org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId getVlanId();
    
    /**
    **/
    Boolean isVlanIdPresent();

}

