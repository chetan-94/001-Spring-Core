package my.app.raghu;

public class Repository {

	private String entity;
	
	//alt+shift+S  O  > Deselect All > Generate
	public Repository() {
		super();
	}
	//alt+shift+S  > R  > Select All > Generate
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	//alt+shift+S  > S  > Generate
	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}
	
	
	
}
