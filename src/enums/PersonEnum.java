package enums;

public enum PersonEnum {
    PHYSICS_PERSON("i"),
    JURIDIC_PERSON("c");

    private final String code;

    PersonEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
