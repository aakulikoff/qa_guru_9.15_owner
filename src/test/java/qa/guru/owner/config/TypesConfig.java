package qa.guru.owner.config;

import org.aeonbits.owner.Config;

public interface TypesConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolena")
    Double getBoolean();

    @Key("enu,")
    Double getEnum();

}
