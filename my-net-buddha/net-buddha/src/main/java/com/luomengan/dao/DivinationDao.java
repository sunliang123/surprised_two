package com.luomengan.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import com.luomengan.entity.Divination;

/**
 * 灵签 Dao
 * 
 * @author luomengan
 *
 */
public interface DivinationDao {

	public Divination createDivination(Divination divination);

	public void deleteDivinationById(Integer id);

	public Divination updateDivination(Divination divination);

	public Divination retrieveDivinationById(Integer id);

	public Page<Divination> pageDivination(int page, int limit);
	
	public List<Divination> listDivination();

}
