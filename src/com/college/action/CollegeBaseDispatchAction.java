package com.college.action;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

public class CollegeBaseDispatchAction extends DispatchAction {

	@Override
	protected ActionForward dispatchMethod(ActionMapping arg0, ActionForm arg1, HttpServletRequest arg2,
			HttpServletResponse arg3, String methodName) throws Exception {
		ActionForward actionForward = null;

		try {
			actionForward = super.dispatchMethod(arg0, arg1, arg2, arg3, methodName);
		} catch (Exception e) {
			actionForward = arg0.findForward("errorPage");
		}
		return actionForward;
	}

}
