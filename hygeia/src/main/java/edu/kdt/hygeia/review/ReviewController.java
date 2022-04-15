package edu.kdt.hygeia.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReviewController {
	
	@Autowired
	@Qualifier("reviewservice")
	ReviewService service;
	
	//후기 목록 페이지
	/*
	@RequestMapping("/reviewlist")
	public ModelAndView reviewList() {
		ModelAndView mv = new ModelAndView();
		List<ReviewDTO> list = service.reviewList();
		mv.addObject("reviewlist", list);
		mv.setViewName("reviewlist");
		return mv;
	}
	*/
	
	//후기 페이징 목록 페이지
	@RequestMapping("/reviewlist")
	public ModelAndView reviewPagingList(Criteria cri) {
		ModelAndView mv = new ModelAndView();
		List<ReviewDTO> list = service.reviewPagingList(cri);
		mv.addObject("reviewlist", list);
		
		//페이징 인터페이스
		int total = service.reviewTotal(cri);
		PageMakerDTO pageMake = new PageMakerDTO(cri, total);
		mv.addObject("pageMaker", pageMake);
		
		mv.setViewName("reviewlist");
		return mv;
	}
	
	//후기 상세 페이지
	@RequestMapping("/reviewresult")
	public ModelAndView reviewResult(int reviewid) {
		ModelAndView mv = new ModelAndView();
		int count = service.reviewCount(reviewid);
		ReviewDTO reviewresult = service.reviewResult(reviewid);
		mv.addObject("reviewresult", reviewresult);
		mv.setViewName("reviewresult");
		return mv;
	}
	
	//후기 작성 페이지
	@RequestMapping(value = "/reviewinput", method = RequestMethod.GET)
	public String reviewInputForm() {
		return "reviewinput";
	}
	
	//후기 작성
	@RequestMapping(value = "/reviewinput", method = RequestMethod.POST)
	public ModelAndView reviewInput(ReviewDTO dto) {
		int result = service.reviewInput(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject(result);
		mv.setViewName("redirect:/reviewlist");
		return mv;
	}
	
}
