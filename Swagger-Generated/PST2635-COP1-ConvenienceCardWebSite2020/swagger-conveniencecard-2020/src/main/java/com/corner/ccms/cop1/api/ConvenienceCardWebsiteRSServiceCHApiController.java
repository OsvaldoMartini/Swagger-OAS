package com.corner.ccms.cop1.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-16T11:09:49.248+01:00")

@Controller
public class ConvenienceCardWebsiteRSServiceCHApiController implements ConvenienceCardWebsiteRSServiceCHApi {

    private static final Logger log = LoggerFactory.getLogger(ConvenienceCardWebsiteRSServiceCHApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConvenienceCardWebsiteRSServiceCHApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> accountRegistration(@ApiParam(value = "", defaultValue = "") @Valid @RequestParam(value = "_wadl", required = false, defaultValue="") String wadl) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> checkCardAndMsisdn(@ApiParam(value = "", defaultValue = "") @Valid @RequestParam(value = "_wadl", required = false, defaultValue="") String wadl) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> checkOTP(@ApiParam(value = "", defaultValue = "") @Valid @RequestParam(value = "_wadl", required = false, defaultValue="") String wadl) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getConvenienceCardOverview(@ApiParam(value = "", defaultValue = "") @Valid @RequestParam(value = "userId", required = false, defaultValue="") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getProfile(@ApiParam(value = "", defaultValue = "") @Valid @RequestParam(value = "userId", required = false, defaultValue="") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
