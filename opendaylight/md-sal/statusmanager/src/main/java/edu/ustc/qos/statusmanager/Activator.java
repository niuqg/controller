package edu.ustc.qos.statusmanager;

import java.util.Timer;

import org.apache.felix.dm.Component;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.opendaylight.controller.sal.core.ComponentActivatorAbstractBase;
import org.opendaylight.controller.statisticsmanager.IStatisticsManager;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.OpendaylightMeterStatisticsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Activator extends ComponentActivatorAbstractBase{
    private Timer timer=new Timer();
    protected static final Logger logger = LoggerFactory
            .getLogger(Activator.class);


    /**
     * Function that is used to communicatecreateContainerServiceDependency to dependency manager the
     * list of known implementations for services inside a container
     *
     *
     * @return An array containing all the CLASS objects that will be
     * instantiated in order to get an fully working implementation
     * Object
     */

    @Override
    public Object[] getImplementations() {
        Object[] res = { statusmanager.class };
        return res;
    }
    public void configureInstance(Component c, Object imp, String containerName) {
        if (imp.equals(statusmanager.class)) {
            c.setInterface(new String[] { CommandProvider.class.getName()}, null);
            c.add(createContainerServiceDependency(containerName).setService(ISwitchManager.class)
                    .setCallbacks("setSwitchManagerService", "unsetSwitchManagerService").setRequired(true));
            c.add(createContainerServiceDependency(containerName).setService(IStatisticsManager.class)
                    .setCallbacks("setStatisticsManagerService", "unsetStatisticsManagerService").setRequired(true));
            c.add(createContainerServiceDependency(containerName).setService(ITopologyManager.class)
                    .setCallbacks("setTopologyManagerService", "unsetTopologyManagerService").setRequired(true));
            c.add(createContainerServiceDependency(containerName).setService(OpendaylightMeterStatisticsService.class)
                    .setCallbacks("setOpendaylightMeterStatisticsService", "unsetOpendaylightMeterStatisticsService"));
            /*c.add(createContainerServiceDependency(containerName).setService(statusmanager.class)
                    .setCallbacks("setTimer", "unsetTimer").setRequired(true));*/
        }
    }
}
