package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108 ;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;
import java.io.InputStream;
import java.io.IOException;
public final class $YangModuleInfoImpl implements YangModuleInfo {

    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final String name = "netconf-node-inventory";
    private final String namespace = "urn:opendaylight:netconf-node-inventory";
    private final String revision = "2014-01-08";
    private final String resourcePath = "/META-INF/yang/netconf-node-inventory.yang";
    
    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.opendaylight.yang.extension.yang.ext.rev130709.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
        InputStream stream = $YangModuleInfoImpl.class.getResourceAsStream(resourcePath);
        if (stream == null) {
            throw new IllegalStateException("Resource '" + resourcePath + "' is missing");
        }
        try {
            stream.close();
        } catch (IOException e) {
        // Resource leak, but there is nothing we can do
        }
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getRevision() {
        return revision;
    }
    
    @Override
    public String getNamespace() {
        return namespace;
    }
    
    @Override
    public InputStream getModuleSourceStream() throws IOException {
        InputStream stream = $YangModuleInfoImpl.class.getResourceAsStream(resourcePath);
        if (stream == null) {
            throw new IOException("Resource " + resourcePath + " is missing");
        }
        return stream;
    }
    
    @Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getCanonicalName());
        sb.append("[");
        sb.append("name = " + name);
        sb.append(", namespace = " + namespace);
        sb.append(", revision = " + revision);
        sb.append(", resourcePath = " + resourcePath);
        sb.append(", imports = " + importedModules);
        sb.append("]");
        return sb.toString();
    }
}
