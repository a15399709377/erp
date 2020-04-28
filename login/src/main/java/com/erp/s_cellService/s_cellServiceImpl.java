package com.erp.s_cellService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.s_cellmapper.s_cellmapper;
import com.erp.mapper.s_gathermapper.s_gathermapper;
import com.erp.pojo.s_cell;
import com.erp.pojo.s_gather;
import com.erp.pojo.s_gather_details;

@Service
@Transactional
public class s_cellServiceImpl implements s_cellService {
	@Autowired
	s_cellmapper mapper;
	@Autowired
	s_gathermapper sgmapper;
	
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

	@Override
	public int rksqd(s_gather sg) {
		return sgmapper.rksqd(sg);
	}

	@Override
	public int rksqdxx(s_gather_details sgd) {
		return sgmapper.rksqdxx(sgd);
	}

	@Override
	public List<s_gather> s_gatherAll() {
		return sgmapper.s_gatherAll();
	}

	@Override
	public int upds_gather(String gather_id) {
		return sgmapper.upds_gather(gather_id);
	}
	
}
