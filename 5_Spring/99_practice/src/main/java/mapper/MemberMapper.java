package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.pratice.model.vo.Member;

@Mapper
public interface MemberMapper {
	void register(Member member);
	List<Member> allmember();
	Member login(Member member);
}
