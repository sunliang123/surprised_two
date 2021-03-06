package com.luomengan.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import com.luomengan.entity.Checkin;

/**
 * 签到 Dao
 * 
 * @author luomengan
 *
 */
public interface CheckinDao {

	public Checkin createCheckin(Checkin checkin);

	public void deleteCheckinById(Integer id);

	public Checkin updateCheckin(Checkin checkin);

	public Checkin retrieveCheckinById(Integer id);

	public Page<Checkin> pageCheckin(int page, int limit);
	
	public List<Checkin> listCheckin();

}
