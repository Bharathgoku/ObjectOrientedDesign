package ObjectOrientedDesign.CacheSystem;

import ObjectOrientedDesign.FlightReservationSystem.Person;
import ObjectOrientedDesign.Splitwise.User;
import java.util.List;
import java.util.Map;

public class CacheSystem implements UserCacheSystem, AdminCacheSystem{

    private Person Admin;

    private EvictionPolicy evictionPolicy;

    private CacheService cacheService;

    @Override
    public EvictionPolicy getPolicy() {
        return null;
    }

    @Override
    public void setPolicy(EvictionPolicy evictionPolicy) {

    }

    @Override
    public List<EvictionPolicy> getAllPolicies() {
        return null;
    }

    @Override
    public String read(String key) {
        return null;
    }

    @Override
    public void write(String key, String value) {

    }
}

