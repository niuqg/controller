/*
 * Copyright IBM Corporation, 2013.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package edu.ustc.qos.statusmanager;

import org.opendaylight.controller.sal.binding.api.AbstractBindingAwareProvider;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.NotificationProviderService;
import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.controller.sal.binding.api.data.DataProviderService;
import org.osgi.framework.BundleContext;

public class StatusManagerActivator extends AbstractBindingAwareProvider {
    private StatusProvider statusProvider;

    @Override
    public void onSessionInitiated(ProviderContext session) {
        final DataProviderService dps = session.getSALService(DataProviderService.class);
        final NotificationProviderService nps = session.getSALService(NotificationProviderService.class);
        statusProvider = new StatusProvider(dps);
        statusProvider.dataService=session.getSALService(DataBrokerService.class);
        statusProvider.start(nps, session);
    }

    @Override
    protected void stopImpl(BundleContext context) {
        if (statusProvider != null) {
            statusProvider.close();
            statusProvider = null;
        }
    }
}
