package tamagochiignas;
public class Pet {
	private String type;
	private String name;
	private Integer hunger;
	private Integer happy;
	private Integer training;
	
	public Pet(String type, String name, Integer hunger, Integer happy, Integer training) {
		super();
		this.type = type;
		this.name = name;
		this.hunger = hunger;
		this.happy = happy;
		this.training = training;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHunger() {
		return hunger;
	}
	public void setHunger(Integer hunger) {
		this.hunger = hunger;
	}
	public Integer getHappy() {
		return happy;
	}
	public void setHappy(Integer happy) {
		this.happy = happy;
	}
	public Integer getTraining() {
		return training;
	}
	public void setTraining(Integer training) {
		this.training = training;
	}
	
}

