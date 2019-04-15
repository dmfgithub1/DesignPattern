package com.dmf.ch18memento;

public class MementoMain {

	public static void main(String[] args) {
		GameRole role = new GameRole();
		role.showState();
		
		RoleCaretake caretake = new RoleCaretake();
		caretake.setMemento(role.saveState());
		
		role.fight();
		role.showState();
		
		System.out.println("读取存档：");
		role.loadState(caretake.getMemento());
		role.showState();
		
	}
}
