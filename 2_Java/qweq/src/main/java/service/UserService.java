package service;

import java.io.Reader;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import model.UserVo;

@Service
public class UserService {
	
	private static SqlMapClient sqlMap; // static으로 변경

    static {
        try {
            // 경로에서 맨 앞 슬래시(/)를 제거하거나, 파일명만 적어보세요.
            String resource = "sqlMapConfig.xml"; 
            Reader reader = Resources.getResourceAsReader(resource);
            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
            System.out.println(">>> [성공] sqlMapClient 초기화 완료!");
        } catch (Exception e) {
            System.out.println(">>> [실패] iBATIS 설정 로드 중 치명적 오류!");
            e.printStackTrace();
        }
    }

    public List<UserVo> selectAll() throws Exception {
        if (sqlMap == null) {
            System.out.println("!!! 긴급 !!! 여전히 sqlMap이 null입니다. 이유를 다시 확인합니다.");
            try {
                // 여기서 다시 한번 생성을 시도하며 에러를 직접 잡아서 출력합니다.
                String resource = "sqlMapConfig.xml"; 
                Reader reader = Resources.getResourceAsReader(resource);
                sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
            } catch (Exception e) {
                System.out.println("실제 에러 내용: " + e.getMessage());
                e.printStackTrace(); // <--- 이게 핵심입니다. 이걸 봐야 합니다!
            }
        }
        return (List<UserVo>) sqlMap.queryForList("getUserList");
    }

}
