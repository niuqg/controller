package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.group.action._case;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupAction
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.group.action._case.GroupAction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","group-action")
    ;

    /**
    **/
    String getGroup();
    
    /**
    **/
    Long getGroupId();

}

