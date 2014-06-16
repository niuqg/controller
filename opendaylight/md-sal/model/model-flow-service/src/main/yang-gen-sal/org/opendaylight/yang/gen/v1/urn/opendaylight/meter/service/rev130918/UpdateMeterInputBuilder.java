package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.UpdatedMeter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class UpdateMeterInputBuilder {

    private MeterRef _meterRef;
    private OriginalMeter _originalMeter;
    private UpdatedMeter _updatedMeter;
    private NodeRef _node;
    private Uri _transactionUri;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>> augmentation = new HashMap<>();

    public UpdateMeterInputBuilder() {
    } 
    
    public UpdateMeterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate arg) {
        this._originalMeter = arg.getOriginalMeter();
        this._updatedMeter = arg.getUpdatedMeter();
        this._node = arg.getNode();
    }
    
    public UpdateMeterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }
    
    public UpdateMeterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate) {
            this._originalMeter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate)arg).getOriginalMeter();
            this._updatedMeter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate)arg).getUpdatedMeter();
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
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata] \n" +
              "but was: " + arg
            );
        }
    }

    public MeterRef getMeterRef() {
        return _meterRef;
    }
    
    public OriginalMeter getOriginalMeter() {
        return _originalMeter;
    }
    
    public UpdatedMeter getUpdatedMeter() {
        return _updatedMeter;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public UpdateMeterInputBuilder setMeterRef(MeterRef value) {
    
        this._meterRef = value;
        return this;
    }
    
    public UpdateMeterInputBuilder setOriginalMeter(OriginalMeter value) {
    
        this._originalMeter = value;
        return this;
    }
    
    public UpdateMeterInputBuilder setUpdatedMeter(UpdatedMeter value) {
    
        this._updatedMeter = value;
        return this;
    }
    
    public UpdateMeterInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public UpdateMeterInputBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public UpdateMeterInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public UpdateMeterInput build() {
        return new UpdateMeterInputImpl(this);
    }

    private static final class UpdateMeterInputImpl implements UpdateMeterInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput.class;
        }

        private final MeterRef _meterRef;
        private final OriginalMeter _originalMeter;
        private final UpdatedMeter _updatedMeter;
        private final NodeRef _node;
        private final Uri _transactionUri;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>> augmentation;

        private UpdateMeterInputImpl(UpdateMeterInputBuilder builder) {
            this._meterRef = builder.getMeterRef();
            this._originalMeter = builder.getOriginalMeter();
            this._updatedMeter = builder.getUpdatedMeter();
            this._node = builder.getNode();
            this._transactionUri = builder.getTransactionUri();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>>singletonMap(e.getKey(), e.getValue());
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
        public OriginalMeter getOriginalMeter() {
            return _originalMeter;
        }
        
        @Override
        public UpdatedMeter getUpdatedMeter() {
            return _updatedMeter;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_originalMeter == null) ? 0 : _originalMeter.hashCode());
            result = prime * result + ((_updatedMeter == null) ? 0 : _updatedMeter.hashCode());
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
            UpdateMeterInputImpl other = (UpdateMeterInputImpl) obj;
            if (_meterRef == null) {
                if (other._meterRef != null) {
                    return false;
                }
            } else if(!_meterRef.equals(other._meterRef)) {
                return false;
            }
            if (_originalMeter == null) {
                if (other._originalMeter != null) {
                    return false;
                }
            } else if(!_originalMeter.equals(other._originalMeter)) {
                return false;
            }
            if (_updatedMeter == null) {
                if (other._updatedMeter != null) {
                    return false;
                }
            } else if(!_updatedMeter.equals(other._updatedMeter)) {
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
            StringBuilder builder = new StringBuilder("UpdateMeterInput [");
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
            if (_originalMeter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalMeter=");
                builder.append(_originalMeter);
             }
            if (_updatedMeter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_updatedMeter=");
                builder.append(_updatedMeter);
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
