package com.roman14.db.info;

/**
 * <b>JDBC 드라이버 클래스네입 Enumeration</b>
 * <pre>
 *  - JDBC 드라이버 클래스 로드를 위한 클래스네임 집합
 * </pre>
 * @author MDH
 * @since 2021. 6. 16.
 */
public enum JDBCDriver
{
  ORACLE("oracle,jdbc,driver,OracleDriver"),
  MYSQL("com.mysql.jdbc.Driver"),
  MARIADB("org.mariadb.jdbc.Driver"),
  TIBERO("com.tmax.tibero.jdbc.TbDriver");

  private final String name;

  JDBCDriver(String name)
  {
    this.name = name;
  }

  private String getName()
  {
    return this.name;
  }

}