package com.erp.s_cellService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.s_cellmapper.s_cellmapper;

import com.erp.pojo.User;
import com.erp.pojo.d_file;

import com.erp.pojo.s_cell;
import com.erp.pojo.warehouse;


@Service
@Transactional
public class s_cellServiceImpl implements s_cellService {
	@Autowired
	s_cellmapper mapper;

	
	@Override
	public int inserts_cell(s_cell s) {
		return mapper.inserts_cell(s);
	}
	@Override
	public List<d_file> seles_cell() {
		return mapper.seles_cell();
	}
	@Override
	public int upds_cell(s_cell se) {
		return mapper.upds_cell_check_tag(se);
	}
	@Override
	public List<d_file> cxByshbz_kcfpbz() {
		return mapper.cxByshbz_kcfpbz();
	}
	@Override
	public d_file cxByproduct_id(int product_id) {
		return mapper.cxByproduct_id(product_id);
	}
	@Override
	public List<d_file> cxByshbz() {
		return mapper.cxByshbz();
	}
	@Override
	public List<d_file> aqkcpzdbgcx() {
		return mapper.aqkcpzdbgcx();
	}
	@Override
	public warehouse cxck() {
		return mapper.cxck();
	}
	@Override
	public User cxuser(String register) {
		return mapper.cxuser(register);
	}
	@Override
	public d_file cxByproduct_id2(String productid) {
		return mapper.cxByproduct_id2(productid);
	}
	@Override
	public s_cell aqkcpzdfhcx(String id) {
		return mapper.aqkcpzdfhcx( id) ;
	}
	@Override
	public d_file cpdadjshcx(int id) {
		return mapper.cpdadjshcx(id);
	}
	@Override
	public int updD_file(d_file d) {
		return mapper.updD_file(d);
	}
	@Override
	public List<d_file> cpdabgcx() {
		return mapper.cpdabgcx();
	}
	
}
