package com.etoak.common.entity.crawl;

import com.blade.jdbc.annotation.Table;
import com.blade.jdbc.core.ActiveRecord;
import lombok.Data;

import java.util.Date;

@Table(value="crawl_result" , pk = "resultid")
@Data
public class CrawlResult extends ActiveRecord {

    private String resultid;
    private String recordid;
    private String elementid;
    private String elementcode ;
    private String content;
    private String url;
    private Date createtime;

}
