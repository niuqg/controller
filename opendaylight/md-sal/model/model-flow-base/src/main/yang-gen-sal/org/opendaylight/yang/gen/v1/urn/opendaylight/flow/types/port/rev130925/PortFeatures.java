package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import java.util.List;
import com.google.common.collect.Lists;


/**
**/
public class PortFeatures
 {
    final private Boolean _tenMbHd;
    final private Boolean _tenMbFd;
    final private Boolean _hundredMbHd;
    final private Boolean _hundredMbFd;
    final private Boolean _oneGbHd;
    final private Boolean _oneGbFd;
    final private Boolean _tenGbFd;
    final private Boolean _fortyGbFd;
    final private Boolean _hundredGbFd;
    final private Boolean _oneTbFd;
    final private Boolean _other;
    final private Boolean _copper;
    final private Boolean _fiber;
    final private Boolean _autoeng;
    final private Boolean _pause;
    final private Boolean _pauseAsym;

    public PortFeatures(Boolean _autoeng, Boolean _copper, Boolean _fiber, Boolean _fortyGbFd, Boolean _hundredGbFd, Boolean _hundredMbFd, Boolean _hundredMbHd, Boolean _oneGbFd, Boolean _oneGbHd, Boolean _oneTbFd, Boolean _other, Boolean _pause, Boolean _pauseAsym, Boolean _tenGbFd, Boolean _tenMbFd, Boolean _tenMbHd) {
        this._tenMbHd = _tenMbHd;
        this._tenMbFd = _tenMbFd;
        this._hundredMbHd = _hundredMbHd;
        this._hundredMbFd = _hundredMbFd;
        this._oneGbHd = _oneGbHd;
        this._oneGbFd = _oneGbFd;
        this._tenGbFd = _tenGbFd;
        this._fortyGbFd = _fortyGbFd;
        this._hundredGbFd = _hundredGbFd;
        this._oneTbFd = _oneTbFd;
        this._other = _other;
        this._copper = _copper;
        this._fiber = _fiber;
        this._autoeng = _autoeng;
        this._pause = _pause;
        this._pauseAsym = _pauseAsym;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PortFeatures(PortFeatures source) {
        this._tenMbHd = source._tenMbHd;
        this._tenMbFd = source._tenMbFd;
        this._hundredMbHd = source._hundredMbHd;
        this._hundredMbFd = source._hundredMbFd;
        this._oneGbHd = source._oneGbHd;
        this._oneGbFd = source._oneGbFd;
        this._tenGbFd = source._tenGbFd;
        this._fortyGbFd = source._fortyGbFd;
        this._hundredGbFd = source._hundredGbFd;
        this._oneTbFd = source._oneTbFd;
        this._other = source._other;
        this._copper = source._copper;
        this._fiber = source._fiber;
        this._autoeng = source._autoeng;
        this._pause = source._pause;
        this._pauseAsym = source._pauseAsym;
    }
    
    public static PortFeatures getDefaultInstance(String defaultValue) {
        List<String> properties = Lists.newArrayList("autoeng",
        "copper",
        "fiber",
        "fortyGbFd",
        "hundredGbFd",
        "hundredMbFd",
        "hundredMbHd",
        "oneGbFd",
        "oneGbHd",
        "oneTbFd",
        "other",
        "pause",
        "pauseAsym",
        "tenGbFd",
        "tenMbFd",
        "tenMbHd"
        );
        if (!properties.contains(defaultValue)) {
            throw new IllegalArgumentException("invalid default parameter");
        }
        int i = 0;
        return new PortFeatures(
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null,
        properties.get(i++).equals(defaultValue) ? new Boolean("true") : null
        );
    }

    public Boolean isTenMbHd() {
        return _tenMbHd;
    }
    
    public Boolean isTenMbFd() {
        return _tenMbFd;
    }
    
    public Boolean isHundredMbHd() {
        return _hundredMbHd;
    }
    
    public Boolean isHundredMbFd() {
        return _hundredMbFd;
    }
    
    public Boolean isOneGbHd() {
        return _oneGbHd;
    }
    
    public Boolean isOneGbFd() {
        return _oneGbFd;
    }
    
    public Boolean isTenGbFd() {
        return _tenGbFd;
    }
    
    public Boolean isFortyGbFd() {
        return _fortyGbFd;
    }
    
    public Boolean isHundredGbFd() {
        return _hundredGbFd;
    }
    
    public Boolean isOneTbFd() {
        return _oneTbFd;
    }
    
    public Boolean isOther() {
        return _other;
    }
    
    public Boolean isCopper() {
        return _copper;
    }
    
    public Boolean isFiber() {
        return _fiber;
    }
    
    public Boolean isAutoeng() {
        return _autoeng;
    }
    
    public Boolean isPause() {
        return _pause;
    }
    
    public Boolean isPauseAsym() {
        return _pauseAsym;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_tenMbHd == null) ? 0 : _tenMbHd.hashCode());
        result = prime * result + ((_tenMbFd == null) ? 0 : _tenMbFd.hashCode());
        result = prime * result + ((_hundredMbHd == null) ? 0 : _hundredMbHd.hashCode());
        result = prime * result + ((_hundredMbFd == null) ? 0 : _hundredMbFd.hashCode());
        result = prime * result + ((_oneGbHd == null) ? 0 : _oneGbHd.hashCode());
        result = prime * result + ((_oneGbFd == null) ? 0 : _oneGbFd.hashCode());
        result = prime * result + ((_tenGbFd == null) ? 0 : _tenGbFd.hashCode());
        result = prime * result + ((_fortyGbFd == null) ? 0 : _fortyGbFd.hashCode());
        result = prime * result + ((_hundredGbFd == null) ? 0 : _hundredGbFd.hashCode());
        result = prime * result + ((_oneTbFd == null) ? 0 : _oneTbFd.hashCode());
        result = prime * result + ((_other == null) ? 0 : _other.hashCode());
        result = prime * result + ((_copper == null) ? 0 : _copper.hashCode());
        result = prime * result + ((_fiber == null) ? 0 : _fiber.hashCode());
        result = prime * result + ((_autoeng == null) ? 0 : _autoeng.hashCode());
        result = prime * result + ((_pause == null) ? 0 : _pause.hashCode());
        result = prime * result + ((_pauseAsym == null) ? 0 : _pauseAsym.hashCode());
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
        PortFeatures other = (PortFeatures) obj;
        if (_tenMbHd == null) {
            if (other._tenMbHd != null) {
                return false;
            }
        } else if(!_tenMbHd.equals(other._tenMbHd)) {
            return false;
        }
        if (_tenMbFd == null) {
            if (other._tenMbFd != null) {
                return false;
            }
        } else if(!_tenMbFd.equals(other._tenMbFd)) {
            return false;
        }
        if (_hundredMbHd == null) {
            if (other._hundredMbHd != null) {
                return false;
            }
        } else if(!_hundredMbHd.equals(other._hundredMbHd)) {
            return false;
        }
        if (_hundredMbFd == null) {
            if (other._hundredMbFd != null) {
                return false;
            }
        } else if(!_hundredMbFd.equals(other._hundredMbFd)) {
            return false;
        }
        if (_oneGbHd == null) {
            if (other._oneGbHd != null) {
                return false;
            }
        } else if(!_oneGbHd.equals(other._oneGbHd)) {
            return false;
        }
        if (_oneGbFd == null) {
            if (other._oneGbFd != null) {
                return false;
            }
        } else if(!_oneGbFd.equals(other._oneGbFd)) {
            return false;
        }
        if (_tenGbFd == null) {
            if (other._tenGbFd != null) {
                return false;
            }
        } else if(!_tenGbFd.equals(other._tenGbFd)) {
            return false;
        }
        if (_fortyGbFd == null) {
            if (other._fortyGbFd != null) {
                return false;
            }
        } else if(!_fortyGbFd.equals(other._fortyGbFd)) {
            return false;
        }
        if (_hundredGbFd == null) {
            if (other._hundredGbFd != null) {
                return false;
            }
        } else if(!_hundredGbFd.equals(other._hundredGbFd)) {
            return false;
        }
        if (_oneTbFd == null) {
            if (other._oneTbFd != null) {
                return false;
            }
        } else if(!_oneTbFd.equals(other._oneTbFd)) {
            return false;
        }
        if (_other == null) {
            if (other._other != null) {
                return false;
            }
        } else if(!_other.equals(other._other)) {
            return false;
        }
        if (_copper == null) {
            if (other._copper != null) {
                return false;
            }
        } else if(!_copper.equals(other._copper)) {
            return false;
        }
        if (_fiber == null) {
            if (other._fiber != null) {
                return false;
            }
        } else if(!_fiber.equals(other._fiber)) {
            return false;
        }
        if (_autoeng == null) {
            if (other._autoeng != null) {
                return false;
            }
        } else if(!_autoeng.equals(other._autoeng)) {
            return false;
        }
        if (_pause == null) {
            if (other._pause != null) {
                return false;
            }
        } else if(!_pause.equals(other._pause)) {
            return false;
        }
        if (_pauseAsym == null) {
            if (other._pauseAsym != null) {
                return false;
            }
        } else if(!_pauseAsym.equals(other._pauseAsym)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("PortFeatures [");
        boolean first = true;
    
        if (_tenMbHd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tenMbHd=");
            builder.append(_tenMbHd);
         }
        if (_tenMbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tenMbFd=");
            builder.append(_tenMbFd);
         }
        if (_hundredMbHd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_hundredMbHd=");
            builder.append(_hundredMbHd);
         }
        if (_hundredMbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_hundredMbFd=");
            builder.append(_hundredMbFd);
         }
        if (_oneGbHd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_oneGbHd=");
            builder.append(_oneGbHd);
         }
        if (_oneGbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_oneGbFd=");
            builder.append(_oneGbFd);
         }
        if (_tenGbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tenGbFd=");
            builder.append(_tenGbFd);
         }
        if (_fortyGbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_fortyGbFd=");
            builder.append(_fortyGbFd);
         }
        if (_hundredGbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_hundredGbFd=");
            builder.append(_hundredGbFd);
         }
        if (_oneTbFd != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_oneTbFd=");
            builder.append(_oneTbFd);
         }
        if (_other != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_other=");
            builder.append(_other);
         }
        if (_copper != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_copper=");
            builder.append(_copper);
         }
        if (_fiber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_fiber=");
            builder.append(_fiber);
         }
        if (_autoeng != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_autoeng=");
            builder.append(_autoeng);
         }
        if (_pause != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_pause=");
            builder.append(_pause);
         }
        if (_pauseAsym != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_pauseAsym=");
            builder.append(_pauseAsym);
         }
        return builder.append(']').toString();
    }



}
