package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.configuration.kitchen.service.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;


public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.configuration.kitchen.service.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:kitchen-service:impl","2014-01-31","rpc-registry")
    ;


}
