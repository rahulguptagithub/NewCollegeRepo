<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<div id="studentAddressInfoDivId">
	<table>
		<tr>
			<td colspan="8" align="center">Correspondence
					Address</td>
		</tr>
		<tr>
			<td colspan="8"><hr color="green"></td>
		</tr>

		<tr>
			<td colspan="8" style="width: 100%;">
				<table class="commontable" style="width: 100%;">
					<tr>
						<td>Name/CO</td>
						<td><html:text property="co"
								styleClass="textbox_normal width135"></html:text></td>
						<td>Village</td>
						<td><html:text property="village"
								styleClass="textbox_normal width135">
							</html:text></td>
					</tr>



					<tr>
						<td>Post Office</td>
						<td><html:text property="po"
								styleClass="textbox_normal width135"></html:text></td>
						<td>Police Station</td>
						<td><html:text property="ps"
								styleClass="textbox_normal width135"></html:text></td>
					</tr>

					<tr>
						<td>District</td>
						<td><html:text property="district"
								styleClass="textbox_normal width135"></html:text></td>
						<td>Phone</td>
						<td><html:text property="phone"
								styleClass="textbox_normal width135"></html:text></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan="8"><hr color="#ff9933"></td>
		</tr>
		<tr>
			<td colspan="3" align="center">Permanent
					Address</td>
			<td align="center"><html:checkbox property="permanentAdd"
					value="same" styleId="permanentAddId"></html:checkbox></td>
		</tr>

		<tr>
			<td colspan="8"><hr color="green"></td>
		</tr>

		<tr>
			<td colspan="8" style="width: 100%;">
				<table class="commontable" style="width: 100%;">
					<tr>
						<td>Name/CO</td>
						<td><html:text property="pCo" styleId="pCoId"
								styleClass="textbox_normal width135"></html:text></td>
						<td>Village</td>
						<td><html:text property="pVillage" styleId="pVillageId"
								styleClass="textbox_normal width135"></html:text></td>
					</tr>

					<tr>
						<td>Post Office</td>
						<td><html:text property="pPo" styleId="pPoId"
								styleClass="textbox_normal width135"></html:text></td>
						<td>Police Station</td>
						<td><html:text property="pPs" styleId="pPsId"
								styleClass="textbox_normal width135"></html:text></td>
					</tr>

					<tr>
						<td>District</td>
						<td><html:text property="pDistrict" styleId="pDistrictId"
								styleClass="textbox_normal width135"></html:text></td>
						<td>Phone</td>
						<td><html:text property="pPhone" styleId="pPhoneId"
								styleClass="textbox_normal width135"></html:text></td>
					</tr>
				</table>
	</table>
</div>