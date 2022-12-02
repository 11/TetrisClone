package com.tetris;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class InputManager implements InputProcessor {
    private TetrisGrid grid;

    public InputManager(TetrisGrid grid) {
        this.grid = grid;
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.UP) {
            this.grid.slameActivePiece();
            return true;
        }

        if (keycode == Input.Keys.LEFT) {
            this.grid.moveActivePieceLeft();
            return true;
        }

        if (keycode == Input.Keys.RIGHT) {
            this.grid.moveActivePieceRight();
            return true;
        }

        if (keycode == Input.Keys.Z) {
            this.grid.rotateActivePieceLeft();
            return true;
        }

        if (keycode == Input.Keys.X) {
            this.grid.rotateActivePieceRight();
            return true;
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
