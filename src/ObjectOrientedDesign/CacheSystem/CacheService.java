package ObjectOrientedDesign.CacheSystem;

public interface CacheService {

    String getValue(String key);

    void putValue(String key, String value);

}
