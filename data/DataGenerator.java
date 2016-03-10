package data;

import java.util.Random;

public class DataGenerator {

	public static SimData randomData() {
		Random rand = new Random();
		SimData guiData = new SimData();

		// state
		switch (rand.nextInt(7)) {
		case 0:
			guiData.setState(State.FETCH);
			break;
		case 1:
			guiData.setState(State.DECODE);
			break;
		case 2:
			guiData.setState(State.LOAD);
			break;
		case 3:
			guiData.setState(State.ADD);
			break;
		case 4:
			guiData.setState(State.STORE);
			break;
		case 5:
			guiData.setState(State.BRANCH);
			break;
		case 6:
			guiData.setState(State.OFF);
			break;
		}

		System.out.println(guiData.getState());

		// registers
		int reg[] = new int[6];
		for (int x = 0; x < 6; x++) {
			// reg[x] = 5;
			reg[x] = rand.nextInt(100);
		}
		guiData.setRV(reg);

		System.out.println(guiData.getRV()[0]);

		// memory
		Integer[][] mem = new Integer[100][2];
		for (int c = 0; c < mem.length; c++) {
			mem[c][0] = c;
			mem[c][1] = rand.nextInt(1000000);
		}
		guiData.setMemory(mem);
		System.out.println("Memory spot @ 0-1: " + guiData.getMemory()[0][1]);

		// cs
		int a = rand.nextInt(7);
		guiData.setCS(a);

		return guiData;
	}

	public static SimData zeroData() {
		SimData guiData = new SimData();

		// state
		guiData.setState(State.OFF);

		// registers
		int reg[] = new int[6];
		for (int x = 0; x >= 6; x++) {
			reg[x] = 0;
		}
		guiData.setRV(reg);

		// memory
		Integer[][] mem = new Integer[100][2];
		for (int c = 0; c < mem.length; c++) {
			mem[c][0] = c;
			mem[c][1] = 0;

		}
		guiData.setMemory(mem);

		// cs
		guiData.setCS(000);

		return guiData;

	}

}
