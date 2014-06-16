package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Action
    extends
    ChildOf<ActionList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action,
    Identifiable<ActionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","action")
    ;

    /**
    **/
    Integer getOrder();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    ActionKey getKey();

}

