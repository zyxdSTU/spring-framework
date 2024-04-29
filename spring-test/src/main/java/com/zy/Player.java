package com.zy;

import org.springframework.stereotype.Component;

/**
 * @author zhouyu
 * @create 2023-11-23 10:04
 */
@Component
public class Player implements IPlayer{

	@Override
	public void play() {
		System.out.println("play");
	}
}
