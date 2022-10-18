<%@ include file="/init.jsp" %>

<%
     
     java.util.Map<String, String> env = System.getenv();
     String userName = env.get("ERP_USER");
     String erpHost = env.get("ERP_HOST_IP");
 %>
 
<div>
     <p class="caption">
         LOGIN FORM for ERP Host: <b> <%= erpHost%></b>
     </p>
     <aui:input name="User" value="<%= userName%>" readonly="true">
		<aui:validator name="required" />
	  </aui:input>
      
      <aui:input name="Password" type="password" value="">
		<aui:validator name="required" />
	  </aui:input>
	  <aui:button-row>
					<aui:button type="submit" value="sign-in" />
				</aui:button-row>
 
 </div>
 
