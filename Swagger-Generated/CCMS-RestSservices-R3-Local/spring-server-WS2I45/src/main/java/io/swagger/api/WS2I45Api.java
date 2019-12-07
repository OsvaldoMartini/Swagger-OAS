/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ExceptionResponseBody;
import io.swagger.model.ClassRequestBody;
import io.swagger.model.ResponseBody;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

@Api(value = "WS2I45", description = "the WS2I45 API")
public interface WS2I45Api {

    @ApiOperation(value = "", nickname = "wS2I45", notes = "", response = ResponseBody.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "WS2I45", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResponseBody.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ExceptionResponseBody.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ExceptionResponseBody.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = ExceptionResponseBody.class) })
    @RequestMapping(value = "/WS2I45",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ResponseBody> wS2I45(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ClassRequestBody requestBody);

}
