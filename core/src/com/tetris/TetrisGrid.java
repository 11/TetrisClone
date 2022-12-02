package com.tetris;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.tetris.tetrominoes.Piece;
import com.tetris.tetrominoes.TPiece;

public class TetrisGrid {
    private final int TILE_SIZE = Gdx.graphics.getHeight() / 20;
    private final int width = 10;
    private final int height = 20;
    private final int[][] grid = new int[this.width][this.height];
    private Piece activePiece;

    public TetrisGrid() {
        this.activePiece = new TPiece();
    }

    public void insertPiece(Piece piece) {

    }

    public void rotateActivePieceLeft() {
        this.activePiece.rotateLeft(this);
    }

    public void rotateActivePieceRight() {
        this.activePiece.rotateRight(this);
    }

    public void moveActivePieceLeft() {
        this.activePiece.moveLeft(this);
    }

    public void moveActivePieceRight() {
        this.activePiece.moveRight(this);
    }

    public void slameActivePiece() {

    }

    public int getValue(int x, int y) {
        return this.grid[x][y];
    }

    private void renderLines(ShapeRenderer shapeRenderer) {
        // vertical lines
        for (int i = 0; i < this.width + 1; i++) {
            shapeRenderer.rectLine(i * TILE_SIZE + 1, 0, i * TILE_SIZE, Gdx.graphics.getHeight(), 1, Color.WHITE, Color.WHITE);
        }

        // horizontal lines
        for (int i = 0; i < this.height; i++) {
            shapeRenderer.rectLine(0,i * TILE_SIZE,10 * TILE_SIZE,i * TILE_SIZE,1,Color.WHITE,Color.WHITE);
        }
    }

    public void render(ShapeRenderer shapeRenderer) {
        this.renderLines(shapeRenderer);
    }
}