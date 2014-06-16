package org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups.Group;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.GroupManagementData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Groups
    extends
    ChildOf<GroupManagementData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:config","2013-10-24","groups")
    ;

    List<Group> getGroup();

}

