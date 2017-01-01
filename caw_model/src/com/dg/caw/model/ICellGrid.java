package com.dg.caw.model;

import java.util.stream.Stream;

/**
 * Entire world of cells is represented in this.
 *
 * Created by timotej on 12/31/16.
 */
public interface ICellGrid<T extends ICellRule> {
    Stream<ICell> cells();
}
