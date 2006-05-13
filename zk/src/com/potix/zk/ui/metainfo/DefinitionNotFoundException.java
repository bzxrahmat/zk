/* DefinitionNotFoundException.java

{{IS_NOTE
	$Id: DefinitionNotFoundException.java,v 1.2 2006/02/27 03:54:53 tomyeh Exp $
	Purpose:
		
	Description:
		
	History:
		Sun Jun  5 12:05:40     2005, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2004 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package com.potix.zk.ui.metainfo;

import com.potix.zk.ui.UiException;

/**
 * Dentoes a definition cannot be found.
 *
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 * @version $Revision: 1.2 $ $Date: 2006/02/27 03:54:53 $
 */
public class DefinitionNotFoundException extends UiException {
	public DefinitionNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	public DefinitionNotFoundException(String s) {
		super(s);
	}
	public DefinitionNotFoundException(Throwable cause) {
		super(cause);
	}
	public DefinitionNotFoundException() {
	}

	public DefinitionNotFoundException(int code, Object[] fmtArgs, Throwable cause) {
		super(code, fmtArgs, cause);
	}
	public DefinitionNotFoundException(int code, Object fmtArg, Throwable cause) {
		super(code, fmtArg, cause);
	}
	public DefinitionNotFoundException(int code, Object[] fmtArgs) {
		super(code, fmtArgs);
	}
	public DefinitionNotFoundException(int code, Object fmtArg) {
		super(code, fmtArg);
	}
	public DefinitionNotFoundException(int code, Throwable cause) {
		super(code, cause);
	}
	public DefinitionNotFoundException(int code) {
		super(code);
	}
}
