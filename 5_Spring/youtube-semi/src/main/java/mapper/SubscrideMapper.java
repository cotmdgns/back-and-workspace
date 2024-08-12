package mapper;

import org.apache.ibatis.annotations.Mapper;

import com.semi.youtube.model.vo.Subsrcibe;

@Mapper
public interface SubscrideMapper {
	Subsrcibe check(Subsrcibe vo);
	int count(int code);
	void subs(Subsrcibe vo);
	void cancel(int code);
}
