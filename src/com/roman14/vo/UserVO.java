package com.roman14.vo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <b>인사정보 연계용 사용자 변경사항 테이블</b>
 * <pre>
 *   VW_HR_TRAN_TARGET
 * </pre>
 * @author
 * @since 2021. 6. 16.
 */
public class UserVO implements Serializable, Cloneable
{
  private static final long serialVersionUID = 4414853185202781991L;

  protected String userId = "";
  protected String userName = "";
  protected String deptCode = "";
  protected String position = "";
  protected String grade = "";
  protected transient String beforeDeptCode = "";
  protected transient String afterDeptCode = "";
  protected transient String deptFullName = "";

  public String getUserId()
  {
    return userId;
  }

  public void setUserId(String userId)
  {
    this.userId = userId;
  }

  public String getUserName()
  {
    return userName;
  }

  public void setUserName(String userName)
  {
    this.userName = userName;
  }

  public String getDeptCode()
  {
    return deptCode;
  }

  public void setDeptCode(String deptCode)
  {
    this.deptCode = deptCode;
  }

  public String getPosition()
  {
    return position;
  }

  public void setPosition(String position)
  {
    this.position = position;
  }

  public String getGrade()
  {
    return grade;
  }

  public void setGrade(String grade)
  {
    this.grade = grade;
  }

  public String getBeforeDeptCode()
  {
    return beforeDeptCode;
  }

  public void setBeforeDeptCode(String beforeDeptCode)
  {
    this.beforeDeptCode = beforeDeptCode;
  }

  public String getAfterDeptCode()
  {
    return afterDeptCode;
  }

  public void setAfterDeptCode(String afterDeptCode)
  {
    this.afterDeptCode = afterDeptCode;
  }

  public String getDeptFullName()
  {
    return deptFullName;
  }

  public void setDeptFullName(String deptFullName)
  {
    this.deptFullName = deptFullName;
  }

  @Override
  public String toString()
  {
    return "UserVO{" +
     "userId='" + userId + '\'' +
     ", userName='" + userName + '\'' +
     ", deptCode='" + deptCode + '\'' +
     ", position='" + position + '\'' +
     ", grade='" + grade + '\'' +
     ", beforeDeptCode='" + beforeDeptCode + '\'' +
     ", afterDeptCode='" + afterDeptCode + '\'' +
     ", deptFullName='" + deptFullName + '\'' +
     '}';
  }

  @Override
  public boolean equals(Object obj)
  {
    if(obj == this) return true;
    if(!(obj instanceof UserVO)) return false;

    // In order of frequent use. for performance.
    return (this.deptCode.equals( ((UserVO)obj).getDeptCode() ) )                   &&
     (this.grade.equals( ((UserVO)obj).getGrade() ) )                         &&
     (this.position.equals( ((UserVO)obj).getPosition() ) )                   &&
     (this.userName.equals( ((UserVO)obj).getUserName() ) )                   &&
     (this.userId.equals( ((UserVO)obj).getUserId() ) );
//           (this.beforeDeptCode.equals( ((UserVO)obj).getBeforeDeptCode() ) )       &&
//           (this.afterDeptCode.equals( ((UserVO)obj).getAfterDeptCode() ) )         &&
//           (this.deptFullName.equals( ((UserVO)obj).getDeptFullName() ) )           &&
  }

  @Override
  public int hashCode()
  {
    int result =   this.userId.hashCode();
    result += 32 * this.userName.hashCode() + result;
    result += 32 * this.deptCode.hashCode() + result;
    result += 32 * this.position.hashCode() + result;
    result += 32 * this.grade.hashCode()    + result;
//    result += 32 * this.beforeDeptCode.hashCode() + result;
//    result += 32 * this.afterDeptCode.hashCode() + result;
//    result += 32 * this.deptFullName.hashCode() + result;

    return result;
  }

  private void writeObject(ObjectOutputStream oos) throws IOException
  {
    oos.defaultWriteObject();
    oos.writeObject(this.userId);
    oos.writeObject(this.userName);
    oos.writeObject(this.deptCode);
    oos.writeObject(this.position);
    oos.writeObject(this.grade);
//    oos.writeObject(this.beforeDeptCode);
//    oos.writeObject(this.afterDeptCode);
//    oos.writeObject(this.deptFullName);
  }

  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
  {
    ois.defaultReadObject();
    this.userId         = (String)ois.readObject();
    this.userName       = (String)ois.readObject();
    this.deptCode       = (String)ois.readObject();
    this.position       = (String)ois.readObject();
    this.grade          = (String)ois.readObject();
//    this.beforeDeptCode = (String)ois.readObject();
//    this.afterDeptCode  = (String)ois.readObject();
//    this.deptFullName   = (String)ois.readObject();
  }

}