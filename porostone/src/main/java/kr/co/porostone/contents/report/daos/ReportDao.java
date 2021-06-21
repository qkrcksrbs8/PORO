package kr.co.porostone.contents.report.daos;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public interface ReportDao {


	public int selectScheduleCnt(Map<String, Object> map) throws Exception;

}
