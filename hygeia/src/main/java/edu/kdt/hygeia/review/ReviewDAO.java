package edu.kdt.hygeia.review;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("reviewdao")
public interface ReviewDAO {
	public List<ReviewDTO> reviewList();
	public List<ReviewDTO> reviewPagingList(Criteria cri);
	public int reviewTotal();
	public ReviewDTO reviewResult(int reviewid);
	public int reviewInput(ReviewDTO dto);
	public int reviewCount(int reviewid);
}
