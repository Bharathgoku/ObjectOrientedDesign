package ObjectOrientedDesign.CacheSystem;

import java.util.List;

public interface AdminCacheSystem {

    EvictionPolicy getPolicy();

    void setPolicy(EvictionPolicy evictionPolicy);

    List<EvictionPolicy> getAllPolicies();


}
