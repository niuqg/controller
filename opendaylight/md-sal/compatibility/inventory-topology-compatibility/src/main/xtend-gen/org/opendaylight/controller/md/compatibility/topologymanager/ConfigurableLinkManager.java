/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.topologymanager;

import java.util.concurrent.ConcurrentMap;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.opendaylight.controller.topologymanager.TopologyUserLinkConfig;

@SuppressWarnings("all")
public abstract class ConfigurableLinkManager implements ITopologyManager {
  public final Status addUserLink(final TopologyUserLinkConfig link) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public final Status deleteUserLink(final String linkName) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public final ConcurrentMap<String,TopologyUserLinkConfig> getUserLinks() {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
}
