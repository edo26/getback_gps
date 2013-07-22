/**
 * Class for formatting latitude.
 *
 * Copyright (C) 2012-2013 Dieter Adriaenssens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @package org.ruleant.ariadne
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
package org.ruleant.ariadne;

/**
 * Class for formatting latitude.
 *
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
public class Latitude extends AbstractGeoCoordinate{
    /**
     * Segment North
     */
    public static final int SEGMENT_NORTH = 1;

    /**
     * Segment North upper limit
     */
    public static final double SEGMENT_NORTH_HIGH = 90;

    /**
     * Segment North lower limit
     */
    public static final double SEGMENT_NORTH_LOW = 0;

    /**
     * Segment South
     */
    public static final int SEGMENT_SOUTH = 2;

    /**
     * Segment South upper limit
     */
    public static final double SEGMENT_SOUTH_HIGH = 0;

    /**
     * Segment South lower limit
     */
    public static final double SEGMENT_SOUTH_LOW = -90;

    /**
     * Constructor.
     *
     * @param newValue New value for unformatted value.
     */
    public Latitude(final double newValue) {
        super(newValue);
    }

    /**
     * Determine value segment, North if latitude is in the range 0..90,
     * South if latitude is in the range -90..0.
     *
     * @return segment code : SEGMENT_NORTH or SEGMENT_SOUTH
     */
    public final int getSegment() {
        return 0;
    }

    /**
     * Get segment unit, N for SEGMENT_NORTH, S for SEGMENT_SOUTH.
     *
     * @return unit
     */
    public final String getSegmentUnit() {
        return null;
    }
}
