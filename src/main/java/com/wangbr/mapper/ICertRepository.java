package com.wangbr.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.wangbr.entity.CertEntity;

@Repository
public interface ICertRepository {
	List<CertEntity> qryCert();
	boolean insertCert(CertEntity entity);
}
