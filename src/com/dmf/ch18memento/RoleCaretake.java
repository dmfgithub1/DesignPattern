package com.dmf.ch18memento;
/**
 * 
 * @author: dmf
 * @date: 2019年4月15日
 * @description: Caretake(管理者)角色，负责保存备忘录，但是不能操作备忘录
 */
public class RoleCaretake {

	private RoleMemento memento;

	public RoleMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleMemento memento) {
		this.memento = memento;
	}
	
}
