package mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.Ajax.model.vo.Member;

@Mapper
public interface MemberMapper {
	
	String idCheck(String idCheck);
	void register(Member member);
}
