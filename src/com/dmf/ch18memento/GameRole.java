package com.dmf.ch18memento;

/**
 * 
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 游戏角色类，备忘录模式的Originator(发起人)角色
 */
public class GameRole {

	private int hp = 100;  //血量
	private int mp = 100;  //蓝量
	private int exp = 0; //经验值
	private int attack = 10; //攻击力
	
	public RoleMemento saveState() {
		return new RoleMemento(hp, mp, exp, attack);
	}
	public void loadState(RoleMemento memento) {
		this.hp = memento.getHp();
		this.mp = memento.getMp();
		this.exp = memento.getExp();
		this.attack = memento.getAttack();
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void showState() {
		System.out.println("hp:"+this.hp);
		System.out.println("mp:"+this.mp);
		System.out.println("exp:" + this.exp);
		System.out.println("attack" + this.attack);
	}
	
	public void fight() {
		System.out.println("遇到Boss，开始战斗!");
		this.hp = 0;
		this.mp = 80;
		this.exp = 0;
		System.out.println("战斗失败！");
	}
	
}
