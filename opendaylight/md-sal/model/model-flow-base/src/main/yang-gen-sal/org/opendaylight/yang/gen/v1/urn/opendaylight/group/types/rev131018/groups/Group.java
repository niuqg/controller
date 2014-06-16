package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups.GroupKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Group
    extends
    ChildOf<Groups>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups.Group>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group,
    Identifiable<GroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    GroupKey getKey();

}

