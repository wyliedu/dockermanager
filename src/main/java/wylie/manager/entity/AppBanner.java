package wylie.manager.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "app_banner")
public class AppBanner {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 图片地址
     */
    private String url;

    private Boolean enable;

    private Integer sort;

    /**
     * 跳转链接地址
     */
    @Column(name = "link_url")
    private String linkUrl;

    private String title;

    private String content;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取跳转链接地址
     *
     * @return link_url - 跳转链接地址
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * 设置跳转链接地址
     *
     * @param linkUrl 跳转链接地址
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}