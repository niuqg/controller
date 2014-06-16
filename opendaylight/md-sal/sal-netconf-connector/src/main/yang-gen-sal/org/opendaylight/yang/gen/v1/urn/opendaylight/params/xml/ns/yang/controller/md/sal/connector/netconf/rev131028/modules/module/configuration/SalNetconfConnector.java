package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.BossThreadGroup;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.ClientDispatcher;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.DomRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.EventExecutor;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.WorkerThreadGroup;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;


public interface SalNetconfConnector
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:connector:netconf","2013-10-28","sal-netconf-connector")
    ;

    /**
    **/
    String getAddress();
    
    /**
      Timeout in milliseconds to wait between connection attempts.
    **/
    Integer getBetweenAttemptsTimeoutMillis();
    
    BossThreadGroup getBossThreadGroup();
    
    ClientDispatcher getClientDispatcher();
    
    /**
      Specifies timeout in milliseconds after which connection must be established.
    **/
    Long getConnectionTimeoutMillis();
    
    DomRegistry getDomRegistry();
    
    EventExecutor getEventExecutor();
    
    /**
      Maximum number of connection retries. Non positive value or null is interpreted as infinity.
    **/
    Long getMaxConnectionAttempts();
    
    /**
    **/
    String getPassword();
    
    /**
    **/
    Long getPort();
    
    /**
    **/
    Boolean isTcpOnly();
    
    /**
    **/
    String getUsername();
    
    WorkerThreadGroup getWorkerThreadGroup();

}

