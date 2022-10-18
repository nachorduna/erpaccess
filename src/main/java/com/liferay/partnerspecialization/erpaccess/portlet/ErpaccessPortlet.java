package com.liferay.partnerspecialization.erpaccess.portlet;

import com.liferay.partnerspecialization.erpaccess.constants.ErpaccessPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.css-class-wrapper=erpaccess",
		"com.liferay.portlet.header-portlet-css=/css/custom.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Erpaccess",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ErpaccessPortletKeys.ERPACCESS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ErpaccessPortlet extends MVCPortlet {
}