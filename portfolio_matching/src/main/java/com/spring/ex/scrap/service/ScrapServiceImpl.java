package com.spring.ex.scrap.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.ex.scrap.domain.ScrapVO;
import com.spring.ex.scrap.repository.ScrapDAO;

@Service
public class ScrapServiceImpl implements ScrapService{
	@Inject ScrapDAO dao;

	@Override
	public List<ScrapVO> scrapList(String scrap_userId) throws Exception {
		List<ScrapVO> list = null;
		list = dao.scrapList(scrap_userId);
		return list;
	}

	@Override
	public void scrapInsert(ScrapVO scrapVO) throws Exception {
		dao.scrapInsert(scrapVO);
	}

	@Override
	public void scrapDelete(ScrapVO scrapVO) throws Exception {
		dao.scrapDelete(scrapVO);
	}
	
	

}
