package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.routing.table.Routes;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface RpcRoutingTable
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:common","2013-10-28","rpc-routing-table")
    ;

    List<Routes> getRoutes();
    
    /**
    **/
    String getRoutingContext();

}

