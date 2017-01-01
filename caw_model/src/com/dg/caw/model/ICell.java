package com.dg.caw.model;

import java.util.stream.Stream;

/**
 * Basic cell.
 *
 * Created by timotej on 12/31/16.
 */
public interface ICell <T extends ICellState> {

    /**
     * Returns the current state of this cell.
     * @return
     */
    T state();

    /**
     * Returns the stream over all the neighbors.
     * @return
     */
    Stream<ICell<T>> neighbors();
}
