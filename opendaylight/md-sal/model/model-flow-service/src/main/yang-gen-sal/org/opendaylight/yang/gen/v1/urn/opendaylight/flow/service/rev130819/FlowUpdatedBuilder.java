package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowTableRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Instructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class FlowUpdatedBuilder {

    private FlowRef _flowRef;
    private FlowTableRef _flowTable;
    private Boolean _barrier;
    private Long _bufferId;
    private String _containerName;
    private FlowCookie _cookieMask;
    private FlowModFlags _flags;
    private String _flowName;
    private Boolean _installHw;
    private Instructions _instructions;
    private Match _match;
    private Long _outGroup;
    private BigInteger _outPort;
    private Boolean _strict;
    private FlowCookie _cookie;
    private Integer _hardTimeout;
    private Integer _idleTimeout;
    private Integer _priority;
    private Short _tableId;
    private NodeRef _node;
    private TransactionId _transactionId;
    private Uri _transactionUri;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>> augmentation = new HashMap<>();

    public FlowUpdatedBuilder() {
    } 
    
    public FlowUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlow arg) {
        this._flowTable = arg.getFlowTable();
        this._barrier = arg.isBarrier();
        this._bufferId = arg.getBufferId();
        this._containerName = arg.getContainerName();
        this._cookieMask = arg.getCookieMask();
        this._flags = arg.getFlags();
        this._flowName = arg.getFlowName();
        this._installHw = arg.isInstallHw();
        this._instructions = arg.getInstructions();
        this._match = arg.getMatch();
        this._outGroup = arg.getOutGroup();
        this._outPort = arg.getOutPort();
        this._strict = arg.isStrict();
        this._cookie = arg.getCookie();
        this._hardTimeout = arg.getHardTimeout();
        this._idleTimeout = arg.getIdleTimeout();
        this._priority = arg.getPriority();
        this._tableId = arg.getTableId();
        this._node = arg.getNode();
    }
    
    public FlowUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow arg) {
        this._barrier = arg.isBarrier();
        this._bufferId = arg.getBufferId();
        this._containerName = arg.getContainerName();
        this._cookieMask = arg.getCookieMask();
        this._flags = arg.getFlags();
        this._flowName = arg.getFlowName();
        this._installHw = arg.isInstallHw();
        this._instructions = arg.getInstructions();
        this._match = arg.getMatch();
        this._outGroup = arg.getOutGroup();
        this._outPort = arg.getOutPort();
        this._strict = arg.isStrict();
        this._cookie = arg.getCookie();
        this._hardTimeout = arg.getHardTimeout();
        this._idleTimeout = arg.getIdleTimeout();
        this._priority = arg.getPriority();
        this._tableId = arg.getTableId();
    }
    
    public FlowUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes arg) {
        this._cookie = arg.getCookie();
        this._hardTimeout = arg.getHardTimeout();
        this._idleTimeout = arg.getIdleTimeout();
        this._priority = arg.getPriority();
        this._tableId = arg.getTableId();
    }
    
    public FlowUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }
    
    public FlowUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public FlowUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlow</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata) {
            this._transactionUri = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata)arg).getTransactionUri();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlow) {
            this._flowTable = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlow)arg).getFlowTable();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow) {
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).isBarrier();
            this._bufferId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getBufferId();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getContainerName();
            this._cookieMask = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getCookieMask();
            this._flags = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getFlags();
            this._flowName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getFlowName();
            this._installHw = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).isInstallHw();
            this._instructions = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getInstructions();
            this._match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getMatch();
            this._outGroup = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getOutGroup();
            this._outPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getOutPort();
            this._strict = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).isStrict();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeFlow, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowRef getFlowRef() {
        return _flowRef;
    }
    
    public FlowTableRef getFlowTable() {
        return _flowTable;
    }
    
    public Boolean isBarrier() {
        return _barrier;
    }
    
    public Long getBufferId() {
        return _bufferId;
    }
    
    public String getContainerName() {
        return _containerName;
    }
    
    public FlowCookie getCookieMask() {
        return _cookieMask;
    }
    
    public FlowModFlags getFlags() {
        return _flags;
    }
    
    public String getFlowName() {
        return _flowName;
    }
    
    public Boolean isInstallHw() {
        return _installHw;
    }
    
    public Instructions getInstructions() {
        return _instructions;
    }
    
    public Match getMatch() {
        return _match;
    }
    
    public Long getOutGroup() {
        return _outGroup;
    }
    
    public BigInteger getOutPort() {
        return _outPort;
    }
    
    public Boolean isStrict() {
        return _strict;
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
    
    public NodeRef getNode() {
        return _node;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FlowUpdatedBuilder setFlowRef(FlowRef value) {
    
        this._flowRef = value;
        return this;
    }
    
    public FlowUpdatedBuilder setFlowTable(FlowTableRef value) {
    
        this._flowTable = value;
        return this;
    }
    
    public FlowUpdatedBuilder setBarrier(Boolean value) {
    
        this._barrier = value;
        return this;
    }
    
    public FlowUpdatedBuilder setBufferId(Long value) {
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
    
        this._bufferId = value;
        return this;
    }
    
    public FlowUpdatedBuilder setContainerName(String value) {
    
        this._containerName = value;
        return this;
    }
    
    public FlowUpdatedBuilder setCookieMask(FlowCookie value) {
    
        this._cookieMask = value;
        return this;
    }
    
    public FlowUpdatedBuilder setFlags(FlowModFlags value) {
    
        this._flags = value;
        return this;
    }
    
    public FlowUpdatedBuilder setFlowName(String value) {
    
        this._flowName = value;
        return this;
    }
    
    public FlowUpdatedBuilder setInstallHw(Boolean value) {
    
        this._installHw = value;
        return this;
    }
    
    public FlowUpdatedBuilder setInstructions(Instructions value) {
    
        this._instructions = value;
        return this;
    }
    
    public FlowUpdatedBuilder setMatch(Match value) {
    
        this._match = value;
        return this;
    }
    
    public FlowUpdatedBuilder setOutGroup(Long value) {
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
    
        this._outGroup = value;
        return this;
    }
    
    public FlowUpdatedBuilder setOutPort(BigInteger value) {
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
    
        this._outPort = value;
        return this;
    }
    
    public FlowUpdatedBuilder setStrict(Boolean value) {
    
        this._strict = value;
        return this;
    }
    
    public FlowUpdatedBuilder setCookie(FlowCookie value) {
    
        this._cookie = value;
        return this;
    }
    
    public FlowUpdatedBuilder setHardTimeout(Integer value) {
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
    
    public FlowUpdatedBuilder setIdleTimeout(Integer value) {
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
    
    public FlowUpdatedBuilder setPriority(Integer value) {
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
    
    public FlowUpdatedBuilder setTableId(Short value) {
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
    
    public FlowUpdatedBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public FlowUpdatedBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public FlowUpdatedBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public FlowUpdatedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FlowUpdated build() {
        return new FlowUpdatedImpl(this);
    }

    private static final class FlowUpdatedImpl implements FlowUpdated {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated.class;
        }

        private final FlowRef _flowRef;
        private final FlowTableRef _flowTable;
        private final Boolean _barrier;
        private final Long _bufferId;
        private final String _containerName;
        private final FlowCookie _cookieMask;
        private final FlowModFlags _flags;
        private final String _flowName;
        private final Boolean _installHw;
        private final Instructions _instructions;
        private final Match _match;
        private final Long _outGroup;
        private final BigInteger _outPort;
        private final Boolean _strict;
        private final FlowCookie _cookie;
        private final Integer _hardTimeout;
        private final Integer _idleTimeout;
        private final Integer _priority;
        private final Short _tableId;
        private final NodeRef _node;
        private final TransactionId _transactionId;
        private final Uri _transactionUri;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>> augmentation;

        private FlowUpdatedImpl(FlowUpdatedBuilder builder) {
            this._flowRef = builder.getFlowRef();
            this._flowTable = builder.getFlowTable();
            this._barrier = builder.isBarrier();
            this._bufferId = builder.getBufferId();
            this._containerName = builder.getContainerName();
            this._cookieMask = builder.getCookieMask();
            this._flags = builder.getFlags();
            this._flowName = builder.getFlowName();
            this._installHw = builder.isInstallHw();
            this._instructions = builder.getInstructions();
            this._match = builder.getMatch();
            this._outGroup = builder.getOutGroup();
            this._outPort = builder.getOutPort();
            this._strict = builder.isStrict();
            this._cookie = builder.getCookie();
            this._hardTimeout = builder.getHardTimeout();
            this._idleTimeout = builder.getIdleTimeout();
            this._priority = builder.getPriority();
            this._tableId = builder.getTableId();
            this._node = builder.getNode();
            this._transactionId = builder.getTransactionId();
            this._transactionUri = builder.getTransactionUri();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public FlowRef getFlowRef() {
            return _flowRef;
        }
        
        @Override
        public FlowTableRef getFlowTable() {
            return _flowTable;
        }
        
        @Override
        public Boolean isBarrier() {
            return _barrier;
        }
        
        @Override
        public Long getBufferId() {
            return _bufferId;
        }
        
        @Override
        public String getContainerName() {
            return _containerName;
        }
        
        @Override
        public FlowCookie getCookieMask() {
            return _cookieMask;
        }
        
        @Override
        public FlowModFlags getFlags() {
            return _flags;
        }
        
        @Override
        public String getFlowName() {
            return _flowName;
        }
        
        @Override
        public Boolean isInstallHw() {
            return _installHw;
        }
        
        @Override
        public Instructions getInstructions() {
            return _instructions;
        }
        
        @Override
        public Match getMatch() {
            return _match;
        }
        
        @Override
        public Long getOutGroup() {
            return _outGroup;
        }
        
        @Override
        public BigInteger getOutPort() {
            return _outPort;
        }
        
        @Override
        public Boolean isStrict() {
            return _strict;
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
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @Override
        public Uri getTransactionUri() {
            return _transactionUri;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowRef == null) ? 0 : _flowRef.hashCode());
            result = prime * result + ((_flowTable == null) ? 0 : _flowTable.hashCode());
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
            result = prime * result + ((_bufferId == null) ? 0 : _bufferId.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_cookieMask == null) ? 0 : _cookieMask.hashCode());
            result = prime * result + ((_flags == null) ? 0 : _flags.hashCode());
            result = prime * result + ((_flowName == null) ? 0 : _flowName.hashCode());
            result = prime * result + ((_installHw == null) ? 0 : _installHw.hashCode());
            result = prime * result + ((_instructions == null) ? 0 : _instructions.hashCode());
            result = prime * result + ((_match == null) ? 0 : _match.hashCode());
            result = prime * result + ((_outGroup == null) ? 0 : _outGroup.hashCode());
            result = prime * result + ((_outPort == null) ? 0 : _outPort.hashCode());
            result = prime * result + ((_strict == null) ? 0 : _strict.hashCode());
            result = prime * result + ((_cookie == null) ? 0 : _cookie.hashCode());
            result = prime * result + ((_hardTimeout == null) ? 0 : _hardTimeout.hashCode());
            result = prime * result + ((_idleTimeout == null) ? 0 : _idleTimeout.hashCode());
            result = prime * result + ((_priority == null) ? 0 : _priority.hashCode());
            result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
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
            FlowUpdatedImpl other = (FlowUpdatedImpl) obj;
            if (_flowRef == null) {
                if (other._flowRef != null) {
                    return false;
                }
            } else if(!_flowRef.equals(other._flowRef)) {
                return false;
            }
            if (_flowTable == null) {
                if (other._flowTable != null) {
                    return false;
                }
            } else if(!_flowTable.equals(other._flowTable)) {
                return false;
            }
            if (_barrier == null) {
                if (other._barrier != null) {
                    return false;
                }
            } else if(!_barrier.equals(other._barrier)) {
                return false;
            }
            if (_bufferId == null) {
                if (other._bufferId != null) {
                    return false;
                }
            } else if(!_bufferId.equals(other._bufferId)) {
                return false;
            }
            if (_containerName == null) {
                if (other._containerName != null) {
                    return false;
                }
            } else if(!_containerName.equals(other._containerName)) {
                return false;
            }
            if (_cookieMask == null) {
                if (other._cookieMask != null) {
                    return false;
                }
            } else if(!_cookieMask.equals(other._cookieMask)) {
                return false;
            }
            if (_flags == null) {
                if (other._flags != null) {
                    return false;
                }
            } else if(!_flags.equals(other._flags)) {
                return false;
            }
            if (_flowName == null) {
                if (other._flowName != null) {
                    return false;
                }
            } else if(!_flowName.equals(other._flowName)) {
                return false;
            }
            if (_installHw == null) {
                if (other._installHw != null) {
                    return false;
                }
            } else if(!_installHw.equals(other._installHw)) {
                return false;
            }
            if (_instructions == null) {
                if (other._instructions != null) {
                    return false;
                }
            } else if(!_instructions.equals(other._instructions)) {
                return false;
            }
            if (_match == null) {
                if (other._match != null) {
                    return false;
                }
            } else if(!_match.equals(other._match)) {
                return false;
            }
            if (_outGroup == null) {
                if (other._outGroup != null) {
                    return false;
                }
            } else if(!_outGroup.equals(other._outGroup)) {
                return false;
            }
            if (_outPort == null) {
                if (other._outPort != null) {
                    return false;
                }
            } else if(!_outPort.equals(other._outPort)) {
                return false;
            }
            if (_strict == null) {
                if (other._strict != null) {
                    return false;
                }
            } else if(!_strict.equals(other._strict)) {
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
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
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
            StringBuilder builder = new StringBuilder("FlowUpdated [");
            boolean first = true;
        
            if (_flowRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowRef=");
                builder.append(_flowRef);
             }
            if (_flowTable != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowTable=");
                builder.append(_flowTable);
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
            if (_bufferId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bufferId=");
                builder.append(_bufferId);
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
            if (_cookieMask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_cookieMask=");
                builder.append(_cookieMask);
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
            if (_flowName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowName=");
                builder.append(_flowName);
             }
            if (_installHw != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_installHw=");
                builder.append(_installHw);
             }
            if (_instructions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_instructions=");
                builder.append(_instructions);
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
            if (_outGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_outGroup=");
                builder.append(_outGroup);
             }
            if (_outPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_outPort=");
                builder.append(_outPort);
             }
            if (_strict != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_strict=");
                builder.append(_strict);
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
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
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
