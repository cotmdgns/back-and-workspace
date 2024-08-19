package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.upload.model.vo.Board;
import com.kh.upload.model.vo.Paging;

@Mapper
public interface BoardMaper {
	
	void insert(Board vo);
	List<Board> selectAll(Paging paging);
	Board select(int no);
	void update(Board vo);
	void delete(int no);
	
}
