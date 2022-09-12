package com.fm.mdtc.filesync.service;

import com.fm.mdtc.filesync.domain.JiraFile;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MdtcFileSyncImpl {

    private static Logger LOG = LoggerFactory.getLogger(MdtcFileSyncImpl.class);

    public JiraFile generate(String filename){
        LOG.info("Inside generate execution");
        //Validate input
        // Check connectivity
        // Generate file
        //Contruct response with meta-data
        LOG.debug("File generation is successfull");
        return new JiraFile(filename);
    }

}
