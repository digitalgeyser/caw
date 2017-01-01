package com.dg.caw.model;

/**
 * Rule for transition from step 1 to step 2.
 *
 * Created by timotej on 12/31/16.
 */
public interface ICellRule<T extends ICellState> {
    /**
     * This method transitions a cell from current state to next state.
     *
     * @param cell
     * @return
     */
    T nextState(ICell<T> cell);
}
