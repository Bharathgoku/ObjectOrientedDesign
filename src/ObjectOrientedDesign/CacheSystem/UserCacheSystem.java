package ObjectOrientedDesign.CacheSystem;

public interface UserCacheSystem {

    String read(String key);

    void write(String key, String value);

}
