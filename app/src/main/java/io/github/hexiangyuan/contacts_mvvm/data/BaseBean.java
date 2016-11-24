package io.github.hexiangyuan.contacts_mvvm.data;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-24
 */

public class BaseBean {

    public InfoBean info;
    public java.util.List<ResultsBean> results;

    public static class InfoBean {
        public String seed;
        public int results;
        public int page;
        public String version;
    }
}
