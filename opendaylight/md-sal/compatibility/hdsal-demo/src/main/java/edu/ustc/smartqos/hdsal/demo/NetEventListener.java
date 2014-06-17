package edu.ustc.smartqos.hdsal.demo;

import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.OpendaylightInventoryListener;

import edu.ustc.qos.dao.Net_EventDao;
import edu.ustc.qos.databasemanager.Net_Event;

public class NetEventListener implements OpendaylightInventoryListener {
    private Net_Event netLog = new Net_Event();
    private Net_EventDao netDao = new Net_EventDao();
	@Override
	public void onNodeConnectorRemoved(NodeConnectorRemoved arg0) {
		// TODO Auto-generated method stub
		netLog.setEvent_Type(0);
		netLog.setEvent_Description("removing node connector :"+arg0.getNodeConnectorRef().getValue());
		try {
			netDao.addEvent(netLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onNodeConnectorUpdated(NodeConnectorUpdated arg0) {
		// TODO Auto-generated method stub
		netLog.setEvent_Type(0);
		netLog.setEvent_Description("updating node connector : {}."+arg0.getNodeConnectorRef().getValue());
		try {
			netDao.addEvent(netLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onNodeRemoved(NodeRemoved arg0) {
		// TODO Auto-generated method stub
		netLog.setEvent_Type(0);
		netLog.setEvent_Description("removing node : {}"+arg0.getNodeRef().getValue());
		try {
			netDao.addEvent(netLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onNodeUpdated(NodeUpdated arg0) {
		// TODO Auto-generated method stub
		netLog.setEvent_Type(0);
		netLog.setEvent_Description("updating node :{}"+arg0.getNodeRef().getValue());
		try {
			netDao.addEvent(netLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
