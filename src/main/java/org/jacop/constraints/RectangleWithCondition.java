/**
 *  RectangleWithCondition.java 
 *  This file is part of JaCoP.
 *
 *  JaCoP is a Java Constraint Programming solver. 
 *	
 *	Copyright (C) 2000-2008 Krzysztof Kuchcinski and Radoslaw Szymanek
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  Notwithstanding any other provision of this License, the copyright
 *  owners of this work supplement the terms of this License with terms
 *  prohibiting misrepresentation of the origin of this work and requiring
 *  that modified versions of this work be marked in reasonable ways as
 *  different from the original version. This supplement of the license
 *  terms is in accordance with Section 7 of GNU Affero General Public
 *  License version 3.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.jacop.constraints;

import java.util.ArrayList;

import org.jacop.core.IntVar;

/**
 * Defines a rectangle used in the diffn constraint.
 * 
 * @author Krzysztof Kuchcinski and Radoslaw Szymanek
 * @version 4.3
 */

class RectangleWithCondition extends Rectangle {

	IntVar c;

	int index = 0;

	public RectangleWithCondition(int i, 
								  ArrayList<? extends IntVar> R,
								  IntVar cond) {
		super(R);
		c = cond;
		index = i;
	}

	public RectangleWithCondition(int i, IntVar[] R, IntVar cond) {
		super(R);
		c = cond;
		index = i;
	}

	public RectangleWithCondition(int i, Rectangle R, IntVar cond) {
		super(R);
		c = cond;
		index = i;
	}

	public IntVar condition() {
		return c;
	}

	@Override
	public String toString() {
		String S = "[" + index + ", ";
		S = S + toString();
		S = S + ", " + c + "]";
		return S;
	}
}
