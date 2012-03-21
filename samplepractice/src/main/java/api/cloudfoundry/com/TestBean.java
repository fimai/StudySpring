package api.cloudfoundry.com;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestBean {
private DriverManagerDataSource datasource;

public DriverManagerDataSource getDatasource() {
	return datasource;
}

public void setDatasource(DriverManagerDataSource datasource) {
	this.datasource = datasource;
}

public List getAll(){
	
	JdbcTemplate jt = new JdbcTemplate(this.datasource);
	final String sql = "select * from test1";

	List list =jt.queryForList(sql);
	return list;
	
}
	
	
	
	
}
