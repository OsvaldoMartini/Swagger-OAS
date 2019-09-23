package io.swagger.api;

import io.swagger.model.ExceptionResponseBody;
import io.swagger.model.PropertiesRequest;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T12:46:28.874Z")

@Controller
public class CardDetailsApiController implements CardDetailsApi {

    private static final Logger log = LoggerFactory.getLogger(CardDetailsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CardDetailsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseBody> cardDetails(@NotNull @Pattern(regexp="^\\d{13}$") @ApiParam(value = "Numeric ID of the user to get", required = true) @Valid @RequestParam(value = "serialNumber", required = true) String serialNumber,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PropertiesRequest requestBody) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseBody>(objectMapper.readValue("{  \"code\" : \"code\",  \"balance\" : \"balance\",  \"agreementId\" : \"agreementId\",  \"currency\" : \"currency\",  \"headerResponse\" : {    \"Return_Code\" : 0,    \"messageText\" : \"messageText\",    \"mParams\" : \"mParams\",    \"messageParameters\" : \"messageParameters\",    \"user_lock\" : \"2000-01-23T04:56:07.000+00:00\",    \"actionListTotalRowNumber\" : 6,    \"messageCode\" : \"messageCode\",    \"coreEventTimestamp\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"partnerId\" : \"partnerId\",  \"message\" : \"message\",  \"msisdn\" : \"msisdn\",  \"errors\" : {    \"error\" : [ {      \"severity\" : \"severity\",      \"longDescription\" : \"longDescription\",      \"errorAdditionalInfo\" : \"errorAdditionalInfo\",      \"fieldName\" : \"fieldName\",      \"errorCode\" : \"errorCode\",      \"shortDescription\" : \"shortDescription\"    }, {      \"severity\" : \"severity\",      \"longDescription\" : \"longDescription\",      \"errorAdditionalInfo\" : \"errorAdditionalInfo\",      \"fieldName\" : \"fieldName\",      \"errorCode\" : \"errorCode\",      \"shortDescription\" : \"shortDescription\"    } ]  },  \"giftCardFlag\" : \"Y\",  \"status\" : \"status\"}", ResponseBody.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseBody>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseBody>(HttpStatus.NOT_IMPLEMENTED);
    }

}
