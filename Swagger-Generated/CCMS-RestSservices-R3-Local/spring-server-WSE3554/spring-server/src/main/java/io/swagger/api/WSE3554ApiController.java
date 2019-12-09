package io.swagger.api;

import io.swagger.model.ExceptionResponseBody;
import io.swagger.model.WSE3554_RequestBody;
import io.swagger.model.ResponseBody;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

@Controller
public class WSE3554ApiController implements WSE3554Api {

    private static final Logger log = LoggerFactory.getLogger(WSE3554ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WSE3554ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseBody> wSE3554(@ApiParam(value = "" ,required=true )  @Valid @RequestBody WSE3554_RequestBody requestBody) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseBody>(objectMapper.readValue("{  \"ParamRecordData\" : [ {    \"ParamAttributes\" : [ {      \"paramAttributeName\" : \"paramAttributeName\"    }, {      \"paramAttributeName\" : \"paramAttributeName\"    } ],    \"ParamRows\" : [ {      \"ParamRowData\" : [ {        \"paramAttributeValue\" : \"paramAttributeValue\"      }, {        \"paramAttributeValue\" : \"paramAttributeValue\"      } ]    }, {      \"ParamRowData\" : [ {        \"paramAttributeValue\" : \"paramAttributeValue\"      }, {        \"paramAttributeValue\" : \"paramAttributeValue\"      } ]    } ]  }, {    \"ParamAttributes\" : [ {      \"paramAttributeName\" : \"paramAttributeName\"    }, {      \"paramAttributeName\" : \"paramAttributeName\"    } ],    \"ParamRows\" : [ {      \"ParamRowData\" : [ {        \"paramAttributeValue\" : \"paramAttributeValue\"      }, {        \"paramAttributeValue\" : \"paramAttributeValue\"      } ]    }, {      \"ParamRowData\" : [ {        \"paramAttributeValue\" : \"paramAttributeValue\"      }, {        \"paramAttributeValue\" : \"paramAttributeValue\"      } ]    } ]  } ],  \"exceptionInteroperabilityPropertyBlocks\" : \"\",  \"responseInteroperabilityPropertyBlock\" : {    \"responseResult\" : 1,    \"responsorComponentName\" : \"responsorComponentName\",    \"responsorCompany\" : \"responsorCompany\",    \"responseHTTPResult\" : 5,    \"responseTimezone\" : \"responseTimezone\",    \"uniqueResponseReference\" : \"uniqueResponseReference\",    \"responsorIP\" : \"responsorIP\",    \"requestorRequestReference\" : \"requestorRequestReference\",    \"responsorResponseReference\" : \"responsorResponseReference\",    \"responseResultAdditionalData\" : \"responseResultAdditionalData\",    \"responsorApplicationName\" : \"responsorApplicationName\",    \"responsorServiceName\" : \"responsorServiceName\",    \"responseTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",    \"responsorOrganization\" : \"responsorOrganization\",    \"responseTimezoneOffset\" : \"responseTimezoneOffset\",    \"responsorSubsidiary\" : \"responsorSubsidiary\",    \"uniqueRequestReference\" : \"uniqueRequestReference\",    \"responsorOrganizationalUnit\" : \"responsorOrganizationalUnit\",    \"responseMessage\" : \"responseMessage\"  },  \"headerResponse\" : {    \"Return_Code\" : 0,    \"messageText\" : \"messageText\",    \"mParams\" : \"mParams\",    \"messageParameters\" : \"messageParameters\",    \"user_lock\" : \"2000-01-23T04:56:07.000+00:00\",    \"actionListTotalRowNumber\" : 6,    \"messageCode\" : \"messageCode\",    \"coreEventTimestamp\" : \"2000-01-23T04:56:07.000+00:00\"  }}", ResponseBody.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseBody>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseBody>(HttpStatus.NOT_IMPLEMENTED);
    }

}
