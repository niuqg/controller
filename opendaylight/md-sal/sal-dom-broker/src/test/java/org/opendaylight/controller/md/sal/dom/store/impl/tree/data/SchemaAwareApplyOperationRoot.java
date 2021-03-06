/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.sal.dom.store.impl.tree.data;

import org.opendaylight.yangtools.yang.data.api.schema.ContainerNode;
import org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode;
import org.opendaylight.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeBuilder;
import org.opendaylight.yangtools.yang.data.impl.schema.builder.impl.ImmutableContainerNodeBuilder;
import org.opendaylight.yangtools.yang.model.api.ContainerSchemaNode;
import org.opendaylight.yangtools.yang.model.api.SchemaContext;

public class SchemaAwareApplyOperationRoot extends SchemaAwareApplyOperation.DataNodeContainerModificationStrategy<ContainerSchemaNode> {
    private final SchemaContext context;

    public SchemaAwareApplyOperationRoot(final SchemaContext context) {
        super(context,ContainerNode.class);
        this.context = context;
    }

    public SchemaContext getContext() {
        return context;
    }

    @Override
    public String toString() {
        return "SchemaAwareApplyOperationRoot [context=" + context + "]";
    }

    @Override
    @SuppressWarnings("rawtypes")
    protected DataContainerNodeBuilder createBuilder(NormalizedNode<?, ?> original) {
        return ImmutableContainerNodeBuilder.create((ContainerNode) original);
    }
}
