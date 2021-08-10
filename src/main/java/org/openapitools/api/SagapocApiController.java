package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T22:12:39.436355+02:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.sAGAPOCRest.base-path:/api/v1}")
public class SagapocApiController implements SagapocApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SagapocApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
