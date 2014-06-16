/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.sal.connector.remoterpc.dto;

import org.zeromq.ZMQ;

/**
 * A class encapsulating {@link Message} and the {@link ZMQ.Socket} over which it is transmitted
 */
public class MessageWrapper {

  private Message _message;
  private ZMQ.Socket _receiveSocket;
  
  public MessageWrapper(Message message, ZMQ.Socket receiveSocket) {
    this._message = message;
    this._receiveSocket = receiveSocket;
  }

  public Message getMessage() {
    return _message;
  }

  public ZMQ.Socket getReceiveSocket() {
    return _receiveSocket;
  }
}
