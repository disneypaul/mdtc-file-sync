package com.fm.mdtc.filesync.controllers;

import com.fm.mdtc.filesync.domain.JiraFile;
import com.fm.mdtc.filesync.service.MdtcFileSyncImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/mdtc/api")
public class MdtcFileSyncController {

    @Autowired
    private MdtcFileSyncImpl mdtcFileSyncImp;

    @ApiOperation(value = "This method gathers information from Jira, generates CSV files, archieves old generated files and stores new files in latest location")
    @RequestMapping(method = {
            RequestMethod.POST}, value = {"/${api.version}/generate/jirafiles", "/${api.version}/generate/{filetype}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid request"),
            @ApiResponse(code = 500, message = "Error processing request"),})
    public ResponseEntity<Object> generate(@RequestParam(value = "filename", defaultValue = "md-jira") String filename) {
        //return mdtcFileSyncImp.generate(filename);
        //return new ResponseEntity<Object>(new SuccessResponse<Object>(), HttpStatus.CREATED);
        mdtcFileSyncImp.generate(filename);
        return new ResponseEntity<Object>(HttpStatus.CREATED);
    }

    @PostMapping("/${api.version}/sync/jirafiles")
    public JiraFile sync(@RequestParam(value = "filetype", defaultValue = "planview") String filetype,
                         @RequestParam(value = "filename", defaultValue = "planview") String filename) {
        return new JiraFile(filename);
    }

    @GetMapping("/${api.version}/list")
    public JiraFile list(@RequestParam(value = "filetype", defaultValue = "planview") String filetype,
                         @RequestParam(value = "filename", defaultValue = "planview") String filename) {
        return new JiraFile(filename);
    }

    /*
    @ApiOperation(nickname = "GetIdentity", value = "GetIdentity for residential purposes",
            notes = "Post operation to get identity and account details by customerGuid/emailLoginId/Uid for Residential Services")
    @RequestMapping(method = {RequestMethod.POST}, value = "/GetIdentity",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid request", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Error processing request",
                    response = ErrorResponse.class),})
    public ResponseEntity<com.comcast.directory.identityandcredential.types.GetIdentityInfoResult> getIdentity(
            @ApiParam(name = "getIdentity", value = "GetIdentity",
                    required = true) @RequestBody com.comcast.directory.identityandcredential.types.GetIdentityInfo getIdentityInfo) {
        com.comcast.directory.identityandcredential.types.GetIdentityInfoResult response =
                identityandCredentialRestService.getIdentity(getIdentityInfo);
        return new ResponseEntity<com.comcast.directory.identityandcredential.types.GetIdentityInfoResult>(
                response, HttpStatus.OK);
    }
    */

}
