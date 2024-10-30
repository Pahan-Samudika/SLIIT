package builder;

public class QueryBuilder {
	private Query Q;
	
	public QueryBuilder() {
		this.Q = new Query(null,null,null,null);
	}
	
	public QueryBuilder select(String select) {
		Q = new Query(select,Q.FROM,Q.WHERE,Q.ORDERBY);
		
		return this;
	}
	
	public QueryBuilder from(String from) {
		Q = new Query(Q.SELECT,from,Q.WHERE,Q.ORDERBY);
		
		return this;
	}
	
	public QueryBuilder where(String where) {
		Q = new Query(Q.SELECT,Q.FROM,where,Q.ORDERBY);
		
		return this;
	}
	
	public QueryBuilder orderby(String orderby) {
		Q = new Query(Q.SELECT,Q.FROM,Q.WHERE,orderby);
		
		return this;
	}
	
	public Query build() {
		if(Q.SELECT==null || Q.FROM==null) {
			throw new IllegalStateException("Invalid Query");
		}
		
		return Q;
	}
}
