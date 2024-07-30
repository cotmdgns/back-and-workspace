package mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.pratice.model.vo.Member;

@Mapper
public interface MemberMapper {
	void register(Member member);
}
