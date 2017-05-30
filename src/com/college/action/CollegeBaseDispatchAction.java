package com.college.action;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

public class CollegeBaseDispatchAction extends DispatchAction {

	@Override
	protected ActionForward dispatchMethod(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res, String methodName) throws Exception {
		ActionForward actionForward = null;

		try {
			actionForward = super.dispatchMethod(mapping, form, req, res, methodName);
		} catch (Exception e) {
			actionForward = mapping.findForward("errorPage");
		}
		return actionForward;
	}

}
