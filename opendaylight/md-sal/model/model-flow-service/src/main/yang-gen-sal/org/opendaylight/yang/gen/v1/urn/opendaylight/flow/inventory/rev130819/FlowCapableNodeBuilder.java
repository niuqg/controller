package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedActions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedInstructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedMatchTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.Meter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups.Group;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class FlowCapableNodeBuilder {

    private String _description;
    private String _hardware;
    private String _manufacturer;
    private String _serialNumber;
    private String _software;
    private SupportedActions _supportedActions;
    private SupportedInstructions _supportedInstructions;
    private SupportedMatchTypes _supportedMatchTypes;
    private SwitchFeatures _switchFeatures;
    private List<Table> _table;
    private List<Meter> _meter;
    private List<Group> _group;


    public FlowCapableNodeBuilder() {
    } 
    
    public FlowCapableNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode arg) {
        this._description = arg.getDescription();
        this._hardware = arg.getHardware();
        this._manufacturer = arg.getManufacturer();
        this._serialNumber = arg.getSerialNumber();
        this._software = arg.getSoftware();
        this._supportedActions = arg.getSupportedActions();
        this._supportedInstructions = arg.getSupportedInstructions();
        this._supportedMatchTypes = arg.getSupportedMatchTypes();
        this._switchFeatures = arg.getSwitchFeatures();
        this._table = arg.getTable();
        this._meter = arg.getMeter();
        this._group = arg.getGroup();
    }
    
    public FlowCapableNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables arg) {
        this._table = arg.getTable();
    }
    
    public FlowCapableNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters arg) {
        this._meter = arg.getMeter();
    }
    
    public FlowCapableNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups arg) {
        this._group = arg.getGroup();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups) {
            this._group = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups)arg).getGroup();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters) {
            this._meter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters)arg).getMeter();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables) {
            this._table = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables)arg).getTable();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getDescription();
            this._hardware = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getHardware();
            this._manufacturer = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getManufacturer();
            this._serialNumber = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getSerialNumber();
            this._software = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getSoftware();
            this._supportedActions = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getSupportedActions();
            this._supportedInstructions = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getSupportedInstructions();
            this._supportedMatchTypes = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getSupportedMatchTypes();
            this._switchFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode)arg).getSwitchFeatures();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Groups, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode] \n" +
              "but was: " + arg
            );
        }
    }

    public String getDescription() {
        return _description;
    }
    
    public String getHardware() {
        return _hardware;
    }
    
    public String getManufacturer() {
        return _manufacturer;
    }
    
    public String getSerialNumber() {
        return _serialNumber;
    }
    
    public String getSoftware() {
        return _software;
    }
    
    public SupportedActions getSupportedActions() {
        return _supportedActions;
    }
    
    public SupportedInstructions getSupportedInstructions() {
        return _supportedInstructions;
    }
    
    public SupportedMatchTypes getSupportedMatchTypes() {
        return _supportedMatchTypes;
    }
    
    public SwitchFeatures getSwitchFeatures() {
        return _switchFeatures;
    }
    
    public List<Table> getTable() {
        return _table;
    }
    
    public List<Meter> getMeter() {
        return _meter;
    }
    
    public List<Group> getGroup() {
        return _group;
    }

    public FlowCapableNodeBuilder setDescription(String value) {
    
        this._description = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setHardware(String value) {
    
        this._hardware = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setManufacturer(String value) {
    
        this._manufacturer = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setSerialNumber(String value) {
    
        this._serialNumber = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setSoftware(String value) {
    
        this._software = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setSupportedActions(SupportedActions value) {
    
        this._supportedActions = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setSupportedInstructions(SupportedInstructions value) {
    
        this._supportedInstructions = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setSupportedMatchTypes(SupportedMatchTypes value) {
    
        this._supportedMatchTypes = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setSwitchFeatures(SwitchFeatures value) {
    
        this._switchFeatures = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setTable(List<Table> value) {
    
        this._table = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setMeter(List<Meter> value) {
    
        this._meter = value;
        return this;
    }
    
    public FlowCapableNodeBuilder setGroup(List<Group> value) {
    
        this._group = value;
        return this;
    }

    public FlowCapableNode build() {
        return new FlowCapableNodeImpl(this);
    }

    private static final class FlowCapableNodeImpl implements FlowCapableNode {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode.class;
        }

        private final String _description;
        private final String _hardware;
        private final String _manufacturer;
        private final String _serialNumber;
        private final String _software;
        private final SupportedActions _supportedActions;
        private final SupportedInstructions _supportedInstructions;
        private final SupportedMatchTypes _supportedMatchTypes;
        private final SwitchFeatures _switchFeatures;
        private final List<Table> _table;
        private final List<Meter> _meter;
        private final List<Group> _group;


        private FlowCapableNodeImpl(FlowCapableNodeBuilder builder) {
            this._description = builder.getDescription();
            this._hardware = builder.getHardware();
            this._manufacturer = builder.getManufacturer();
            this._serialNumber = builder.getSerialNumber();
            this._software = builder.getSoftware();
            this._supportedActions = builder.getSupportedActions();
            this._supportedInstructions = builder.getSupportedInstructions();
            this._supportedMatchTypes = builder.getSupportedMatchTypes();
            this._switchFeatures = builder.getSwitchFeatures();
            this._table = builder.getTable();
            this._meter = builder.getMeter();
            this._group = builder.getGroup();
        }

        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getHardware() {
            return _hardware;
        }
        
        @Override
        public String getManufacturer() {
            return _manufacturer;
        }
        
        @Override
        public String getSerialNumber() {
            return _serialNumber;
        }
        
        @Override
        public String getSoftware() {
            return _software;
        }
        
        @Override
        public SupportedActions getSupportedActions() {
            return _supportedActions;
        }
        
        @Override
        public SupportedInstructions getSupportedInstructions() {
            return _supportedInstructions;
        }
        
        @Override
        public SupportedMatchTypes getSupportedMatchTypes() {
            return _supportedMatchTypes;
        }
        
        @Override
        public SwitchFeatures getSwitchFeatures() {
            return _switchFeatures;
        }
        
        @Override
        public List<Table> getTable() {
            return _table;
        }
        
        @Override
        public List<Meter> getMeter() {
            return _meter;
        }
        
        @Override
        public List<Group> getGroup() {
            return _group;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_description == null) ? 0 : _description.hashCode());
            result = prime * result + ((_hardware == null) ? 0 : _hardware.hashCode());
            result = prime * result + ((_manufacturer == null) ? 0 : _manufacturer.hashCode());
            result = prime * result + ((_serialNumber == null) ? 0 : _serialNumber.hashCode());
            result = prime * result + ((_software == null) ? 0 : _software.hashCode());
            result = prime * result + ((_supportedActions == null) ? 0 : _supportedActions.hashCode());
            result = prime * result + ((_supportedInstructions == null) ? 0 : _supportedInstructions.hashCode());
            result = prime * result + ((_supportedMatchTypes == null) ? 0 : _supportedMatchTypes.hashCode());
            result = prime * result + ((_switchFeatures == null) ? 0 : _switchFeatures.hashCode());
            result = prime * result + ((_table == null) ? 0 : _table.hashCode());
            result = prime * result + ((_meter == null) ? 0 : _meter.hashCode());
            result = prime * result + ((_group == null) ? 0 : _group.hashCode());
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
            FlowCapableNodeImpl other = (FlowCapableNodeImpl) obj;
            if (_description == null) {
                if (other._description != null) {
                    return false;
                }
            } else if(!_description.equals(other._description)) {
                return false;
            }
            if (_hardware == null) {
                if (other._hardware != null) {
                    return false;
                }
            } else if(!_hardware.equals(other._hardware)) {
                return false;
            }
            if (_manufacturer == null) {
                if (other._manufacturer != null) {
                    return false;
                }
            } else if(!_manufacturer.equals(other._manufacturer)) {
                return false;
            }
            if (_serialNumber == null) {
                if (other._serialNumber != null) {
                    return false;
                }
            } else if(!_serialNumber.equals(other._serialNumber)) {
                return false;
            }
            if (_software == null) {
                if (other._software != null) {
                    return false;
                }
            } else if(!_software.equals(other._software)) {
                return false;
            }
            if (_supportedActions == null) {
                if (other._supportedActions != null) {
                    return false;
                }
            } else if(!_supportedActions.equals(other._supportedActions)) {
                return false;
            }
            if (_supportedInstructions == null) {
                if (other._supportedInstructions != null) {
                    return false;
                }
            } else if(!_supportedInstructions.equals(other._supportedInstructions)) {
                return false;
            }
            if (_supportedMatchTypes == null) {
                if (other._supportedMatchTypes != null) {
                    return false;
                }
            } else if(!_supportedMatchTypes.equals(other._supportedMatchTypes)) {
                return false;
            }
            if (_switchFeatures == null) {
                if (other._switchFeatures != null) {
                    return false;
                }
            } else if(!_switchFeatures.equals(other._switchFeatures)) {
                return false;
            }
            if (_table == null) {
                if (other._table != null) {
                    return false;
                }
            } else if(!_table.equals(other._table)) {
                return false;
            }
            if (_meter == null) {
                if (other._meter != null) {
                    return false;
                }
            } else if(!_meter.equals(other._meter)) {
                return false;
            }
            if (_group == null) {
                if (other._group != null) {
                    return false;
                }
            } else if(!_group.equals(other._group)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("FlowCapableNode [");
            boolean first = true;
        
            if (_description != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_description=");
                builder.append(_description);
             }
            if (_hardware != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hardware=");
                builder.append(_hardware);
             }
            if (_manufacturer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_manufacturer=");
                builder.append(_manufacturer);
             }
            if (_serialNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_serialNumber=");
                builder.append(_serialNumber);
             }
            if (_software != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_software=");
                builder.append(_software);
             }
            if (_supportedActions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_supportedActions=");
                builder.append(_supportedActions);
             }
            if (_supportedInstructions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_supportedInstructions=");
                builder.append(_supportedInstructions);
             }
            if (_supportedMatchTypes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_supportedMatchTypes=");
                builder.append(_supportedMatchTypes);
             }
            if (_switchFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_switchFeatures=");
                builder.append(_switchFeatures);
             }
            if (_table != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_table=");
                builder.append(_table);
             }
            if (_meter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meter=");
                builder.append(_meter);
             }
            if (_group != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_group=");
                builder.append(_group);
             }
            return builder.append(']').toString();
        }
    }

}
