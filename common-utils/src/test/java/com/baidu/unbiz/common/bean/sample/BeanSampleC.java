package com.baidu.unbiz.common.bean.sample;

import com.baidu.unbiz.common.lang.StringableSupport;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年11月18日 下午9:04:54
 */
public class BeanSampleC extends StringableSupport {

    private String s1;
    private String s2;
    private String s3;

    public String getS1() {
        return s1;
    }

    protected void setS1(String s1) {
        this.s1 = s1;
    }

    protected String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }
}