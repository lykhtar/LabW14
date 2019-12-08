import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sonet")
public class SonetController {


    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public SonetResponse showStatus() {
        return new SonetResponse(SUCCESS_STATUS, 1);
    }

    @PostMapping("/string")
    public SonetResponse son(@RequestParam(value = "key") String key, @RequestBody SonetRequest request) {

        final SonetResponse response;

        if (sharedKey.equalsIgnoreCase(key)) {
            int sonetId = request.getsonetId();
            String sonet = request.getsonet();
            response = new SonetResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new SonetResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }
}

