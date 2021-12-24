package com.activiti.extension.bean;

import org.dev.BahtText;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("workflowUtils")
public class WorkflowUtils {

    private final Logger log = LoggerFactory.getLogger(WorkflowUtils.class);

    /**
     *
     * Get thai baht text from amount
     *
     * @param txt text amount
     * @return string
     */
    public String getThaiBahtTxt(String txt) {
        log.info("get thai baht >> " + txt);
        String bahtTH = "";
        try {


            bahtTH = BahtText.getBahtTextByString(txt.replace(",", ""));


        } catch (Exception e) {
            log.error("can't get thai baht from number");
        }
        return bahtTH;
    }

}
