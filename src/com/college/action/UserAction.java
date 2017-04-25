package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.exception.AuthorizationException;
import com.college.form.UserForm;

public class UserAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = "";
		UserForm userForm = (UserForm) form;
		String userName =(String) request.getSession().getAttribute("userName");
		CLGDao CLGDao = new CLGDaoImpl();
		System.out.println("role \t"
				+ (String) request.getSession().getAttribute("role"));
		if ("admin".equalsIgnoreCase((String) request.getSession()
				.getAttribute("role"))) {
			if (CLGDao.createUser(userForm, userName)) {
				result = "sucess";
				request.setAttribute("message", "User Created Successfully");
			}
			} else {
			throw new AuthorizationException();
		}
		System.out.println("Exitig method with response " + result);
		return mapping.findForward(result);
	}
}

