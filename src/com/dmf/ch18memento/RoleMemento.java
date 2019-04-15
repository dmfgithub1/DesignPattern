package com.dmf.ch18memento;
/**
 * 
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 备忘录类
 */
public class RoleMemento {

	private int hp;  //血量
	private int mp;  //蓝量
	private int exp; //经验值
	private int attack; //攻击力
	
	public RoleMemento(int hp,int mp,int exp,int attack) {
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.attack = attack;
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
}
