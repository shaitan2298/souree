<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c" %>
<html>
<head>
<style>
body{
background-color: #D0D3D4 ;}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
td{
align-self:center;
font-size: medium;
font-family:sans-serif;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: medium;
  font-family: inherit;
}

input[type=submit]:hover {
  background-color: #45a049;
}
a{
font-family: sans-serif;
font-size: medium;}
div {
  border-radius: 5px;
  background-color:#45a049;
  padding: 20px;
}
</style>
</head>
<div align="center">
<form name="getAssociateDetails" action="allAssociateDetails" method="post">
	<table>
  <tr>
    <td>First Name</td>
    <td>Last Name</td>
    <td>Yearly Investment under 80C</td>
    <td>Department</td>
    <td>Designation</td>
    <td>Pan Card</td>
    <td>Email Id</td>
    <td>Basic Salary</td>
    <td>EPF</td>
    <td>Company PF</td>
    <td>Account Number</td>
    <td>Bank Name</td>
    <td>IFSC code</td>
    <td>HRA</td>
    <td>Personal Allowance</td>
    <td>Conveyance Allowance</td>
    <td> Other Allowance</td>
    <td>Gross Salary</td>
    <td>  Monthly Tax</td>
      <td> Net Salary</td>
  </tr>
<c:forEach var="associate" items="${requestScope.associate}">
<tr>
<td>${associate.firstName}</td>
<td>${associate.lastName}</td>
<td>${associate. yearlyInvestmentUnder80C}</td>
<td>${associate.department}</td>
<td>${associate.designation}</td>
<td>${associate.pancard}</td>
<td>${associate.emailId}</td>
<td>${associate.salary.basicSalary}</td>
<td>${associate.salary.epf}</td>
<td>${associate.salary.companyPf}</td>
<td>${associate.bankDetails.accountNumber}</td>
<td>${associate.bankDetails.bankName}</td>
<td>${associate.bankDetails.ifscCode}</td>
<td>${associate.salary.hra}</td>
<td>${associate.salary.personalAllowance}</td>
<td>${associate.salary.conveyenceAllowance}</td>
<td>${associate.salary.otherAllowance}</td>
<td>${associate.salary.grossSalary}</td>
<td>${associate.salary.monthlyTax}</td>
<td>${associate.salary.netSalary}</td>
</tr>
</c:forEach>
</table>
</form>
</div>
</body>
</html>