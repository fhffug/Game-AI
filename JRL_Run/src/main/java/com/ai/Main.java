package com.ai;

import com.ai.game.Maze;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	@SneakyThrows
	public static void main (String[] args) {
		new Maze();
	}

}