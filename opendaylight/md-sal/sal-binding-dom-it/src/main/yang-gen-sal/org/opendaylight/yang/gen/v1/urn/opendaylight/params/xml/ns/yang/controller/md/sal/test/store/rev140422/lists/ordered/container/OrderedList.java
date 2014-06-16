package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedListKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.OrderedContainer;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.NameValue;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface OrderedList
    extends
    ChildOf<OrderedContainer>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedList>,
    NameValue,
    Identifiable<OrderedListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:store","2014-04-22","ordered-list")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    OrderedListKey getKey();

}

