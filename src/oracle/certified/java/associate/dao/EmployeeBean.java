package oracle.certified.java.associate.dao;


import java.io.Serializable;

public class EmployeeBean implements Serializable{
 
 private String empId=null;
 private String empName=null;
 private String empAddr=null;
 private String empEmail=null;
 private String empPhone=null;
 
 public EmployeeBean()
 {
  
 }
 public EmployeeBean(String empId,String empName,String empAddr,String empEmail,String empPhone)
 {
  this.empId=empId;
  this.empName=empName;
  this.empAddr=empAddr;
  this.empEmail=empEmail;
  this.empPhone=empPhone;
  
 }
 public String getEmpId() {
  return empId;
 }
 public void setEmpId(String empId) {
  this.empId = empId;
 }
 public String getEmpName() {
  return empName;
 }
 public void setEmpName(String empName) {
  this.empName = empName;
 }
 public String getEmpAddr() {
  return empAddr;
 }
 public void setEmpAddr(String empAddr) {
  this.empAddr = empAddr;
 }
 public String getEmpEmail() {
  return empEmail;
 }
 public void setEmpEmail(String empEmail) {
  this.empEmail = empEmail;
 }
 public String getEmpPhone() {
  return empPhone;
 }
 public void setEmpPhone(String empPhone) {
  this.empPhone = empPhone;
 }
 
 
}

