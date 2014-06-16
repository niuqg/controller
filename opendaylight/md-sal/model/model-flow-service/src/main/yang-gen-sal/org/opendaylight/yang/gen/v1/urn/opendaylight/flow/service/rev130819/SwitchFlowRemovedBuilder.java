package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowTableRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.mod.removed.Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.RemovedReasonFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class SwitchFlowRemovedBuilder {

    private FlowTableRef _flowTable;
    private NodeRef _node;
    private BigInteger _byteCount;
    private Long _durationNsec;
    private Long _durationSec;
    private Match _match;
    private BigInteger _packetCount;
    private RemovedReasonFlags _removedReason;
    private FlowCookie _cookie;
    private Integer _hardTimeout;
    private Integer _idleTimeout;
    private Integer _priority;
    private Short _tableId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>> augmentation = new HashMap<>();

    public SwitchFlowRemovedBuilder() {
    } 
    
    public SwitchFlowRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlowRemoved arg) {
        this._flowTable = arg.getFlowTable();
        this._node = arg.getNode();
        this._byteCount = arg.getByteCount();
        this._durationNsec = arg.getDurationNsec();
        this._durationSec = arg.getDurationSec();
        this._match = arg.getMatch();
        this._packetCount = arg.getPacketCount();
        this._removedReason = arg.getRemovedReason();
        this._cookie = arg.getCookie();
        this._hardTimeout = arg.getHardTimeout();
        this._idleTimeout = arg.getIdleTimeout();
        this._priority = arg.getPriority();
        this._tableId = arg.getTableId();
    }
    
    public SwitchFlowRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved arg) {
        this._byteCount = arg.getByteCount();
        this._durationNsec = arg.getDurationNsec();
        this._durationSec = arg.getDurationSec();
        this._match = arg.getMatch();
        this._packetCount = arg.getPacketCount();
        this._removedReason = arg.getRemovedReason();
        this._cookie = arg.getCookie();
        this._hardTimeout = arg.getHardTimeout();
        this._idleTimeout = arg.getIdleTimeout();
        this._priority = arg.getPriority();
        this._tableId = arg.getTableId();
    }
    
    public SwitchFlowRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes arg) {
        this._cookie = arg.getCookie();
        this._hardTimeout = arg.getHardTimeout();
        this._idleTimeout = arg.getIdleTimeout();
        this._priority = arg.getPriority();
        this._tableId = arg.getTableId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlowRemoved</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes) {
            this._cookie = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getCookie();
            this._hardTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getHardTimeout();
            this._idleTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getIdleTimeout();
            this._priority = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getPriority();
            this._tableId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getTableId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved) {
            this._byteCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved)arg).getByteCount();
            this._durationNsec = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved)arg).getDurationNsec();
            this._durationSec = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved)arg).getDurationSec();
            this._match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved)arg).getMatch();
            this._packetCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved)arg).getPacketCount();
            this._removedReason = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved)arg).getRemovedReason();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlowRemoved) {
            this._flowTable = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlowRemoved)arg).getFlowTable();
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlowRemoved)arg).getNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlowRemoved] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowTableRef getFlowTable() {
        return _flowTable;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public BigInteger getByteCount() {
        return _byteCount;
    }
    
    public Long getDurationNsec() {
        return _durationNsec;
    }
    
    public Long getDurationSec() {
        return _durationSec;
    }
    
    public Match getMatch() {
        return _match;
    }
    
    public BigInteger getPacketCount() {
        return _packetCount;
    }
    
    public RemovedReasonFlags getRemovedReason() {
        return _removedReason;
    }
    
    public FlowCookie getCookie() {
        return _cookie;
    }
    
    public Integer getHardTimeout() {
        return _hardTimeout;
    }
    
    public Integer getIdleTimeout() {
        return _idleTimeout;
    }
    
    public Integer getPriority() {
        return _priority;
    }
    
    public Short getTableId() {
        return _tableId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SwitchFlowRemovedBuilder setFlowTable(FlowTableRef value) {
    
        this._flowTable = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setByteCount(BigInteger value) {
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
    
        this._byteCount = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setDurationNsec(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._durationNsec = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setDurationSec(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._durationSec = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setMatch(Match value) {
    
        this._match = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setPacketCount(BigInteger value) {
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
    
        this._packetCount = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setRemovedReason(RemovedReasonFlags value) {
    
        this._removedReason = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setCookie(FlowCookie value) {
    
        this._cookie = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setHardTimeout(Integer value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("0"), new Integer("65535")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._hardTimeout = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setIdleTimeout(Integer value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("0"), new Integer("65535")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._idleTimeout = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setPriority(Integer value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("0"), new Integer("65535")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._priority = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder setTableId(Short value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Short>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Short("0"), new Short("255")));
            for (Range<Short> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._tableId = value;
        return this;
    }
    
    public SwitchFlowRemovedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SwitchFlowRemoved build() {
        return new SwitchFlowRemovedImpl(this);
    }

    private static final class SwitchFlowRemovedImpl implements SwitchFlowRemoved {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved.class;
        }

        private final FlowTableRef _flowTable;
        private final NodeRef _node;
        private final BigInteger _byteCount;
        private final Long _durationNsec;
        private final Long _durationSec;
        private final Match _match;
        private final BigInteger _packetCount;
        private final RemovedReasonFlags _removedReason;
        private final FlowCookie _cookie;
        private final Integer _hardTimeout;
        private final Integer _idleTimeout;
        private final Integer _priority;
        private final Short _tableId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>> augmentation;

        private SwitchFlowRemovedImpl(SwitchFlowRemovedBuilder builder) {
            this._flowTable = builder.getFlowTable();
            this._node = builder.getNode();
            this._byteCount = builder.getByteCount();
            this._durationNsec = builder.getDurationNsec();
            this._durationSec = builder.getDurationSec();
            this._match = builder.getMatch();
            this._packetCount = builder.getPacketCount();
            this._removedReason = builder.getRemovedReason();
            this._cookie = builder.getCookie();
            this._hardTimeout = builder.getHardTimeout();
            this._idleTimeout = builder.getIdleTimeout();
            this._priority = builder.getPriority();
            this._tableId = builder.getTableId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public FlowTableRef getFlowTable() {
            return _flowTable;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public BigInteger getByteCount() {
            return _byteCount;
        }
        
        @Override
        public Long getDurationNsec() {
            return _durationNsec;
        }
        
        @Override
        public Long getDurationSec() {
            return _durationSec;
        }
        
        @Override
        public Match getMatch() {
            return _match;
        }
        
        @Override
        public BigInteger getPacketCount() {
            return _packetCount;
        }
        
        @Override
        public RemovedReasonFlags getRemovedReason() {
            return _removedReason;
        }
        
        @Override
        public FlowCookie getCookie() {
            return _cookie;
        }
        
        @Override
        public Integer getHardTimeout() {
            return _hardTimeout;
        }
        
        @Override
        public Integer getIdleTimeout() {
            return _idleTimeout;
        }
        
        @Override
        public Integer getPriority() {
            return _priority;
        }
        
        @Override
        public Short getTableId() {
            return _tableId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowTable == null) ? 0 : _flowTable.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_byteCount == null) ? 0 : _byteCount.hashCode());
            result = prime * result + ((_durationNsec == null) ? 0 : _durationNsec.hashCode());
            result = prime * result + ((_durationSec == null) ? 0 : _durationSec.hashCode());
            result = prime * result + ((_match == null) ? 0 : _match.hashCode());
            result = prime * result + ((_packetCount == null) ? 0 : _packetCount.hashCode());
            result = prime * result + ((_removedReason == null) ? 0 : _removedReason.hashCode());
            result = prime * result + ((_cookie == null) ? 0 : _cookie.hashCode());
            result = prime * result + ((_hardTimeout == null) ? 0 : _hardTimeout.hashCode());
            result = prime * result + ((_idleTimeout == null) ? 0 : _idleTimeout.hashCode());
            result = prime * result + ((_priority == null) ? 0 : _priority.hashCode());
            result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
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
            SwitchFlowRemovedImpl other = (SwitchFlowRemovedImpl) obj;
            if (_flowTable == null) {
                if (other._flowTable != null) {
                    return false;
                }
            } else if(!_flowTable.equals(other._flowTable)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_byteCount == null) {
                if (other._byteCount != null) {
                    return false;
                }
            } else if(!_byteCount.equals(other._byteCount)) {
                return false;
            }
            if (_durationNsec == null) {
                if (other._durationNsec != null) {
                    return false;
                }
            } else if(!_durationNsec.equals(other._durationNsec)) {
                return false;
            }
            if (_durationSec == null) {
                if (other._durationSec != null) {
                    return false;
                }
            } else if(!_durationSec.equals(other._durationSec)) {
                return false;
            }
            if (_match == null) {
                if (other._match != null) {
                    return false;
                }
            } else if(!_match.equals(other._match)) {
                return false;
            }
            if (_packetCount == null) {
                if (other._packetCount != null) {
                    return false;
                }
            } else if(!_packetCount.equals(other._packetCount)) {
                return false;
            }
            if (_removedReason == null) {
                if (other._removedReason != null) {
                    return false;
                }
            } else if(!_removedReason.equals(other._removedReason)) {
                return false;
            }
            if (_cookie == null) {
                if (other._cookie != null) {
                    return false;
                }
            } else if(!_cookie.equals(other._cookie)) {
                return false;
            }
            if (_hardTimeout == null) {
                if (other._hardTimeout != null) {
                    return false;
                }
            } else if(!_hardTimeout.equals(other._hardTimeout)) {
                return false;
            }
            if (_idleTimeout == null) {
                if (other._idleTimeout != null) {
                    return false;
                }
            } else if(!_idleTimeout.equals(other._idleTimeout)) {
                return false;
            }
            if (_priority == null) {
                if (other._priority != null) {
                    return false;
                }
            } else if(!_priority.equals(other._priority)) {
                return false;
            }
            if (_tableId == null) {
                if (other._tableId != null) {
                    return false;
                }
            } else if(!_tableId.equals(other._tableId)) {
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
            StringBuilder builder = new StringBuilder("SwitchFlowRemoved [");
            boolean first = true;
        
            if (_flowTable != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowTable=");
                builder.append(_flowTable);
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
            if (_byteCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteCount=");
                builder.append(_byteCount);
             }
            if (_durationNsec != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_durationNsec=");
                builder.append(_durationNsec);
             }
            if (_durationSec != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_durationSec=");
                builder.append(_durationSec);
             }
            if (_match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_match=");
                builder.append(_match);
             }
            if (_packetCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetCount=");
                builder.append(_packetCount);
             }
            if (_removedReason != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_removedReason=");
                builder.append(_removedReason);
             }
            if (_cookie != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_cookie=");
                builder.append(_cookie);
             }
            if (_hardTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hardTimeout=");
                builder.append(_hardTimeout);
             }
            if (_idleTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_idleTimeout=");
                builder.append(_idleTimeout);
             }
            if (_priority != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_priority=");
                builder.append(_priority);
             }
            if (_tableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableId=");
                builder.append(_tableId);
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
