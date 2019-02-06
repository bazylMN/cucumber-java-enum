package glue.enums;

public enum UrlEnum{

    CUCUMBER("https://cucumber.io/"),
    WP("http://wp.pl"),
    ONET("http://onet.pl");

    public final String urlName;

    UrlEnum(String urlName) {
        this.urlName = urlName;
    }

    public static String getTranslatedEnum(String url) {
        UrlEnum nameToTranslate = UrlEnum.valueOf(url.toUpperCase());
        return nameToTranslate.toString();
    }

    @Override
    public String toString() {
        return urlName;
    }
}
