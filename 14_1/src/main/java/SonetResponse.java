public class SonetResponse {

    private final String son;
    private final Integer id;

    public SonetResponse(String son, Integer id) {
        this.son = son;
        this.id = id;
    }

    public String getSon() {
        return son;
    }

    public Integer getId() {
        return id;
    }
}

