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



//    /**
//     *
//     * Set file name
//     *
//     * @param processId processId
//     * @param fieldId   fieldId
//     * @param name      new file name
//     * @return
//     */
//    public void setFileNameFromField(String processId, String fieldId, String name) {
//        try {
//            List<RelatedContent> contentList = relatedContentService
//                    .getFieldContentForProcessInstance(processId, fieldId, 1, 0).getContent();
//            RelatedContent content = contentList.get(0);
//            String fileNameWithOutExt = FilenameUtils.removeExtension(content.getName());
//            String newFileNameWithOutExt = FilenameUtils.removeExtension(name);
//            String newFileName = content.getName().replace(fileNameWithOutExt, newFileNameWithOutExt);
//            content.setName(newFileName);
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//    }

}
