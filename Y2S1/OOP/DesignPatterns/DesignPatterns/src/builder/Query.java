package builder;

public class Query {
	String SELECT;
	String FROM;
	String WHERE;
	String ORDERBY;
	
	

	public Query(String sELECT, String fROM, String wHERE, String oRDERBY) {
		this.SELECT = sELECT;
		this.FROM = fROM;
		this.WHERE = wHERE;
		this.ORDERBY = oRDERBY;
	}



	@Override
    public String toString() {
        return "SELECT " + SELECT + " FROM " + FROM + ((WHERE != null) ? " WHERE " + WHERE : "") + ((ORDERBY != null) ? " ORDER BY " + ORDERBY : "");
    }
}
