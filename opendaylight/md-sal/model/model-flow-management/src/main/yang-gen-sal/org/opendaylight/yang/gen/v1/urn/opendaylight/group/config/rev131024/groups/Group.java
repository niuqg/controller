package org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups.GroupKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.GroupEntry;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Group
    extends
    ChildOf<Groups>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups.Group>,
    GroupEntry,
    Identifiable<GroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:config","2013-10-24","group")
    ;

    /**
    **/
    Long getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    GroupKey getKey();

}

