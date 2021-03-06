package model.Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

import model.Algorithm.Searcher;
import model.Algorithm.State;

public abstract class CommonSearcher implements Searcher{
// all the common things for A* and BFS
	
	protected PriorityQueue<State> openList = new PriorityQueue<State>();
	// openList contains the states that we still didn't handle
	protected PriorityQueue<State> closedList = new PriorityQueue<State>();
	//closedList contains the states that we finished handling (rich all neighbors)
	

	// call "pathToGoal" when we are in the goal state. the function will calculate all the moves from the start to goal
	public ArrayList<Action> pathToGoal(State state)
	{
		ArrayList<Action> newAction = new ArrayList<Action>();
		while (state.cameFrom != null)
		{
			newAction.add(0, state.cameWithAction);
			state = state.cameFrom; 
		}
		
		return newAction;
	}


}
