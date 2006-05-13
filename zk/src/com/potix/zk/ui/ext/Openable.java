/* Openable.java

{{IS_NOTE
	$Id: Openable.java,v 1.1 2006/03/31 03:20:44 tomyeh Exp $
	Purpose:
		
	Description:
		
	History:
		Fri Jul  8 16:57:56     2005, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2005 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package com.potix.zk.ui.ext;

/**
 * Used to decorate a {@link com.potix.zk.ui.Component} object that
 * it allows users to change its open status from the client.
 *
 * <p>{@link com.potix.zk.ui.event.OpenEvent} will be sent wih name as "onOpen"
 * <b>after</b> {@link #setOpenByClient} is called
 * to notify application developers that it is called by user
 * (rather than by codes).
 * 
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 * @version $Revision: 1.1 $ $Date: 2006/03/31 03:20:44 $
 * @see com.potix.zk.ui.event.OpenEvent
 */
public interface Openable {
	/** Sets the open state caused by client's operation.
	 * <p>This method is designed to be used by engine.
	 * Don't invoke it directly. Otherwise, the client and server
	 * might mismatch.
	 */
	public void setOpenByClient(boolean open);
}
