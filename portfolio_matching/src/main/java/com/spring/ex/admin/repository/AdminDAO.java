package com.spring.ex.admin.repository;

import java.util.List;

import com.spring.ex.deal.domain.Deal_PortVO;
import com.spring.ex.portfolio.domain.Criteria;

public interface AdminDAO {

	//관리자 구매내역
		public List<Deal_PortVO> PurchaseList() throws Exception;

	//관리자 구매내역 상세
		public List<Deal_PortVO> purUser(String purUser) throws Exception;
		public List<Deal_PortVO> saleUser(String saleUser) throws Exception;
		
		public List<Deal_PortVO> SaleList() throws Exception;

}
