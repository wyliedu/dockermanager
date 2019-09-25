package wylie.manager.mapper;

import tk.mybatis.mapper.common.Mapper;
import wylie.manager.entity.AppBanner;

import java.util.List;

public interface AppBannerMapper extends Mapper<AppBanner> {

    List<AppBanner> getAppBannerList();
}