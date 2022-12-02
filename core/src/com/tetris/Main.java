package com.tetris;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.ScreenUtils;

import java.math.BigInteger;

public class Main extends ApplicationAdapter {
	public OrthographicCamera camera;
	public ShapeRenderer shapeRenderer;
	public TetrisGrid grid;
	public TetrisPieceQueue queue;
	public long score;
	public InputManager input;

	@Override
	// big poopoo big poo poo big poo poo big poo poo big poo poo big poo poo
	public void create () {
		this.camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		this.camera.position.set(0,0, 0);
		this.camera.setToOrtho(true);

		this.shapeRenderer = new ShapeRenderer();
		this.shapeRenderer.setProjectionMatrix(camera.combined);

		this.grid = new TetrisGrid();
		this.queue = new TetrisPieceQueue();
		this.score = 0;

		this.input = new InputManager(grid);
		Gdx.input.setInputProcessor(this.input);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);

		this.shapeRenderer.begin(ShapeType.Filled);
		queue.render(this.shapeRenderer);
		grid.render(this.shapeRenderer);
		this.shapeRenderer.end();
	}

	@Override
	public void dispose () {
		shapeRenderer.dispose();
	}
}