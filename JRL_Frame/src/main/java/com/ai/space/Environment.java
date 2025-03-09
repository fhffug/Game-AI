package com.ai.space;

/**
 * 环境
 */
public interface Environment {
	State reset ();

	State step (Action action);
}
