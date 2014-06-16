package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.EtherType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface SetDlTypeAction
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","set-dl-type-action")
    ;

    /**
    **/
    EtherType getDlType();

}

