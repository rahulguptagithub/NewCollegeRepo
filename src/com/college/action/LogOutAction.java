package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogOutAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession httpSession = request.getSession(true);
		httpSession.setAttribute("userName", null);
		httpSession.invalidate();
		//System.out.println("after invalidating the session\t"+httpSession.getAttribute("userName"));
		return mapping.findForward("success");
	}

}
