package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeaders;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class RemoveMeterInputBuilder {

    private MeterRef _meterRef;
    private Boolean _barrier;
    private String _containerName;
    private MeterFlags _flags;
    private MeterBandHeaders _meterBandHeaders;
    private MeterId _meterId;
    private String _meterName;
    private NodeRef _node;
    private Uri _transactionUri;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>> augmentation = new HashMap<>();

    public RemoveMeterInputBuilder() {
    } 
    
    
    public RemoveMeterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter arg) {
        this._barrier = arg.isBarrier();
        this._containerName = arg.getContainerName();
        this._flags = arg.getFlags();
        this._meterBandHeaders = arg.getMeterBandHeaders();
        this._meterId = arg.getMeterId();
        this._meterName = arg.getMeterName();
    }
    
    public RemoveMeterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }
    
    public RemoveMeterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter) {
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).isBarrier();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getContainerName();
            this._flags = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getFlags();
            this._meterBandHeaders = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterBandHeaders();
            this._meterId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterId();
            this._meterName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata) {
            this._transactionUri = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata)arg).getTransactionUri();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata] \n" +
              "but was: " + arg
            );
        }
    }

    public MeterRef getMeterRef() {
        return _meterRef;
    }
    
    public Boolean isBarrier() {
        return _barrier;
    }
    
    public String getContainerName() {
        return _containerName;
    }
    
    public MeterFlags getFlags() {
        return _flags;
    }
    
    public MeterBandHeaders getMeterBandHeaders() {
        return _meterBandHeaders;
    }
    
    public MeterId getMeterId() {
        return _meterId;
    }
    
    public String getMeterName() {
        return _meterName;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RemoveMeterInputBuilder setMeterRef(MeterRef value) {
    
        this._meterRef = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setBarrier(Boolean value) {
    
        this._barrier = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setContainerName(String value) {
    
        this._containerName = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setFlags(MeterFlags value) {
    
        this._flags = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setMeterBandHeaders(MeterBandHeaders value) {
    
        this._meterBandHeaders = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setMeterId(MeterId value) {
    
        this._meterId = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setMeterName(String value) {
    
        this._meterName = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public RemoveMeterInputBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public RemoveMeterInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RemoveMeterInput build() {
        return new RemoveMeterInputImpl(this);
    }

    private static final class RemoveMeterInputImpl implements RemoveMeterInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput.class;
        }

        private final MeterRef _meterRef;
        private final Boolean _barrier;
        private final String _containerName;
        private final MeterFlags _flags;
        private final MeterBandHeaders _meterBandHeaders;
        private final MeterId _meterId;
        private final String _meterName;
        private final NodeRef _node;
        private final Uri _transactionUri;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>> augmentation;

        private RemoveMeterInputImpl(RemoveMeterInputBuilder builder) {
            this._meterRef = builder.getMeterRef();
            this._barrier = builder.isBarrier();
            this._containerName = builder.getContainerName();
            this._flags = builder.getFlags();
            this._meterBandHeaders = builder.getMeterBandHeaders();
            this._meterId = builder.getMeterId();
            this._meterName = builder.getMeterName();
            this._node = builder.getNode();
            this._transactionUri = builder.getTransactionUri();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public MeterRef getMeterRef() {
            return _meterRef;
        }
        
        @Override
        public Boolean isBarrier() {
            return _barrier;
        }
        
        @Override
        public String getContainerName() {
            return _containerName;
        }
        
        @Override
        public MeterFlags getFlags() {
            return _flags;
        }
        
        @Override
        public MeterBandHeaders getMeterBandHeaders() {
            return _meterBandHeaders;
        }
        
        @Override
        public MeterId getMeterId() {
            return _meterId;
        }
        
        @Override
        public String getMeterName() {
            return _meterName;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public Uri getTransactionUri() {
            return _transactionUri;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meterRef == null) ? 0 : _meterRef.hashCode());
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_flags == null) ? 0 : _flags.hashCode());
            result = prime * result + ((_meterBandHeaders == null) ? 0 : _meterBandHeaders.hashCode());
            result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
            result = prime * result + ((_meterName == null) ? 0 : _meterName.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_transactionUri == null) ? 0 : _transactionUri.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            RemoveMeterInputImpl other = (RemoveMeterInputImpl) obj;
            if (_meterRef == null) {
                if (other._meterRef != null) {
                    return false;
                }
            } else if(!_meterRef.equals(other._meterRef)) {
                return false;
            }
            if (_barrier == null) {
                if (other._barrier != null) {
                    return false;
                }
            } else if(!_barrier.equals(other._barrier)) {
                return false;
            }
            if (_containerName == null) {
                if (other._containerName != null) {
                    return false;
                }
            } else if(!_containerName.equals(other._containerName)) {
                return false;
            }
            if (_flags == null) {
                if (other._flags != null) {
                    return false;
                }
            } else if(!_flags.equals(other._flags)) {
                return false;
            }
            if (_meterBandHeaders == null) {
                if (other._meterBandHeaders != null) {
                    return false;
                }
            } else if(!_meterBandHeaders.equals(other._meterBandHeaders)) {
                return false;
            }
            if (_meterId == null) {
                if (other._meterId != null) {
                    return false;
                }
            } else if(!_meterId.equals(other._meterId)) {
                return false;
            }
            if (_meterName == null) {
                if (other._meterName != null) {
                    return false;
                }
            } else if(!_meterName.equals(other._meterName)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_transactionUri == null) {
                if (other._transactionUri != null) {
                    return false;
                }
            } else if(!_transactionUri.equals(other._transactionUri)) {
                return false;
            }
            if (augmentation == null) {
                if (other.augmentation != null) {
                    return false;
                }
            } else if(!augmentation.equals(other.augmentation)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("RemoveMeterInput [");
            boolean first = true;
        
            if (_meterRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterRef=");
                builder.append(_meterRef);
             }
            if (_barrier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_barrier=");
                builder.append(_barrier);
             }
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
             }
            if (_flags != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flags=");
                builder.append(_flags);
             }
            if (_meterBandHeaders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandHeaders=");
                builder.append(_meterBandHeaders);
             }
            if (_meterId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterId=");
                builder.append(_meterId);
             }
            if (_meterName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterName=");
                builder.append(_meterName);
             }
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
             }
            if (_transactionUri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionUri=");
                builder.append(_transactionUri);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
