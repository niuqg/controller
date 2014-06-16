package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups.Group;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface Groups
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","groups")
    ;

    List<Group> getGroup();

}

