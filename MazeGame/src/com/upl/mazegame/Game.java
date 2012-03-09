package com.upl.mazegame;

import com.badlogic.*;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game implements ApplicationListener {
	private SpriteBatch batch;
	private Texture texture;
	@Override
	public void create() {
		// TODO Auto-generated method stub
		batch = new SpriteBatch();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {

		texture = new Texture(Gdx.files.internal("uplogo.jpg"));
		batch.begin();
		batch.draw(texture, 10, 10);
		batch.end();
		
	  
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
