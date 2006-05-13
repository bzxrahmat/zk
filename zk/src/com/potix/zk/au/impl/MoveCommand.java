/* MoveCommand.java

{{IS_NOTE
	$Id: MoveCommand.java,v 1.5 2006/03/31 03:20:37 tomyeh Exp $
	Purpose:
		
	Description:
		
	History:
		Sun Oct  2 13:30:25     2005, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2004 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package com.potix.zk.au.impl;

import com.potix.lang.Objects;

import com.potix.zk.mesg.MZk;
import com.potix.zk.ui.Component;
import com.potix.zk.ui.UiException;
import com.potix.zk.ui.event.Events;
import com.potix.zk.ui.event.MoveEvent;
import com.potix.zk.ui.ext.Moveable;
import com.potix.zk.au.AuRequest;

/**
 * Used only by {@link AuRequest} to implement the {@link MoveEvent}
 * relevant command.
 * 
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 * @version $Revision: 1.5 $ $Date: 2006/03/31 03:20:37 $
 */
public class MoveCommand extends AuRequest.Command {
	public MoveCommand(String evtnm, boolean skipIfEverError) {
		super(evtnm, skipIfEverError);
	}

	//-- super --//
	protected void process(AuRequest request) {
		final Component comp = request.getComponent();
		if (comp == null)
			throw new UiException(MZk.ILLEGAL_REQUEST_COMPONENT_REQUIRED, this);
		final String[] data = request.getData();
		if (data == null || data.length != 2)
			throw new UiException(MZk.ILLEGAL_REQUEST_WRONG_DATA,
				new Object[] {Objects.toString(data), this});

		final Moveable move = (Moveable)comp;
		move.setLeftByClient(data[0]);
		move.setTopByClient(data[1]);
		Events.postEvent(new MoveEvent(getId(), comp, data[0], data[1]));
	}
}
