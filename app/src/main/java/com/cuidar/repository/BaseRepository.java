package com.cuidar.repository;

import com.cuidar.model.BaseModel;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepository<T extends BaseModel> extends PagingAndSortingRepository<T, Long>{
}

