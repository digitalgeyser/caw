package com.dg.caw.rules.standard;

import com.dg.caw.model.ICellState;

/**
 * Simple on off state as used by many automata.
 *
 * Created by timotej on 12/31/16.
 */
public enum OnOffState implements ICellState {
    ON,
    OFF;

    public boolean isOn() { return this == ON; }
    public boolean isOff() { return this == OFF; }
}
