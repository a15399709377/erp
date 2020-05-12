package com.erp.s_cellService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.s_cellmapper.s_cellmapper;
import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
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
	@Override
	public int deletecp(int id) {
		return mapper.deletecp(id);
	}
	@Override
	public List<d_file> cpdaschf() {
		return mapper.cpdaschf();
	}
	@Override
	public int deleteaqkc(String product_id) {
		return mapper.deleteaqkc(product_id);
	}
	@Override
	public List<D_module> wlzcsjdcx() {
		return mapper.wlzcsjdcx();
	}
	@Override
	public List<D_module_details> wlzcsjdcxxx(int id) {
		return mapper.wlzcsjdcxxx(id);
	}
	@Override
	public D_module wlzcsjcxid(String id) {
		return mapper.wlzcsjcxid(id);
	}
	@Override
	public List<d_file> tjwlcx(String id) {
		return mapper.tjwlcx(id);
	}
	@Override
	public int addD_module_details(D_module_details d) {
		return mapper.addD_module_details( d);
	}
	@Override
	public d_file d_fileProduct_id(String product_id) {
		return mapper.d_fileProduct_id(product_id);
	}
	@Override
	public int delwlxx(int parent_id) {
		return mapper.delwlxx(parent_id);
	}
	@Override
	public int updated_module(int id) {
		return mapper.updated_module(id);
	}
	@Override
	public List<D_module> wlzcsjdbgcx() {
		return mapper.wlzcsjdbgcx();
	}
	@Override
	public int delwlxx2(String id, int parent_id) {
		return mapper.delwlxx2(id,parent_id);
	}
	
}
