package basic.sample.enumsample;

public enum Gender {
    MEN("男"),
    WOMEN("女");

    public String getJPName;
    public String getJpName;
    private String jpName;

    Gender(String jpName) {
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
