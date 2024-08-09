package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.pratice.model.vo.Member;

@Mapper
public interface MemberMapper {
	List<Member> allMember();
	void register(Member member);
	Member login(Member member);
	
	//<select id="login" parameterType="Member" resultType="Member">
}
