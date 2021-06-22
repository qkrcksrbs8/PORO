package kr.co.porostone.contents.board.daos;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("reportDao")
public class ReportDaoImle implements ReportDao {


	@Autowired
	SqlSessionDaoSupport sql;

	@Override
	public int selectScheduleCnt(Map<String, Object> map) throws Exception {
		return sql.getSqlSession().selectOne("selectScheduleCnt", map);
	}
	
	
}
