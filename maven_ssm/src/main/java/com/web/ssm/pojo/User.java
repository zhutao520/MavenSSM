package com.web.ssm.pojo;

public class User {
	
	 private Integer id;
	    private String user_name;
	    private String password;
	    private int age;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	
		public User(Integer id, String user_name, String password, int age) {
			super();
			this.id = id;
			this.user_name = user_name;
			this.password = password;
			this.age = age;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", user_name=" + user_name
					+ ", password=" + password + ", age=" + age + "]";
		}
	

}
