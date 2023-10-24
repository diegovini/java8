package java8;

import java8.enums.ColorEnum;

public class Apple {
	private Integer weight;
	private ColorEnum color;
	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public ColorEnum getColor() {
		return color;
	}
	public void setColor(ColorEnum color) {
		this.color = color;
	}
	public Apple() {
	
	}
	
	public Apple(Integer weight) {
		this.weight= weight;
	}
}
