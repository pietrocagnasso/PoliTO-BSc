package evaluation;

public class Journal {
	
	private String name;
	private String discipline;
	private int level;
	
	public Journal(String name, String discipline, int level) {
		super();
		this.name = name;
		this.discipline = discipline;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	public String getDiscipline() {
		return discipline;
	}
	public int getLevel() {
		return level;
	}
	
	

}
