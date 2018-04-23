package Homework_7;

public class StateTableClass {

	private int x,y; StateTable currentState,nextState;
	
	public StateTableClass (int x, int y, StateTable nextState) {
		this.x=x;
		this.y=y;
		this.nextState=nextState;
	}
	
	public StateTableClass () {
	}

	public void nextState (boolean a) {

		switch (getCurrentState()) {
		
		case S0:if (a) 
					{setX(4);setY(3);setNextState(StateTable.S0);}
				else 
					{setX(3);setY(5);setNextState(StateTable.S1);}
				break;
				
		case S1:if (a) 
					{setX(2);setY(1);setNextState(StateTable.S1);}
				else 
					{setX(4);setY(4);setNextState(StateTable.S2);}
				break;		
				
		case S2:if (a) 
					{setX(-2);setY(-4);setNextState(StateTable.S3);}
				else 
					{setX(0);setY(0);setNextState(StateTable.S0);}
				break;
				
		case S3:if (a) 
					{setX(9);setY(9);setNextState(StateTable.S3);}
				else 
					{setX(3);setY(0);setNextState(StateTable.S0);}
				break;
				
		// no Default is required for this switch because it is not possible for the
		// enum to go out of range and we are testing each state value in the enum, so
		// a missing state will also be detected
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public StateTable getNextState() {
		return nextState;
	}

	public void setNextState(StateTable nextState) {
		this.nextState = nextState;
	}

	public StateTable getCurrentState() {
		return currentState;
	}

	public void setCurrentState(StateTable currentState) {
		this.currentState = currentState;
	}
}