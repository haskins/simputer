package data;

public class SimData {

	private int cs;
	private State cuState;
	private Integer memory[][];
	private int registerValues[];

	public int getCS() {
		return cs;
	}

	public Integer[][] getMemory() {
		return memory;
	}

	public int[] getRV() {
		return registerValues;
	}

	public State getState() {
		return cuState;
	}

	public void setCS(int i) {
		cs = i;
	}

	public void setMemory(Integer[][] memory) {
		this.memory = memory;
	}

	public void setRV(int registerValues[]) {
		this.registerValues = registerValues;
	}

	public void setState(State cuState) {
		this.cuState = cuState;
	}
}
