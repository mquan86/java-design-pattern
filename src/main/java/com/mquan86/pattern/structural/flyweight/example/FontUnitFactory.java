package com.mquan86.pattern.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class FontUnitFactory {
    private Map<Character, FontUnit> fontUnits = new HashMap<>();

    public FontUnit get(Character ch) {
        FontUnit fontUnit = fontUnits.get(ch);
        if (fontUnit == null) {
            fontUnit = new FontCharacter(ch); // In fact it should be a complex initialize and
                                              // loading font here.
            fontUnits.put(ch, fontUnit);
        }
        return fontUnit;
    }
}
