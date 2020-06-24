package configs;

    @org.aeonbits.owner.Config.Sources("classpath:config.properties")
    public interface Configuration extends org.aeonbits.owner.Config {
        @Key("url")
        String url();
    }