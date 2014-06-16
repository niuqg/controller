/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import org.opendaylight.controller.sal.core.api.Broker.RpcRegistration;
import org.opendaylight.controller.sal.core.api.RpcImplementation;
import org.opendaylight.yangtools.yang.common.QName;

@SuppressWarnings("all")
public class RpcRegistrationWrapper implements RpcRegistration {
  private final RpcRegistration _delegate;
  
  public RpcRegistration getDelegate() {
    return this._delegate;
  }
  
  public RpcRegistrationWrapper(final RpcRegistration delegate) {
    this._delegate = delegate;
  }
  
  public RpcImplementation getInstance() {
    RpcRegistration _delegate = this.getDelegate();
    RpcImplementation _instance = _delegate.getInstance();
    return _instance;
  }
  
  public void close() {
    RpcRegistration _delegate = this.getDelegate();
    _delegate.close();
  }
  
  public QName getType() {
    RpcRegistration _delegate = this.getDelegate();
    QName _type = _delegate.getType();
    return _type;
  }
}
