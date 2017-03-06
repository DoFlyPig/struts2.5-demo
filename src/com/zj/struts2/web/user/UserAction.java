package com.zj.struts2.web.user;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public String list() {

		System.out.println("list.....");
		System.out.println("git");
		System.out.println("git");
		System.out.println("git");
		System.out.println("git");
		System.out.println("github");
		System.out.println("git...hub");
		System.out.println("abc....");
		System.out.println("git...hub");
		System.out.println("git...hub");
		System.out.println("git...hub");
		System.out.println("git...hub");
		System.out.println("git...hub");
		System.out.println("git...hub");
		System.out.println("BBBBBBBBBBBBBB");
		System.out.println("git...hub");
		System.out.println("git...hubAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		return "list";
	}
	
	@Action(value = "/add", results = { @Result(
				name="baidu",location="http://www.baidu.com",type="redirect"
			)})
	public String add() {
		System.out.println("baidu..");
		return "baidu";
	}

}
