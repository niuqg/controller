package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface ActionList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","action-list")
    ;

    List<Action> getAction();

}

