package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Packets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class GetNodeConnectorStatisticsOutputBuilder {

    private Bytes _bytes;
    private BigInteger _collisionCount;
    private Packets _packets;
    private BigInteger _receiveCrcError;
    private BigInteger _receiveDrops;
    private BigInteger _receiveErrors;
    private BigInteger _receiveFrameError;
    private BigInteger _receiveOverRunError;
    private BigInteger _transmitDrops;
    private BigInteger _transmitErrors;
    private Duration _duration;
    private TransactionId _transactionId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>> augmentation = new HashMap<>();

    public GetNodeConnectorStatisticsOutputBuilder() {
    } 
    
    public GetNodeConnectorStatisticsOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics arg) {
        this._bytes = arg.getBytes();
        this._collisionCount = arg.getCollisionCount();
        this._packets = arg.getPackets();
        this._receiveCrcError = arg.getReceiveCrcError();
        this._receiveDrops = arg.getReceiveDrops();
        this._receiveErrors = arg.getReceiveErrors();
        this._receiveFrameError = arg.getReceiveFrameError();
        this._receiveOverRunError = arg.getReceiveOverRunError();
        this._transmitDrops = arg.getTransmitDrops();
        this._transmitErrors = arg.getTransmitErrors();
        this._duration = arg.getDuration();
    }
    
    public GetNodeConnectorStatisticsOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration arg) {
        this._duration = arg.getDuration();
    }
    
    public GetNodeConnectorStatisticsOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics) {
            this._bytes = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getBytes();
            this._collisionCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getCollisionCount();
            this._packets = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getPackets();
            this._receiveCrcError = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getReceiveCrcError();
            this._receiveDrops = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getReceiveDrops();
            this._receiveErrors = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getReceiveErrors();
            this._receiveFrameError = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getReceiveFrameError();
            this._receiveOverRunError = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getReceiveOverRunError();
            this._transmitDrops = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getTransmitDrops();
            this._transmitErrors = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics)arg).getTransmitErrors();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration) {
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration)arg).getDuration();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics, org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public Bytes getBytes() {
        return _bytes;
    }
    
    public BigInteger getCollisionCount() {
        return _collisionCount;
    }
    
    public Packets getPackets() {
        return _packets;
    }
    
    public BigInteger getReceiveCrcError() {
        return _receiveCrcError;
    }
    
    public BigInteger getReceiveDrops() {
        return _receiveDrops;
    }
    
    public BigInteger getReceiveErrors() {
        return _receiveErrors;
    }
    
    public BigInteger getReceiveFrameError() {
        return _receiveFrameError;
    }
    
    public BigInteger getReceiveOverRunError() {
        return _receiveOverRunError;
    }
    
    public BigInteger getTransmitDrops() {
        return _transmitDrops;
    }
    
    public BigInteger getTransmitErrors() {
        return _transmitErrors;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GetNodeConnectorStatisticsOutputBuilder setBytes(Bytes value) {
    
        this._bytes = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setCollisionCount(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._collisionCount = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setPackets(Packets value) {
    
        this._packets = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setReceiveCrcError(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._receiveCrcError = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setReceiveDrops(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._receiveDrops = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setReceiveErrors(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._receiveErrors = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setReceiveFrameError(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._receiveFrameError = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setReceiveOverRunError(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._receiveOverRunError = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setTransmitDrops(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._transmitDrops = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setTransmitErrors(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._transmitErrors = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setDuration(Duration value) {
    
        this._duration = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public GetNodeConnectorStatisticsOutputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GetNodeConnectorStatisticsOutput build() {
        return new GetNodeConnectorStatisticsOutputImpl(this);
    }

    private static final class GetNodeConnectorStatisticsOutputImpl implements GetNodeConnectorStatisticsOutput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput.class;
        }

        private final Bytes _bytes;
        private final BigInteger _collisionCount;
        private final Packets _packets;
        private final BigInteger _receiveCrcError;
        private final BigInteger _receiveDrops;
        private final BigInteger _receiveErrors;
        private final BigInteger _receiveFrameError;
        private final BigInteger _receiveOverRunError;
        private final BigInteger _transmitDrops;
        private final BigInteger _transmitErrors;
        private final Duration _duration;
        private final TransactionId _transactionId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>> augmentation;

        private GetNodeConnectorStatisticsOutputImpl(GetNodeConnectorStatisticsOutputBuilder builder) {
            this._bytes = builder.getBytes();
            this._collisionCount = builder.getCollisionCount();
            this._packets = builder.getPackets();
            this._receiveCrcError = builder.getReceiveCrcError();
            this._receiveDrops = builder.getReceiveDrops();
            this._receiveErrors = builder.getReceiveErrors();
            this._receiveFrameError = builder.getReceiveFrameError();
            this._receiveOverRunError = builder.getReceiveOverRunError();
            this._transmitDrops = builder.getTransmitDrops();
            this._transmitErrors = builder.getTransmitErrors();
            this._duration = builder.getDuration();
            this._transactionId = builder.getTransactionId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Bytes getBytes() {
            return _bytes;
        }
        
        @Override
        public BigInteger getCollisionCount() {
            return _collisionCount;
        }
        
        @Override
        public Packets getPackets() {
            return _packets;
        }
        
        @Override
        public BigInteger getReceiveCrcError() {
            return _receiveCrcError;
        }
        
        @Override
        public BigInteger getReceiveDrops() {
            return _receiveDrops;
        }
        
        @Override
        public BigInteger getReceiveErrors() {
            return _receiveErrors;
        }
        
        @Override
        public BigInteger getReceiveFrameError() {
            return _receiveFrameError;
        }
        
        @Override
        public BigInteger getReceiveOverRunError() {
            return _receiveOverRunError;
        }
        
        @Override
        public BigInteger getTransmitDrops() {
            return _transmitDrops;
        }
        
        @Override
        public BigInteger getTransmitErrors() {
            return _transmitErrors;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bytes == null) ? 0 : _bytes.hashCode());
            result = prime * result + ((_collisionCount == null) ? 0 : _collisionCount.hashCode());
            result = prime * result + ((_packets == null) ? 0 : _packets.hashCode());
            result = prime * result + ((_receiveCrcError == null) ? 0 : _receiveCrcError.hashCode());
            result = prime * result + ((_receiveDrops == null) ? 0 : _receiveDrops.hashCode());
            result = prime * result + ((_receiveErrors == null) ? 0 : _receiveErrors.hashCode());
            result = prime * result + ((_receiveFrameError == null) ? 0 : _receiveFrameError.hashCode());
            result = prime * result + ((_receiveOverRunError == null) ? 0 : _receiveOverRunError.hashCode());
            result = prime * result + ((_transmitDrops == null) ? 0 : _transmitDrops.hashCode());
            result = prime * result + ((_transmitErrors == null) ? 0 : _transmitErrors.hashCode());
            result = prime * result + ((_duration == null) ? 0 : _duration.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
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
            GetNodeConnectorStatisticsOutputImpl other = (GetNodeConnectorStatisticsOutputImpl) obj;
            if (_bytes == null) {
                if (other._bytes != null) {
                    return false;
                }
            } else if(!_bytes.equals(other._bytes)) {
                return false;
            }
            if (_collisionCount == null) {
                if (other._collisionCount != null) {
                    return false;
                }
            } else if(!_collisionCount.equals(other._collisionCount)) {
                return false;
            }
            if (_packets == null) {
                if (other._packets != null) {
                    return false;
                }
            } else if(!_packets.equals(other._packets)) {
                return false;
            }
            if (_receiveCrcError == null) {
                if (other._receiveCrcError != null) {
                    return false;
                }
            } else if(!_receiveCrcError.equals(other._receiveCrcError)) {
                return false;
            }
            if (_receiveDrops == null) {
                if (other._receiveDrops != null) {
                    return false;
                }
            } else if(!_receiveDrops.equals(other._receiveDrops)) {
                return false;
            }
            if (_receiveErrors == null) {
                if (other._receiveErrors != null) {
                    return false;
                }
            } else if(!_receiveErrors.equals(other._receiveErrors)) {
                return false;
            }
            if (_receiveFrameError == null) {
                if (other._receiveFrameError != null) {
                    return false;
                }
            } else if(!_receiveFrameError.equals(other._receiveFrameError)) {
                return false;
            }
            if (_receiveOverRunError == null) {
                if (other._receiveOverRunError != null) {
                    return false;
                }
            } else if(!_receiveOverRunError.equals(other._receiveOverRunError)) {
                return false;
            }
            if (_transmitDrops == null) {
                if (other._transmitDrops != null) {
                    return false;
                }
            } else if(!_transmitDrops.equals(other._transmitDrops)) {
                return false;
            }
            if (_transmitErrors == null) {
                if (other._transmitErrors != null) {
                    return false;
                }
            } else if(!_transmitErrors.equals(other._transmitErrors)) {
                return false;
            }
            if (_duration == null) {
                if (other._duration != null) {
                    return false;
                }
            } else if(!_duration.equals(other._duration)) {
                return false;
            }
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
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
            StringBuilder builder = new StringBuilder("GetNodeConnectorStatisticsOutput [");
            boolean first = true;
        
            if (_bytes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bytes=");
                builder.append(_bytes);
             }
            if (_collisionCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_collisionCount=");
                builder.append(_collisionCount);
             }
            if (_packets != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packets=");
                builder.append(_packets);
             }
            if (_receiveCrcError != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_receiveCrcError=");
                builder.append(_receiveCrcError);
             }
            if (_receiveDrops != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_receiveDrops=");
                builder.append(_receiveDrops);
             }
            if (_receiveErrors != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_receiveErrors=");
                builder.append(_receiveErrors);
             }
            if (_receiveFrameError != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_receiveFrameError=");
                builder.append(_receiveFrameError);
             }
            if (_receiveOverRunError != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_receiveOverRunError=");
                builder.append(_receiveOverRunError);
             }
            if (_transmitDrops != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transmitDrops=");
                builder.append(_transmitDrops);
             }
            if (_transmitErrors != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transmitErrors=");
                builder.append(_transmitErrors);
             }
            if (_duration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_duration=");
                builder.append(_duration);
             }
            if (_transactionId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionId=");
                builder.append(_transactionId);
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
