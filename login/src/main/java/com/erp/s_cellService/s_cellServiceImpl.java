package com.erp.s_cellService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.s_cellmapper.s_cellmapper;
import com.erp.pojo.s_cell;

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
	public List<s_cell> seles_cell() {
		return mapper.seles_cell();
	}

	@Override
	public int upds_cell(s_cell se) {
		return mapper.upds_cell_check_tag(se.getId());
	}

	
	
	
}
