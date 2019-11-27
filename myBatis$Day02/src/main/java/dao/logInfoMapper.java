package dao;

import java.util.List;

public interface logInfoMapper {
    List<domain.loginInfo> getLoginInfo$user();
    List<domain.user> oneToMuti();
    List<domain.user> getUserRoles();
    List<domain.loginInfo> fingAllLoginInfos();

}
