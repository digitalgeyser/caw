package com.dg.caw.rules.gameoflife;

import com.dg.caw.model.ICell;
import com.dg.caw.model.ICellRule;
import com.dg.caw.rules.standard.OnOffState;

/**
 * Conway game of life.
 *
 * Created by timotej on 12/31/16.
 */
public class GameOfLifeRule implements ICellRule<OnOffState> {

    @Override
    public OnOffState nextState(ICell<OnOffState> cell) {
        long onNeighborCount = cell.neighbors().filter(c -> c.state().isOn()).count();

        OnOffState returnValue = null;
        switch(cell.state()) {
            case ON:
                if ( onNeighborCount < 2 ) {
                    returnValue = OnOffState.OFF;
                } else if ( onNeighborCount > 3 ) {
                    returnValue = OnOffState.OFF;
                } else {
                    returnValue = OnOffState.ON;
                }
                break;
            case OFF:
                if ( onNeighborCount == 3 ) {
                    returnValue = OnOffState.ON;
                } else {
                    returnValue = OnOffState.OFF;
                }
                break;
        }
        return returnValue;
    }
}
